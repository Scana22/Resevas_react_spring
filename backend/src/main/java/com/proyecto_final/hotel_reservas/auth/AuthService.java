package com.proyecto_final.hotel_reservas.auth;

import com.proyecto_final.hotel_reservas.jwt.JwtService;
import com.proyecto_final.hotel_reservas.model.Role;
import com.proyecto_final.hotel_reservas.model.Usuario;
import com.proyecto_final.hotel_reservas.repository.UsuarioRepository;


import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UsuarioRepository usuarioRepository;
    private final JwtService jwtService;

    public AuthResponse login(LogginRequest logginRequest) {
        throw new UnsupportedOperationException("Unimplemented method 'login'");
    }

    public AuthResponse register(RegisterRequest registerRequest) {
        Usuario usuario = Usuario.builder()
            .username(registerRequest.getUsername())
            .password(registerRequest.getPassword())
            .email(registerRequest.getEmail())
            .role(Role.USER)
            .build();

        usuarioRepository.save(usuario);
        return AuthResponse.builder()
            .token(jwtService.getToken(usuario))
            .build();
        
    }

}
