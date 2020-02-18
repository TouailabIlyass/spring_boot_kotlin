package com.example.demo.Controller

import com.example.demo.model.Employe
import com.example.demo.repository.EmployeRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import java.util.*


@Controller
class EmployeController {

    @Autowired
    lateinit var repo:EmployeRepository
    @RequestMapping(path = ["/"])
    fun getAll(): String? {
        return "home.html"
    }

    @GetMapping("/employe/{id}")
    fun  getOne(@PathVariable id:Int): Optional<Employe>
    {
        return repo.findById(id)
    }

    @GetMapping("/admin/index")
    fun  index_Admin():String
    {
        return "index_admin.jsp";
    }
    @GetMapping("/user/index")
    fun  index_User():String
    {
        return "index.jsp";
    }
}