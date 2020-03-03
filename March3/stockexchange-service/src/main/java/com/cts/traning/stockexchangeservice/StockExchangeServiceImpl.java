package com.cts.traning.stockexchangeservice;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StockExchangeServiceImpl implements StockExchangeService {

	
	@Autowired
	StockExchangeRepo stockExchangeRepo;
	@Override
	public StockExchangeDTO insert(StockExchangeDTO stockExchangeDTO) {
		StockExchange stockExchange = new StockExchange();
		BeanUtils.copyProperties(stockExchangeDTO,stockExchange);
		stockExchangeRepo.save(stockExchange);
		return stockExchangeDTO;
		
}
	@Override
	public List<StockExchangeDTO> getAllStockExchanges() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public StockExchangeDTO getStockExchangeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public StockExchangeDTO saveStockExchange(StockExchangeDTO stockexchange) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteStockExchange(int id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public StockExchangeDTO updateStockExchange(StockExchangeDTO stockExchangeDTO) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean activateStockExchange(String email) {
		// TODO Auto-generated method stub
		return false;
	}
}
