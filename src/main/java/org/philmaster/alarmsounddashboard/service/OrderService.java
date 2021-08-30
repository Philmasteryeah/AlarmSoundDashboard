package org.philmaster.alarmsounddashboard.service;

import java.util.List;

import org.philmaster.alarmsounddashboard.model.Order;

public interface OrderService {

	String greet(String name);

	Order findOneById(String id);

	List<Order> findAll();

	List<Order> findAllMaxOneDayBack();

	Boolean addOneRandom();

	Boolean deleteOneRandom();

}
