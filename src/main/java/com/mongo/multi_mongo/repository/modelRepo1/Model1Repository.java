package com.mongo.multi_mongo.repository.modelRepo1;

import com.mongo.multi_mongo.models.Model1;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface Model1Repository  extends MongoRepository<Model1,String> {
}

