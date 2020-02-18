package com.example.demo.model

class User {
     var username:String
     var nom:String
     var prenom:String
    constructor() {
        username = ""
        nom = ""
        prenom = ""
    }
    constructor(username: String, nom: String, prenom: String, prenom1: String)
    {
        this.username = username
        this.nom = nom
        this.prenom = prenom
    }
}