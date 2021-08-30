package org.philmaster.alarmsounddashboard.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import javax.annotation.PostConstruct;

import org.philmaster.alarmsounddashboard.model.Order;
import org.philmaster.alarmsounddashboard.repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("OrderService")
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository repo;

	@PostConstruct
	private void init() {
		initTestList();
	}

	private void initTestList() {
		repo.save(new Order("Kuchen"));
		repo.save(new Order("Pizza"));
		repo.save(new Order("Döner"));
		repo.save(new Order("Kuchen"));
		repo.save(new Order("Burger"));
		repo.save(new Order("Cola"));
		repo.save(new Order("Testz", "2021-01-01T01:01:00"));
		repo.flush();
	}

	@Override
	public String greet(String name) {
		return "Greeting " + name;
	}

	@Override
	public Order findOneById(String id) {
		return repo.findById(Long.parseLong(id))
				.orElseGet(null);
	}

	public Order createOrder(final Order o) {
		return this.repo.save(o);
	}

	@Override
	public List<Order> findAll() {
//		System.err.println("findall" + repo.count()
//				.subscribe());
//		Order order = new Order("Burger");
//		order.setId(Long.MAX_VALUE);
//		createOrder(order);
//		repo.save(order);
		return StreamSupport.stream(repo.findAll()
				.spliterator(), false)
				.collect(Collectors.toList());
	}

	@Override
	public List<Order> findAllMaxOneDayBack() {
		return findAll();
		// TODO
//		return empList.stream()
//				.filter(o -> o != null)
////				.filter(o -> o.getStampCreated()
////						.isAfter(LocalDateTime.now()
////								.minusDays(1)))
//				.collect(Collectors.toCollection(ConcurrentLinkedQueue<Order>::new));
	}

	@Override
	public Boolean addOneRandom() {

		System.err.println("addOneRandomaddOneRandom");
		try {
			repo.save(new Order("Random"));
			System.err.println("dd");
			return Boolean.TRUE;
		} catch (Exception e) {
			System.out.println(e);
			return Boolean.FALSE;
		}
	}

	@Override
	public Boolean deleteOneRandom() {
		// TODO
		try {
			return Boolean.TRUE;
		} catch (Exception e) {
			System.out.println(e);
			return Boolean.FALSE;
		}
	}

}
