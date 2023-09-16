package com.driver.services;

import java.util.List;

import com.driver.model.Admin;
import com.driver.model.Customer;
import com.driver.model.Driver;

public interface AdminService {

	public void adminRegister(Admin admin);

	Admin updatePassword(Integer adminId, String password);

	void deleteAdmin(int adminId);

	List<Driver> getListOfDrivers();

	List<Customer> getListOfCustomers();

//	public Admin updatePassword(Integer adminId, String password);
//
//	public void deleteAdmin(int adminId);
//
//	public List<Driver> getListOfDrivers();
//
//	public List<Customer> getListOfCustomers();
}