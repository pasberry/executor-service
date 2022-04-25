package com.example.executorservice

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class Test2 {

    @PostConstruct
    fun postConstruct() = runBlocking  {

        launch {
            println("Live from the coroutine")
        }
    }
}