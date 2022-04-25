package com.example.executorservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ExecutorServiceApplication

fun main(args: Array<String>) {
    runApplication<ExecutorServiceApplication>(*args)
}
