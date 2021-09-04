package org.philmaster.alarmsounddashboard.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.philmaster.alarmsounddashboard.model.Order;
import org.philmaster.alarmsounddashboard.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class KioskController {

	@Autowired
	public OrderService service;

//	@RequestMapping("/")
//	public String index(final Model model) {
//
//		model.addAttribute("orders", service.findAll());
//
//		// classic, wait repository loaded all and display it.
//		// model.addAttribute("movies", movieRepository.findAll());
//
//		return "index";
//
//	}
}
