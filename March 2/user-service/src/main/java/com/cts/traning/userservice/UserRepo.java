package com.cts.traning.userservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

	public User findByEmail(String email);
}
