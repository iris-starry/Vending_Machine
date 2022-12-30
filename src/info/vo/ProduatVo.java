package info.vo;

public class ProduatVo {
	private String name; //제품명
	private int price; //가격
	private int stock; //재고
	
	//생성자
	public ProduatVo(String name, int price, int stock) {
		super();
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "ProduatVo [name=" + name + ", price=" + price + ", stock=" + stock + "]";
	}
	
	
	
}
