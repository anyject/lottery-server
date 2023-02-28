package com.anyject.lottery.lotteryserver.api.domain.lottery

import org.springframework.data.jpa.repository.JpaRepository

interface LotteryRepository: JpaRepository<Lottery, Long> {

}