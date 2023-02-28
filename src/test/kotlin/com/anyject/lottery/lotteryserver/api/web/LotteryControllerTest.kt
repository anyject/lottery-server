package com.anyject.lottery.lotteryserver.api.web

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mock
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import org.springframework.test.web.servlet.setup.MockMvcBuilders
//@MockBean(JpaMetamodelMappingContext::class)
@WebMvcTest(LotteryController::class)
class LotteryControllerTest {
    private lateinit var mvc: MockMvc

    @Mock
    private lateinit var lotteryController: LotteryController

    private val baseUrl = "/lotto"

    @BeforeEach
    fun setUp() {
        mvc = MockMvcBuilders.standaloneSetup(lotteryController).build()
    }

    @Test
    fun `lotto api status test`() {
        mvc.perform(MockMvcRequestBuilders.get(baseUrl)).andExpect(MockMvcResultMatchers.status().isOk)
        //.andExpect(MockMvcResultMatchers.content().string(""))
    }
}



