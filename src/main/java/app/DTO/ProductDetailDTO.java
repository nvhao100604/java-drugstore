package app.DTO;

import java.time.LocalDate;

public class ProductDetailDTO {
	private String id;
	private String barcode;
	private String batch;
	private LocalDate MFG; // Manufacturing Date
	private LocalDate experied;
	private long percent;
	private int quantity;
	private ProductDTO product = new ProductDTO();

	public ProductDetailDTO() {
	}

	public ProductDetailDTO(String id, String barcode, String batch, LocalDate experied) {
		this.id = id;
		this.batch = batch;
		this.experied = experied;
	}

	public ProductDetailDTO(String id, String barcode, String batch, LocalDate MFG, LocalDate experied, long percent,
			int quantity) {
		this.id = id;
		this.barcode = barcode;
		this.batch = batch;
		this.MFG = MFG;
		this.experied = experied;
		this.percent = percent;
		this.quantity = quantity;
	}

	public ProductDetailDTO(ProductDetailDTO newProductDetail) {
		this.id = newProductDetail.id;
		this.barcode = newProductDetail.barcode;
		this.batch = newProductDetail.batch;
		this.MFG = newProductDetail.MFG;
		this.experied = newProductDetail.experied;
		this.percent = newProductDetail.percent;
		this.quantity = newProductDetail.quantity;
	}

///Get
	public String getId() {
		return id;
	}

	public String getBatch() {
		return batch;
	}

	public LocalDate getMFG() {
		return MFG;
	}

	public String getBarcode() {
		return barcode;
	}

	public LocalDate getExperied() {
		return experied;
	}

	public long getPercent() {
		return percent;
	}

	public int getQuantity() {
		return quantity;
	}

	public ProductDTO getProduct() {
		return product;
	}

///Set
	public void setId(String newId) {
		this.id = newId;
	}

	public void setBarcode(String newBarcode) {
		this.barcode = newBarcode;
	}

	public void setBatch(String newBatch) {
		this.batch = newBatch;
	}

	public void setMFG(LocalDate newMFG) {
		this.MFG = newMFG;
	}

	public void setExperied(LocalDate newExperied) {
		this.experied = newExperied;
	}

	public void setPercent(long newPercent) {
		this.percent = newPercent;
	}

	public void setQuantity(int newQuantity) {
		this.quantity = newQuantity;
	}

	public void setProduct(String newProductId, String newProductName) {
		product.setId(newProductId);
		product.setName(newProductName);
	}
}
