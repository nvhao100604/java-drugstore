package app.DTO;

class AccountDTO {
	private String id;
	private String username;
	private int role;

	public AccountDTO() {
	}

	public AccountDTO(String id, String username, int role) {
		this.id = id;
		this.username = username;
		this.role = role;
	}

	public AccountDTO(String username) {
		this.username = username;
	}

	public String getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public int getRole() {
		return role;
	}
}
