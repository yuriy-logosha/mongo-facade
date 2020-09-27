package com.my.services.mongofacade

import com.mongodb.client.MongoClient
import com.mongodb.client.MongoClients
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.stereotype.Component


@Component
class AppConfig(
        @Value("\${application.host}") val host: String,
        @Value("\${application.database}") val database: String
) {

    @Bean
    fun mongoClient(): MongoClient {
        return MongoClients.create(host)
    }

    @Bean
    fun mongoTemplate(mongoClient: MongoClient): MongoTemplate? {
        return MongoTemplate(mongoClient, database)
    }
}