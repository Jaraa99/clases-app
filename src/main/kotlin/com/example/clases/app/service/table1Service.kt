package com.example.clases.app.service

import com.example.clases.app.model.table1
import com.example.clases.app.repository.table1Repository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatusCode
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class table1Service {
    @Autowired
    lateinit var table1Repository: table1Repository

    fun list(): List<table1> {
        return table1Repository.findAll()
    }

    fun save(table1: table1): table1 {
        try {
            return table1Repository.save(table1)
        } catch (ex: Exception) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }
    }

    fun update(table1: table1): table1 {
        try {
            table1Repository.findById(table1.id)
                    ?: throw Exception("ID no existe")

            return table1Repository.save(table1)
        } catch (ex: Exception) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }
    }

    fun updateName(table1: table1): table1 {
        try {
            val response = table1Repository.findById(table1.id)
                    ?: throw Exception("ID no existe")
            response.apply {
                fullname =table1.fullname //un atributo del modelo
            }
            return table1Repository.save(table1)
        } catch (ex: Exception) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }
    }


}