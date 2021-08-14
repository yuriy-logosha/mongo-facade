package com.my.services.mongofacade

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.util.*

@SpringBootApplication
class MongoFacadeApplication

fun main(args: Array<String>) {
    TimeZone.setDefault(TimeZone.getTimeZone("Latvian"))
    runApplication<MongoFacadeApplication>(*args)
}
