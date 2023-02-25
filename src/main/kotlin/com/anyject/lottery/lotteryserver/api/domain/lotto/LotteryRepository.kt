package com.anyject.lottery.lotteryserver.api.domain.lotto

import org.springframework.data.jpa.repository.JpaRepository

interface LotteryRepository: JpaRepository<Lottery, Long> {

}