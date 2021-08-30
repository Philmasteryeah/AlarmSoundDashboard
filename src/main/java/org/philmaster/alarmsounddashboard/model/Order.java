package org.philmaster.alarmsounddashboard.model;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "order_table")
public class Order {

	// private Random random = new Random();

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonIgnore
	private Long id;

	private int priority;

	private UUID uuid = UUID.randomUUID();

	private String description;

	// @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", insertable
	// = false, updatable = false)
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime stampCreated;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime stampImported;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime stampConfirmed;

	public Order() {
		// id = randomId();
		priority = randomNumber(0, 3);
	}

	@JsonGetter
	public UUID uuid() {
		return uuid;
	}

	public Long getId() {
		return id;
	}

	@JsonGetter
	public String hexColor() {
		switch (priority) {
		case 0:
			return "#FF0000"; // ROT
		case 1:
			return "#FFFF00"; // GELB
		case 2:
			return "#FF8800"; // ORANGE
		case 3:
			return "#00FF00"; // GRÜN
		default:
			return "#FFFFFF"; // WEISS
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

	public Order(String desc) {
		this();
		description = desc;
	}

	public Order(String desc, String created) {
		this(desc);
		stampCreated = LocalDateTime.parse(created);
	}

//	private long randomId() {
//		return randomNumber(1, 50);
//	}

	private int randomNumber(final int min, final int max) {
		return new Random().nextInt((max - min) + 1) + min;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public LocalDateTime getStampCreated() {
		return stampCreated;
	}

	public LocalDateTime getStampImported() {
		return stampImported;
	}

	public void setStampImported(LocalDateTime stampImported) {
		this.stampImported = stampImported;
	}

	public LocalDateTime getStampConfirmed() {
		return stampConfirmed;
	}

	public void setStampConfirmed(LocalDateTime stampConfirmed) {
		this.stampConfirmed = stampConfirmed;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
