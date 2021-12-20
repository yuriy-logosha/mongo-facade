package com.my.services.mongofacade

import com.my.services.mongofacade.data.Stat

interface StatsRepository: org.springframework.data.mongodb.repository.MongoRepository<Stat, String>