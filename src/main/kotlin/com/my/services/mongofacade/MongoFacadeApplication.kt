package com.my.services.mongofacade

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MongoFacadeApplication

fun main(args: Array<String>) {
    runApplication<MongoFacadeApplication>(*args)
}
