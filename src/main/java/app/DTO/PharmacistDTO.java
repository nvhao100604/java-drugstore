package app.DTO;

public class PharmacistDTO {
	private String id;
	private String name;
	private String phone;
	private String email;
	private boolean status;
	private AccountDTO account;

	public PharmacistDTO() {
	}

	public PharmacistDTO(String id, String name, String phone, String email, AccountDTO account, boolean status) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.status = status;
		this.account = account;
	}

	public PharmacistDTO(String id, String name, String phone, String email) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;

	}

///Get
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public AccountDTO getAccount() {
		return account;
	}

	public boolean getStatus() {
		return status;
	}

///Set
	public void setId(String newId) {
		this.id = newId;
	}

	public void setName(String newName) {
		this.name = newName;
	}

	public void setPhone(String newPhone) {
		this.phone = newPhone;
	}

	public void setEmail(String newEmail) {
		this.email = newEmail;
	}

	public void setAccount(AccountDTO newAccount) {
		this.account = newAccount;
	}

	public void setStatus(boolean newStatus) {
		this.status = newStatus;
	}

	public String toStringName() {
		return id + " - " + name;
	}

}
