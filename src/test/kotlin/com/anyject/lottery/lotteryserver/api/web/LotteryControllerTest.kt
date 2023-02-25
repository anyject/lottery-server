package com.anyject.lottery.lotteryserver.api.web

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.Mock
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import org.springframework.test.web.servlet.setup.MockMvcBuilders

@ExtendWith(SpringExtension::class)
@WebMvcTest(LotteryController::class)
class LotteryControllerTest {
    private lateinit var mvc: MockMvc

    @Mock
    private lateinit var lottoController: LotteryController

    private val baseUrl = "/lotto"

    @BeforeEach
    fun setUp() {
        mvc = MockMvcBuilders.standaloneSetup(lottoController).build()
    }

    @Test
    fun `lotto api status test`() {
        lottoApiStatusTest(baseUrl)
        //.andExpect(MockMvcResultMatchers.content().string(""))
    }
    private fun lottoApiStatusTest(uri: String) {
        mvc.perform(MockMvcRequestBuilders.get(uri)).andExpect(MockMvcResultMatchers.status().isOk)
    }
}



