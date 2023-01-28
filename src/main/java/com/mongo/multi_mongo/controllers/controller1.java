//package com.mongo.multi_mongo.controllers;
//
//import com.mongo.multi_mongo.configurations.MultipleMongoConfig;
//import com.mongo.multi_mongo.models.Model1;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.data.mongodb.core.aggregation.ArrayOperators;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class controller1 {
//
//    @Autowired
//    private MultipleMongoConfig multipleMongoConfig;
//    @GetMapping("/connect/{id}")
//    public String createUser(@RequestBody Model1 model1 , @PathVariable Integer id) throws Exception {
//        return "ss";
//    }
//}
