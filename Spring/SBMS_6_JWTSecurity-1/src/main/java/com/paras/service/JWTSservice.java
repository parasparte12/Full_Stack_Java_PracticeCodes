
///////////////////////////////////// copy this class as it is where needed///////////////////////////////////////
package com.paras.service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import java.security.Key;
import java.util.Date;
import javax.crypto.SecretKey;

import org.springframework.stereotype.Service;

@Service
public class JWTSservice {
	
	//Create Token
	//Validate Token
	//Token is Expire or not 

    private static final String SECRET_KEY = "ParasPartedvjhbdvd cjdbfiudbcid cdjkcbcuhdgiodhcoaehfe dbco9efgch0pehdoaqbdaqwsdwq wedwdwd";

    private SecretKey getSigningKey() {
        // Creates proper HMAC key
        return Keys.hmacShaKeyFor(SECRET_KEY.getBytes());
    }

    public String generateToken(String username) {
        return Jwts.builder()
                .subject(username)
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60)) // 1 hour expiration
                .signWith(getSigningKey())
                .compact();
    }

    public String extractUsername(String token) {
        return Jwts.parser()
                .verifyWith(getSigningKey())
                .build()
                .parseSignedClaims(token)
                .getPayload()
                .getSubject();
    }

    public boolean isTokenValid(String token, String username) {
        final String extractedUsername = extractUsername(token);
        return extractedUsername.equals(username) && !isTokenExpired(token);
    }

    private boolean isTokenExpired(String token) {
        return Jwts.parser()
                .verifyWith(getSigningKey())
                .build()
                .parseSignedClaims(token)
                .getPayload()
                .getExpiration()
                .before(new Date());
    }
}
