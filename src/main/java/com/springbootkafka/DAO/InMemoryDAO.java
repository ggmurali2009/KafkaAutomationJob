package com.springbootkafka.DAO;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.springbootkafka.domain.User;

@Repository
@Qualifier("userdetails")
public class InMemoryDAO implements UserStorageDAO {

	@Override
	public User save(User user) {
		System.out.println("User saved"+user);
		return user;
	}

	@Override
	public void delete(User user) {
		System.out.println("Deleted user"+user);
	}


}
