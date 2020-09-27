package com.my.services.mongofacade

import org.springframework.data.annotation.Id
import java.time.LocalDateTime


data class Stat constructor(
        @Id var id: String?,
        var ads_count: Int?,
        var houses: Int?,
        var unique_ads: Int?,
        var geo_address: Int?,
        var total_address: Int?,
        var diff_prices: Int?,
        var total_eur: Int?,
        var date: LocalDateTime?)