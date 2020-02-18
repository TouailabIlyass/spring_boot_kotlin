package com.example.demo.securityConfig

import com.example.demo.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User,Int> {

     fun findByUsername(username:String): User
}