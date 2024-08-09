package com.H.IT.IT_support_Service.Auth;

import com.H.IT.IT_support_Service.Service.PerssoneUserDetailsService;
import com.H.IT.IT_support_Service.config.RegisterRequest;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {
    private final PerssoneUserDetailsService  service;

    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest request){
        return ResponseEntity.ok(service.register(request));
    }
    @PostMapping("/authenticate")
    public ResponseEntity<AuthResponse>aurthenticate(@RequestBody AuthRequest request){
        return  ResponseEntity.ok(service.authenticate(request));
    }
}
