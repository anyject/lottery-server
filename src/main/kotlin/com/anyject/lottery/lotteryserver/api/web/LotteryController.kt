package com.anyject.lottery.lotteryserver.api.web

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/lotto")
class LotteryController{
    @GetMapping("")
    fun lotto(): String {

        return "Hello"
    }
}