package app.DTO;

import java.time.LocalDate;

class CustomerDTO {
	private int id;
	private String fullName;
	private LocalDate dateOfBorn;
	private String gender;
	private String phone;
	private int point;

	public CustomerDTO() {
	}

	public CustomerDTO(String fullName, LocalDate dateOfBorn, String gender, String phone) {
		this.fullName = fullName;
		this.dateOfBorn = dateOfBorn;
		this.gender = gender;
		this.phone = phone;
		this.point = 0;
	}

	public CustomerDTO(int id, String fullName, LocalDate dateOfBorn, String gender, String phone, int point) {
		this.id = id;
		this.fullName = fullName;
		this.dateOfBorn = dateOfBorn;
		this.gender = gender;
		this.phone = phone;
		this.point = point;
	}

	public int getId() {
		return id;
	}

	public String getFullName() {
		return fullName;
	}

	public LocalDate getDateOfBorn() {
		return dateOfBorn;
	}

	public String getGender() {
		return gender;
	}

	public String getPhone() {
		return phone;
	}

	public int getPoint() {
		return point;
	}

	public String toString() {
		return phone + " - " + fullName;
	}
}
