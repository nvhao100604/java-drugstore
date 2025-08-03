package app.DTO;

import java.time.LocalDate;

public class InvoiceDTO {
	private String id;
	private LocalDate dateFound;
	private String author;
	private int customerID;
	private String prescription;
	private int point;
	private long total;

	private CustomerDTO customerInfo = new CustomerDTO();

	public InvoiceDTO() {
	}

	public InvoiceDTO(String id, LocalDate dateFound, String author, int customerID, String prescription, int point,
			long total) {
		this.id = id;
		this.dateFound = dateFound;
		this.author = author;
		this.customerID = customerID;
		this.prescription = prescription;
		this.point = point;
		this.total = total;
	}

///Get
	public String getId() {
		return id;
	}

	public LocalDate getDateFound() {
		return dateFound;
	}

	public String getAuthor() {
		return author;
	}

	public int getCustomerID() {
		return customerID;
	}

	public String getPrescription() {
		return prescription;
	}

	public int getPoint() {
		return point;
	}

	public long getTotal() {
		return total;
	}

	public CustomerDTO getCustomerInfo() {
		return customerInfo;
	}

///Set
	public void setId(String newID) {
		this.id = newID;
	}

	public void setDateFound(LocalDate newDateFound) {
		this.dateFound = newDateFound;
	}

	public void setAuthor(String newAuthor) {
		this.author = newAuthor;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public void setPrescription(String newPrescription) {
		this.prescription = newPrescription;
	}

	public void setPoint(int newPoint) {
		this.point = newPoint;
	}

	public void setTotal(long newTotal) {
		this.total = newTotal;
	}

	public void setCustomerInfo(CustomerDTO newCustomerInfo) {
		customerInfo = newCustomerInfo;
	}
}
