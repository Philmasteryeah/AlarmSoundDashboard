package org.philmaster.alarmsounddashboard.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import javax.annotation.PostConstruct;

import org.philmaster.alarmsounddashboard.model.Order;
import org.philmaster.alarmsounddashboard.repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
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
		repo.save(new Order("Kuchen", LocalDateTime.now()
				.minusMinutes(2)));
		repo.save(new Order("Pizza", LocalDateTime.now()
				.minusMinutes(10)));
		repo.save(new Order("Döner", LocalDateTime.now()
				.minusMinutes(100)));
		repo.save(new Order("Burger", LocalDateTime.now()
				.minusMinutes(120)));
		repo.save(new Order("Cola", LocalDateTime.now()
				.minusMinutes(12)));
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
		try {
			repo.save(new Order("Random"));
			return Boolean.TRUE;
		} catch (Exception e) {
			System.out.println(e);
			return Boolean.FALSE;
		}
	}

	@Override
	public Boolean deleteOneRandom() {
		try {
			if (repo.count() > 0)
				repo.delete(repo.findAll()
						.get(0));
			return Boolean.TRUE;
		} catch (Exception e) {
			System.out.println(e);
			return Boolean.FALSE;
		}
	}

	@Override
	public Order findOneByUUID(String uuid) {
		
		
		return repo.findAll()
				.stream()
				.filter(orr -> orr.uuid()
						.equals(UUID.fromString(uuid)))
				.findFirst()
				.orElse(null);
	}

	@Override
	public Order saveAndFlush(Order entity) {
		return repo.saveAndFlush(entity);
	}

}
