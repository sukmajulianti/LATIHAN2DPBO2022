class Hardware : public Product{ //intermediary
	
	//atribut 
	private:
	string brand;
	string model;
	
	//constructor
	public:
	
	Hardware(){
	}
	
	//proses get dan set
	void setBrand(string brand){
		this->brand = brand;
	}
	
	string getBrand(){
		return this->brand;
	}
	
	void setModel(string model){
		this->model = model;
	}
	
	string getModel(){
		return this->model;
	}
	
	//destructor
	~Hardware(){
	}
};
	
	