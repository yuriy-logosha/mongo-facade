package com.my.services.mongofacade

import org.springframework.data.domain.Sort
import org.springframework.data.domain.Sort.Direction.DESC
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class StatsController(var repository: StatsRepository) {

    @GetMapping("/stats")
    fun findAll(): MutableList<Stat> =
            repository.findAll( Sort.by(DESC, "date") )

    @GetMapping("/last")
    fun last(): Stat =
            repository.findAll().last()

    @GetMapping("/last2")
    fun last2(): MutableList<Stat> =
        repository.findAll( Sort.by(DESC, "date") ).subList(0, 2)

}