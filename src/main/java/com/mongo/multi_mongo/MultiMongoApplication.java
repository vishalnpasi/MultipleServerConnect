package com.mongo.multi_mongo;

import com.mongo.multi_mongo.models.Model1;
import com.mongo.multi_mongo.repository.modelRepo1.Model1Repository;
import com.mongo.multi_mongo.models.Model2;
import com.mongo.multi_mongo.repository.modelRepo2.Model2Repository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class MultiMongoApplication implements CommandLineRunner {
	@Autowired
	private Model1Repository model1Repository;
	@Autowired
	private Model2Repository model2Repository;
	public static void main(String[] args) {

		SpringApplication.run(MultiMongoApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {

		log.info("Starting creating and printing mongo");

		model1Repository.save(new Model1(null,"model 1"));

		model2Repository.save(new Model2(null,"model 2"));
	}
}
