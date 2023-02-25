package com.anyject.lottery.lotteryserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LotteryApplication

fun main(args: Array<String>) {
    runApplication<LotteryApplication>(*args)
}