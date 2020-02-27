package com.cts.traning.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.traning.models.StockExchange;

public interface StockExchangeRepo extends JpaRepository<StockExchange, Integer> {

}
