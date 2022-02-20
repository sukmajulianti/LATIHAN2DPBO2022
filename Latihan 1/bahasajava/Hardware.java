//create derived class 1 - intermediary
class Hardware extends Product{
	
	//private instance variables
	private String brand;
	private String model;
	
	//constructors
	Hardware(){
	}

	//public getter and setter for the private variable brand	
	public void setBrand(String brand){
		this.brand = brand;
	}
	//return variable brand
	public String getBrand(){
		return this.brand;
	}
	
	//public getter and setter for the private variable model		
	public void setModel(String model){
		this.model = model;
	}
	//return variable model
	public String getModel(){
		return this.model;
	}
	
}
	
