package com.example.clases.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ClasesAppApplication

fun main(args: Array<String>) {
	runApplication<ClasesAppApplication>(*args)
}
