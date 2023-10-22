package com.example.clases.app.repository

import com.example.clases.app.model.table1
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface table1Repository :JpaRepository<table1, Long?> {

        fun findById (id: Long?): Module?



    }

