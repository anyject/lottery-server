package com.anyject.lottery.lotteryserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}