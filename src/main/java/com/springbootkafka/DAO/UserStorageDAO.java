package com.springbootkafka.DAO;

import com.springbootkafka.domain.User;


public interface UserStorageDAO {

  User save(User user);
  void delete(User user);
  
}
