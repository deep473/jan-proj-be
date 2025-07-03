package sales.savvy.dto;

public class CartItemDTO {
	private Long productId;
	private String name;
	private String description;
	private Integer price;
	private String image;
	private Integer quantity;

	public CartItemDTO() {}
	public CartItemDTO(Long productId, String name, String description,
			Integer price, String image, Integer quantity) {
		this.productId = productId;
		this.name      = name;
		this.description = description;
		this.price     = price;
		this.image     = image;
		this.quantity  = quantity;
	}

	public Long getProductId() { 
		return productId; 
	}
	public void setProductId(Long productId) { 
		this.productId = productId; 
	}
	public String getName() { 
		return name; 
	}
	public void setName(String name) {
		this.name = name; 
	}
	public String getDescription() { 
		return description; 
	}
	public void setDescription(String description) { 
		this.description = description; 
	}
	public Integer getPrice() { 
		return price; 
	}
	public void setPrice(Integer price) { 
		this.price = price; 
	}
	public String getImage() { 
		return image; 
	}
	public void setImage(String image) { 
		this.image = image; 
	}
	public Integer getQuantity() { 
		return quantity; 
	}
	public void setQuantity(Integer quantity) { 
		this.quantity = quantity; 
	}
}
