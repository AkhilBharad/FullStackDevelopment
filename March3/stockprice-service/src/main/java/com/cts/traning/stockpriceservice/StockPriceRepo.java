package com.cts.traning.stockpriceservice;

import org.springframework.data.jpa.repository.JpaRepository;



public interface StockPriceRepo extends JpaRepository<StockPrice, Integer> {

}
