package com.H.IT.IT_support_Service.config;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    private  String nomComplet;
    private  String email;
    private String password;
}
