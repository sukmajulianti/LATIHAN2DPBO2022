class Product{ //base class
	
	//atribut
	private:
	string price;
	string id;

	//constructor
	public:
	
	Product(){
	}
	
	//proses get dan set
	void setPrice(string price){
		this->price = price;
	}
	
	string getPrice(){
		return this->price;
	}
	
	void setId(string id){
		this->id = id;
	}
	
	string getId(){
		return this->id;
	}
	
	//destructor
	~Product(){
	}
};
	
	