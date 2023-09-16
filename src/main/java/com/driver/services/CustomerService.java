package com.driver.services;


import java.util.List;

import com.driver.model.Customer;
import com.driver.model.Driver;
import com.driver.model.TripBooking;


public interface CustomerService {
	void register(Customer customer);

	void deleteCustomer(Integer customerId);

	TripBooking bookTrip(int customerId, String fromLocation, String toLocation, int distanceInKm) throws Exception;

	void cancelTrip(Integer tripId);

	void completeTrip(Integer tripId);

//	public void register(Customer customer);
//
//	public void deleteCustomer(Integer customerId);
//
//	public TripBooking bookTrip(int customerId, String fromLocation, String toLocation, int distanceInKm) throws Exception;
//
//	public void cancelTrip(Integer tripId);
//
//	public void completeTrip(Integer tripId);

}