package app.DTO;

class ProductDTO {
	private String id;
	private String name;
	private String type;
	private String producer;
	private String specifications;
	private String origin;
	private boolean isNeedPrescribe;
	private boolean status;
	private ProductDetailDTO detail;

	public ProductDTO() {
	}

	public ProductDTO(String id, String name) {

	}

	public ProductDTO(String id, String name, String type, String producer, String specifications, String origin,
			boolean isNeedPrescribe, boolean status) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.producer = producer;
		this.specifications = specifications;
		this.origin = origin;
		this.isNeedPrescribe = isNeedPrescribe;
		this.status = status;
	}

	public ProductDTO(String id, String name, String type, String producer, String specifications, String origin,
			boolean isNeedPrescribe, boolean status, ProductDetailDTO detail) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.producer = producer;
		this.specifications = specifications;
		this.origin = origin;
		this.isNeedPrescribe = isNeedPrescribe;
		this.status = status;
		this.detail = detail;
	}

///Get
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getProducer() {
		return producer;
	}

	public String getSpecifications() {
		return specifications;
	}

	public String getOrigin() {
		return origin;
	}

	public boolean getIsIsNeedPrescribe() {
		return isNeedPrescribe;
	}

	public boolean getStatus() {
		return status;
	}

	public ProductDetailDTO getDetail() {
		return detail;
	}

///Set
	public void setId(String newId) {
		this.id = newId;
	}

	public void setName(String newName) {
		this.name = newName;
	}

	public void setType(String newType) {
		this.type = newType;
	}

	public void setProducer(String newProducer) {
		this.producer = newProducer;
	}

	public void setSpecifications(String newSpecifications) {
		this.specifications = newSpecifications;
	}

	public void setOrigin(String newOrigin) {
		this.origin = newOrigin;
	}

	public void setIsNeedPrescribe(boolean newIsNeedPrescribe) {
		this.isNeedPrescribe = newIsNeedPrescribe;
	}

	public void setStatus(boolean newStatus) {
		this.status = newStatus;
	}

	public void setTaiKhoan(ProductDetailDTO newDetail) {
		this.detail = newDetail;
	}

	public String toString() {
		return id + " - " + name;
	}
}
