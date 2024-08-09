package com.H.IT.IT_support_Service.Auth;

import lombok.*;

@Getter
@Setter
@Builder @NoArgsConstructor @AllArgsConstructor
public class AuthRequest {
    private  String email;
    private String password;
}
