package com.example.executorservice

import org.springframework.stereotype.Component
import java.util.concurrent.CountDownLatch
import java.util.concurrent.Executors
import javax.annotation.PostConstruct


@Component
class Test {

    var startSignal = CountDownLatch(1)

    var dataReceivedSignal = CountDownLatch(1)


    @PostConstruct
    fun runSomeStuff() : Unit {

        val executorService = Executors.newSingleThreadExecutor()

        executorService.submit{
            kotlin.run {
                println("Hello")
            }
        }
    }
}