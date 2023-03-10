package com.anyject.lottery.lotteryserver.api.domain.lottery

import com.anyject.lottery.lotteryserver.api.domain.BaseTimeEntity
import javax.persistence.*

@Table(name = "lottery")
@Entity
class Lottery(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    @Column(name = "id", length = 15)
    var id: Long? = null,

    @Column(nullable = false)
    val number: Int? = null
): BaseTimeEntity() {

}