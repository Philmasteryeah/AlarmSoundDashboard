package org.philmaster.alarmsounddashboard.service;

import java.util.List;

import org.philmaster.alarmsounddashboard.model.Order;

public interface OrderService {

	String greet(String name);

	Order findOneById(String id);

	Order findOneByUUID(String uuid);

	List<Order> findAll();

	List<Order> findAllMaxOneDayBack();

	Boolean addOneRandom();

	Boolean deleteOneRandom();

	Order saveAndFlush(Order entity);

	void deleteAll();

}
