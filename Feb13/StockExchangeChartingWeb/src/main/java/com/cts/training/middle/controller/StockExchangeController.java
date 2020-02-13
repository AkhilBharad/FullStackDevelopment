package com.cts.training.middle.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.cts.training.bean.Company;
import com.cts.training.bean.StockExchange;
import com.cts.training.bean.User;
import com.cts.training.dao.CompanyDAO;
import com.cts.training.dao.StockExchangeDAO;
import com.cts.training.dao.UserDAO;
@Controller
public class StockExchangeController {
	@Autowired
	StockExchangeDAO stockExchangeDAO;
	@GetMapping("/stockExchange-home")
	public String stockExchangePage(Model model) {
		List<StockExchange> stockexchanges = stockExchangeDAO.getAllStockExchanges();
		model.addAttribute("list", stockexchanges);
		
		model.addAttribute("stockExchange", new StockExchange());

		return "stockExchange";
	}
@PostMapping("/stockExchange/save")
// @RequestMapping(value="/user/save",method=MethodType.POST)
public String addStockExchange(@ModelAttribute("stockExchange") StockExchange stockexchange) {
	stockExchangeDAO.saveOrUpdateStockExchange(stockexchange);
	return "redirect:/stockExchange-home";
}
@GetMapping("/stockExchange/remove/{id}")
public String deleteStockExchange(@PathVariable("id") int id) {
	StockExchange stockexchange = stockExchangeDAO.getStockExchangeById(id);
	stockExchangeDAO.removeStockExchange(stockexchange);
	return "redirect:/stockExchange-home";
}
@GetMapping("/stockExchange/update/{id}")
public String updateStockExchange(@PathVariable("id") int id,Model model) {
	StockExchange stockexchange=stockExchangeDAO.getStockExchangeById(id);
	model.addAttribute("stockExchange",stockexchange);
	return "stockExchange";
}
}