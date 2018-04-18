package ua.dealercar.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "dealer_details")
public class DealerDetails extends BaseEntity {
		
		@Column(name = "hobby")
		private String hobby;
		
		@Column(name = "email")
		private String email;
		
		@Column(name = "phone_number")
		private int phoneNumber;

		public DealerDetails() {
			
		}

		public String getHobby() {
			return hobby;
		}

		public void setHobby(String hobby) {
			this.hobby = hobby;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public int getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(int phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
			
	}

