package com.H.IT.IT_support_Service.Service;

import com.H.IT.IT_support_Service.Auth.AuthRequest;
import com.H.IT.IT_support_Service.Auth.AuthResponse;
import com.H.IT.IT_support_Service.Model.Entity.Personne;
import com.H.IT.IT_support_Service.Model.Entity.Role;
import com.H.IT.IT_support_Service.Repository.PersonneRepository;
import com.H.IT.IT_support_Service.config.JwtService;
import com.H.IT.IT_support_Service.config.RegisterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class PerssoneUserDetailsService implements UserDetailsService {
    @Autowired
    private PersonneRepository personneRepository;
    @Autowired
    private JwtService jwtService;

    @Autowired
    @Lazy
    private AuthenticationManager authenticationManager;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
      Personne personne = personneRepository.findPersonneByEmail(email);
      if (personne==null){
          throw  new UsernameNotFoundException("User not Found Wiith mail :"+email);
      }
        return null;
    }

    public AuthResponse register (RegisterRequest request, Role role){
        var personne = Personne.builder()
                .nomComplet(request.getNomComplet())
                .email(request.getEmail())
                .password(request.getPassword())
                .role(role)
                .build();
        personneRepository.save(personne);
        var jwtToken = jwtService.generateToken(personne);
        return  AuthResponse.builder()
                .acessToken(jwtToken)
                .build();
    }
    public AuthResponse register(RegisterRequest request){
        return  register(request,Role.User);
    }
    public  AuthResponse registerAdmin(RegisterRequest request){
        return register(request,Role.Admin);
    }

    public  AuthResponse registerTech(RegisterRequest request){
        return register(request,Role.Technicien);
    }

    public  AuthResponse authenticate(AuthRequest request){
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(),
                        request.getPassword()
                )
        );
        Personne user=personneRepository.findPersonneByEmail(request.getEmail());
        if (user==null){
            throw new UsernameNotFoundException("User not found with email: " + request.getEmail());

        }
        var jwtToken = jwtService.generateToken(user);
        return  AuthResponse.builder()
                .acessToken(jwtToken)
                .build();
    }
    public AuthResponse authenticateAdmin(AuthRequest request){
        return authenticate(request);
    }
}
