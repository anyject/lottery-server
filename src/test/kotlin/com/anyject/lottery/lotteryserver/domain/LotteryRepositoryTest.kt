package com.anyject.lottery.lotteryserver.domain

import com.anyject.lottery.lotteryserver.api.domain.lottery.Lottery
import com.anyject.lottery.lotteryserver.api.domain.lottery.LotteryRepository

import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.TestInstance.Lifecycle
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import java.time.LocalDateTime

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
class LotteryRepositoryTest (@Autowired val lottoRepository: LotteryRepository) {

    @AfterAll
    fun cleanUp() {
        lottoRepository.deleteAll()
    }

    @Test
    fun `create lotto`() {
        // given
        val now = LocalDateTime.now()
        lottoRepository.save(
            Lottery(
                number = 1
            )
        )
        lottoRepository.save(
            Lottery(
                number = 2
            )
        )
        // when
        val lottoList = lottoRepository.findAll()

        // then
        val lotto0 = lottoList[0]
        val lotto1 = lottoList[1]
       
    }

}