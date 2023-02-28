package com.anyject.lottery.lotteryserver.api.domain.lottery

import kotlin.random.Random

class LotteryGenerator {
    fun getLottoList(): List<Int>{

        val lotterySet = HashSet<Int>()
        while( lotterySet.size < 7 )
            lotterySet.add(Random.nextInt(1, 46))

        return lotterySet.toList()
    }
}