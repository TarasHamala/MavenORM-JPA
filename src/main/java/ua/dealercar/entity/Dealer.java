package ua.dealercar.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "dealer")
public class Dealer extends BaseEntity {
	
	@Column(name = "first_name" , length = 50)
	private String firstName;
	
	@Column(name = "last_name", length = 50)
	private String lastName;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "description", length = 500)
	private String description;
	
	@OneToMany(mappedBy = "dealer")
	private List<Car> cars = new ArrayList<>();
	
	@OneToOne
	@JoinColumn(name = "dealer_details_id")
	private DealerDetails dealerDetails;
	public Dealer() {
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
