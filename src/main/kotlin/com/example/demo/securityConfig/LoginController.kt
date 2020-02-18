package com.example.demo.securityConfig

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
class LoginController {

    @RequestMapping("/login",method = arrayOf(RequestMethod.GET))
    fun login(): String? {
        return "login.jsp"
    }

    @RequestMapping("/logout")
    fun logout(): String? {
        return "logout.jsp"
    }
}