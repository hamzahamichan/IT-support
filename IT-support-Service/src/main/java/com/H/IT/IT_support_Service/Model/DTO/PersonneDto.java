package com.H.IT.IT_support_Service.Model.DTO;
import com.H.IT.IT_support_Service.Model.Entity.Personne;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class PersonneDto {
    private int id_per;
    private String nomComplet;
    private String email;
    private String password;
    private static PersonneDto toDto(Personne per){
        return PersonneDto.builder()
                .id_per(per.getId_per())
                .nomComplet(per.getNomComplet())
                .email(per.getEmail())
                .password(per.getPassword())
                .build();
    }
}
