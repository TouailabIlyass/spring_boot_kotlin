package com.example.demo.securityConfig

import com.example.demo.model.User
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import java.util.Collections

class UserPrincipal : UserDetails {

    var user:User
    constructor(user:User) { this.user = user }

    override fun getAuthorities(): MutableCollection<out GrantedAuthority> {
        return Collections.singleton(SimpleGrantedAuthority(user.role));
    }

    override fun isEnabled(): Boolean {
        return true
    }

    override fun getUsername(): String {
return user.username    }

    override fun isCredentialsNonExpired(): Boolean {
return true    }

    override fun getPassword(): String {
return user.password   }

    override fun isAccountNonExpired(): Boolean {
return true    }

    override fun isAccountNonLocked(): Boolean {
return true    }
}