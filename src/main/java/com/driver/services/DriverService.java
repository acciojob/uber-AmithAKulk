package com.driver.services;

import com.driver.model.Driver;

public interface DriverService {
	void register(String mobile, String password);

	void removeDriver(int driverId);

	void updateStatus(int driverId);

//		public void register(String mobile, String password);
//		public void removeDriver(int driverId);
//		public void updateStatus(int driverId);
}
