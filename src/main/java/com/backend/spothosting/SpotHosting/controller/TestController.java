package com.backend.spothosting.SpotHosting.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping("/public")
    public String publicEndpoint() {
        return "This is a public endpoint";
    }

    @GetMapping("/user")
    @PreAuthorize("hasAnyAuthority('USER', 'ADMIN')")
    public String userEndpoint() {
        return "This is a user endpoint";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String adminEndpoint() {
        return "This is an admin endpoint";
    }
}
