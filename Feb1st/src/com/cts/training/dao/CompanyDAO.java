package com.cts.training.dao;

import java.util.List;

import com.cts.training.bean.Company;

public interface CompanyDAO {

	public boolean saveCompany(Company company);

	public boolean updateUser(Company company);

	public boolean deleteUser(Company company);

	public Company getCompanyById(int id);

	public List<Company> getAllCompanys();
}
