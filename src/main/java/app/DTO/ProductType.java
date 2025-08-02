package app.DTO;

class ProductType {
	private String id;
	private String name;
	private boolean status;

	public ProductType() {
	}

	public ProductType(String id, String name, boolean status) {
		this.id = id;
		this.name = name;
		this.status = status;
	}

	public String getid() {
		return id;
	}

	public void setid(String id) {
		this.id = id;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public boolean isstatus() {
		return status;
	}

	public void setstatus(boolean status) {
		this.status = status;
	}

	public String toString() {
		return id + " - " + name;
	}
}
