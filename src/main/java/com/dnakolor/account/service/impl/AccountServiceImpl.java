package com.dnakolor.account.service.impl;

import com.dnakolor.account.data.dto.request.ChangePasswordRequestDto;
import com.dnakolor.account.data.dto.request.GoogleAuthRequestDto;
import com.dnakolor.account.data.dto.request.RegisterRequestDto;
import com.dnakolor.account.data.dto.request.UsernamePasswordAuthRequestDto;
import com.dnakolor.account.service.AccountService;
import com.dnakolor.account.service.AuthService;
import com.dnakolor.account.utils.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService, AuthService {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtUtils jwtUtils;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public ResponseEntity<?> changePassword(String accountId, ChangePasswordRequestDto requestDto) {
        return null;
    }

    @Override
    public ResponseEntity<?> register(RegisterRequestDto requestDto, String systemKey) {
        return null;
    }

    @Override
    public ResponseEntity<?> authenticate(UsernamePasswordAuthRequestDto requestDto) {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(requestDto.getUsername(), requestDto.getPassword()));
        }
        catch (Exception ex) {
            throw ex;
        }

        String jwt = jwtUtils.generateToken(requestDto.getUsername());
        return ResponseEntity.ok(jwt);
    }

    @Override
    public ResponseEntity<?> verifyAccount(String token) {
        return null;
    }

    @Override
    public ResponseEntity<?> sendVerifyToken(String email) {
        return null;
    }

    @Override
    public ResponseEntity<?> googleAuthenticate(GoogleAuthRequestDto requestDto, String systemKey) {
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
