//create derived class 2
class Memory extends Hardware{
	
	//private instance variables
	private String frequency;
	private String size; //memorySize
	private String cuda; //sportsCuda
	
	//constructors
	Memory(){
	}
	
	//public getter and setter for the private variable frequency
	public void setFrequency(String frequency){
		this.frequency = frequency;
	}
	//return variable frequency
	public String getFrequency(){
		return this.frequency;
	}
	
	//public getter and setter for the private variable size
	public void setSize(String size){
		this.size = size;
	}
	//return variable size
	public String getSize(){
		return this.size;
	}
	//public getter and setter for the private variable cuda
	public void setCuda(String cuda){
		this.cuda = cuda;
	}
	//return variable cuda
	public String getCuda(){
		return this.cuda;
	}
	
	
	
}
	
