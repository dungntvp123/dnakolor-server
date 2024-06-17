package com.dnakolor.account.utils;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

@Component
public class GoogleUtils {
    private String CLIENT_ID;
    public Map<String, Object> getUserInfo(String idTokenString) throws GeneralSecurityException, IOException {
        Map<String, Object> map = new HashMap<>();
        return map;
    }
}
