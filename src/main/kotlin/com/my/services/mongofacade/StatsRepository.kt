package com.my.services.mongofacade

import org.springframework.data.mongodb.repository.MongoRepository


interface StatsRepository: MongoRepository<Stat, String>