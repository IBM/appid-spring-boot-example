package com.example.appid;

import java.security.Principal;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
    @RequestMapping("/user")
    public Principal user(@AuthenticationPrincipal Principal principal) {
        // Principal holds the logged in user information.
        // Spring automatically populates this principal object after login.
        return principal;
    }
    
    @RequestMapping("/userInfo")
    public String userInfo(@AuthenticationPrincipal Principal principal) {
        return String.valueOf(principal);
    }
}
