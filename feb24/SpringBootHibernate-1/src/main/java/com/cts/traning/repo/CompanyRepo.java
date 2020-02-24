package com.cts.traning.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.traning.models.Company;

public interface CompanyRepo extends JpaRepository<Company, Integer> {

}
