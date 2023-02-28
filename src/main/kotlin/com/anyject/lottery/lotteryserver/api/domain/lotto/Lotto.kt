package com.anyject.lottery.lotteryserver.api.domain.lotto

import com.anyject.lottery.lotteryserver.api.domain.BaseTimeEntity
import javax.persistence.*

@Table(name = "lotto")
@Entity
class Lotto(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    @Column(name = "id", length = 15)
    val id: Long? = null,

    @Column(nullable = false)
    val number: Int? = 0
): BaseTimeEntity() {

}