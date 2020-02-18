package com.example.demo.securityConfig

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service
import org.springframework.security.core.userdetails.UserDetailsService as UserDetailsService

@Service
class AppUsersDetailsService: UserDetailsService {

    @Autowired
    lateinit  var repo:UserRepository

    override fun loadUserByUsername(username:String):User {
        val user:com.example.demo.model.User = repo.findByUsername(username)
        if(user == null)  throw  UsernameNotFoundException("user not found !!!!")
        val userp:UserPrincipal = UserPrincipal(user)
        val user_details:User = User(user.username,user.password,userp.authorities)
        return  user_details
    }
}