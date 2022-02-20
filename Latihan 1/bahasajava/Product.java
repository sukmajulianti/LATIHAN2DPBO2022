//create superclass
class Product
	
	//design : superclass product, derived class 1 hardware, derived class 2 child memory 
	
	//private instance variables
	private String price; //harga
	private String id; //id produk
	
	//constructors
	Product(){
	}
	
	//public getter and setter for the private variable price
	public void setPrice(String price){
		this.price = price;
	}
	//return variable price
	public String getPrice(){
		return this.price;
	}
	//public getter and setter for the private variable IdProduct
	public void setId(String id){
		this.id = id;
	}
	//return variable price
	public String getId(){
		return this.id;
	}
	
}
	