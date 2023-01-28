package com.mongo.multi_mongo.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = {"com.mongo.multi_mongo.repository.modelRepo2"},
        mongoTemplateRef = NewDb2Config.MONGO_TEMPLATE
)
public class NewDb2Config {
    protected static final String MONGO_TEMPLATE = "newdb2MongoTemplate";
}
