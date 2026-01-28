package com.paras.rest;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// Assuming your JWT Service is in com.paras.service
import com.paras.service.JWTSservice;

@RestController
public class AuthController {
	
	
    private final AuthenticationManager authManager;
    private final JWTSservice jwtService;
    private final UserDetailsService userDetailsService;
    
    
    
    

    // @Autowired is optional in modern Spring Boot for constructor injection, but included for fidelity to the image
    public AuthController(AuthenticationManager authManager, JWTSservice jwtService, UserDetailsService userDetailsService) {
        this.authManager = authManager;
        this.jwtService = jwtService;
        this.userDetailsService = userDetailsService;
    }

    @PostMapping("/login")
    public String login(@RequestBody AuthRequest request) {
        
        // 1. Authenticate the user credentials using Spring Security's AuthenticationManager
        authManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword())
        );

        // 2. If authentication succeeds, load the UserDetails and generate the token
        UserDetails user = userDetailsService.loadUserByUsername(request.getUsername());
        
        // 3. Return the generated JWT
        return jwtService.generateToken(user.getUsername());
    }

}

// Data Transfer Object (DTO) to capture username and password from the request body
class AuthRequest {
    
    private String username;
    private String password;

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
