package com.example.demo.Controller

import com.example.demo.model.Employe
import com.example.demo.repository.EmployeRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class EmployeController {

    @Autowired
    lateinit var repo:EmployeRepository
    @GetMapping("/")
    fun home():String
    {
        return "spring boot from kotlin"
    }

    @GetMapping("/employe/{id}")
    fun  getOne(@PathVariable id:Int): Optional<Employe>
    {
        return repo.findById(id)
    }
}