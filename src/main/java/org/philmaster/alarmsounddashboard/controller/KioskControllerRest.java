package org.philmaster.alarmsounddashboard.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.philmaster.alarmsounddashboard.model.Order;
import org.philmaster.alarmsounddashboard.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping("/api")
public class KioskControllerRest {

	@Autowired
	public OrderService service;

	@GetMapping(value = "/orders")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public List<Order> orders() {
		return service.findAllMaxOneDayBack();
	}

	@GetMapping("/{name}")
	private String greet(@PathVariable String name) {
		return service.greet(name);
	}

	@GetMapping(value = "/delete")
	public void delete(Model model) {
		service.deleteOneRandom();
	}

	@GetMapping(value = "/deleteAll")
	public void deleteAll(Model model) {
		service.deleteAll();
	}

	@GetMapping(value = "/add")
	public void add(Model model) {
		service.addOneRandom();
	}

	@GetMapping(value = "/orders/{uuid}/confirm")
	public void confirm(@PathVariable String uuid) {
		Order order = service.findOneByUUID(uuid);
		if (order != null)
			order.setStampConfirmed(LocalDateTime.now());
		service.saveAndFlush(order);
	}
}
