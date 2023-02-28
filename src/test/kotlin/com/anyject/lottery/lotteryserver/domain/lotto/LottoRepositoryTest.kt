package com.anyject.lottery.lotteryserver.domain.lotto

import com.anyject.lottery.lotteryserver.api.domain.lotto.Lotto
import com.anyject.lottery.lotteryserver.api.domain.lotto.LottoRepository
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import java.time.LocalDateTime

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class LottoRepositoryTest(@Autowired val lottoRepository: LottoRepository) {

    @AfterAll
    fun cleanUp() {
        lottoRepository.deleteAll()
    }

    @Test
    fun `insert lotto test`() {
        //given
        val now = LocalDateTime.now()
        lottoRepository.save(Lotto(number=1))
        lottoRepository.save(Lotto(number=2))
        lottoRepository.save(Lotto(number=3))
        lottoRepository.save(Lotto(number=4))
        lottoRepository.save(Lotto(number=5))
        lottoRepository.save(Lotto(number=6))
        lottoRepository.save(Lotto(number=7))
        //when
        val lottoList = lottoRepository.findAll()

        //then
        lottoList.forEach {
            println(it.number)
        }
        assertThat(lottoList.size).isEqualTo(7)
    }
}