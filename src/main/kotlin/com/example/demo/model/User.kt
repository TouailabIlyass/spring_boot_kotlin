package com.example.demo.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class User {
    @Id
    @GeneratedValue
     var id:Int
     var username:String
     var password:String
     var role:String
    constructor() {
        id = 0
        username = ""
        password = ""
        role = ""
    }
    constructor(id:Int, username: String, nom: String, password: String, role: String)
    {
        this.id = id
        this.username = username
        this.password = password
        this.role = role
    }
}