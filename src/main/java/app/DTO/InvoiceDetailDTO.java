package app.DTO;

public class InvoiceDetailDTO {
	private String barcode;
	private double price;
	private int quantity;
	private ProductDetailDTO productDetail = new ProductDetailDTO();

	public InvoiceDetailDTO() {
	}

	public InvoiceDetailDTO(double price, int quantity) {
		this.barcode = "-1";
		this.price = price;
		this.quantity = quantity;
	}

	public InvoiceDetailDTO(String barcode, double price, int quantity) {
		this.barcode = barcode;
		this.price = price;
		this.quantity = quantity;
	}

	public InvoiceDetailDTO(String barcode, double price, int quantity, ProductDetailDTO newProductDetail) {
		this.barcode = barcode;
		this.price = price;
		this.quantity = quantity;
		this.productDetail = new ProductDetailDTO(newProductDetail);
	}

///Get
	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getBarcode() {
		return barcode;
	}

	public ProductDetailDTO getProductDetail() {
		return productDetail;
	}

///Set
	public void setPrice(double newPrice) {
		this.price = newPrice;
	}

	public void setQuantity(int newQuantity) {
		this.quantity = newQuantity;
	}

	public void setChiTiet(ProductDetailDTO newProductDetail) {
		this.productDetail = newProductDetail;
	}

}
