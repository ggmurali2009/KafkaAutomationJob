package com.springbootkafka.DAO;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.springbootkafka.domain.User;


@Qualifier("mongouserdetails")
public interface MongoUserDao extends MongoRepository<User,String>,UserStorageDAO {

}
