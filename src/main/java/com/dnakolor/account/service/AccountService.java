package com.dnakolor.account.service;

import com.dnakolor.account.data.dto.request.ChangePasswordRequestDto;
import com.dnakolor.account.data.dto.request.RegisterRequestDto;
import org.springframework.http.ResponseEntity;

public interface AccountService {
    public ResponseEntity<?> changePassword(String accountId, ChangePasswordRequestDto requestDto);
    public ResponseEntity<?> register(RegisterRequestDto requestDto, String systemKey);

}
