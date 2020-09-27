package com.my.services.mongofacade

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class StatsController(var repository: StatsRepository) {

    @GetMapping("/stats")
    fun findAll(): MutableList<Stat> =
            repository.findAll().asReversed()

}