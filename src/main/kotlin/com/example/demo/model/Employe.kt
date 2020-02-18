package com.example.demo.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id


@Entity
data class Employe(@Id @GeneratedValue var id:Int=0, var nom:String="", var prenom:String="", var salaire:Float=0.0f) {
}