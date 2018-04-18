package ua.dealercar.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table (name = "buyer")
public class Buyer extends BaseEntity {
	
	@Column(name = "full_name")
	private String fullName;
	
	@Column(length = 99)
	private int age;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "where_live", length = 999)
	private String whereLive;
	
	@ManyToMany
	@JoinTable(name = "buyer_car", 
	joinColumns = @JoinColumn(name = "buyer_id"),
	inverseJoinColumns = @JoinColumn(name = "car_id"))
	private List<Car> car = new ArrayList<>();

	public Buyer() {
	
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWhereLive() {
		return whereLive;
	}

	public void setWhereLive(String whereLive) {
		this.whereLive = whereLive;
	}
	
	
}
