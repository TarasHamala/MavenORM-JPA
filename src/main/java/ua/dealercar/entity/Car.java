package ua.dealercar.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name  = "car")
@Getter
@Setter
public class Car extends BaseEntity {
	
	@Column(name = "name_of_company")
	private String nameOfCompany;
	
	@Column(name = "model")
	private String model;
	
	
	@Column(name = "color")
	private String color;
	
	@Column(name = "type_of_engine")
	private String typeOfEngine;
	
	@Column(name = "capacity", columnDefinition = "Decimal(5,2)")
	private BigDecimal capacity;
	
	@Column(name = "price", columnDefinition = "Decimal(5,2)")
	private BigDecimal price;
	
	@ManyToOne
	@JoinColumn(name = "dealer_id")
	private Dealer dealer;
	
	
	@ManyToMany
	@JoinTable(name = "buyer_car", 
			joinColumns = @JoinColumn(name = "car_id"),
			inverseJoinColumns = @JoinColumn(name = "buyer_id"))
	private List<Buyer> buyers = new ArrayList<>();

	public Car() {
	
	}

	public String getNameOfCompany() {
		return nameOfCompany;
	}

	public void setNameOfCompany(String nameOfCompany) {
		this.nameOfCompany = nameOfCompany;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTypeOfEngine() {
		return typeOfEngine;
	}

	public void setTypeOfEngine(String typeOfEngine) {
		this.typeOfEngine = typeOfEngine;
	}

	public BigDecimal getCapacity() {
		return capacity;
	}

	public void setCapacity(BigDecimal capacity) {
		this.capacity = capacity;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}


	
	
}
