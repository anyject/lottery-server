package com.anyject.lottery.lotteryserver.api.web

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers

@WebMvcTest(LottoController::class)
class LottoControllerTest
    @Autowired constructor (
        val mvc: MockMvc
            ){
    private val baseUrl = "/lotto"

    @Test
    fun `lotto api status test`() {
        lottoApiStatusTest(baseUrl)
//        mvc.perform(MockMvcRequestBuilders.get(baseUrl))
//            .andExpect(MockMvcResultMatchers.status().isOk)
            //.andExpect(MockMvcResultMatchers.content().string(""))
    }
    private fun lottoApiStatusTest(uri: String) {
        mvc.perform(MockMvcRequestBuilders.get(uri)).andExpect(MockMvcResultMatchers.status().isOk)
    }
}



