package com.dnakolor.account.service;

import com.dnakolor.account.data.dto.request.GoogleAuthRequestDto;
import com.dnakolor.account.data.dto.request.UsernamePasswordAuthRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface AuthService extends UserDetailsService {
    public ResponseEntity<?> authenticate(UsernamePasswordAuthRequestDto requestDto);
    public ResponseEntity<?> verifyAccount(String token);
    public ResponseEntity<?> sendVerifyToken(String email);
    public ResponseEntity<?> googleAuthenticate(GoogleAuthRequestDto requestDto, String systemKey);
}
