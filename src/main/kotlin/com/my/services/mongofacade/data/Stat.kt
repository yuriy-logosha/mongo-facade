package com.my.services.mongofacade.data

import org.springframework.data.annotation.Id
import java.time.LocalDateTime


data class Stat constructor(
        @Id var id: String?,
        var ads_count: Long?,
        var houses: Long?,
        var geo_address: Long?,
        var total_address: Long?,
        var diff_prices: Long?,
        var total_eur: Long?,
        var date: LocalDateTime?)