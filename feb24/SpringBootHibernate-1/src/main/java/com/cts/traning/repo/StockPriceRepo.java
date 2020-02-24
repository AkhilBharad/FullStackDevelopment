package com.cts.traning.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.traning.models.StockPrice;

public interface StockPriceRepo extends JpaRepository<StockPrice, Integer> {

}
