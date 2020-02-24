package com.cts.traning.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.traning.models.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
