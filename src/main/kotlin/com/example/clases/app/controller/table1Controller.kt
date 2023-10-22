package com.example.clases.app.controller

import com.example.clases.app.model.table1
import com.example.clases.app.service.table1Service
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/table1")
class table1Controller {

    @Autowired
    lateinit var table1Service: table1Service
    @GetMapping
    fun list ():List <table1>{
        return table1Service.list()
    }
    @PostMapping
    fun save (@RequestBody table1: table1):ResponseEntity<table1>{
        return ResponseEntity(table1Service.save(table1), HttpStatus.OK)
    }
    @PutMapping
    fun update (@RequestBody table1: table1):ResponseEntity<table1>{
        return ResponseEntity(table1Service.update(table1), HttpStatus.OK)
    }
    @PatchMapping
    fun updateName (@RequestBody table1: table1):ResponseEntity<table1>{
        return ResponseEntity(table1Service.update(table1), HttpStatus.OK)
    }
}