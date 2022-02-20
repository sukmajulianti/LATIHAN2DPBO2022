class Memory : public Hardware{ //derived class 2
	
	//atribut
	private:
	string frequency;
	string size;
	string cuda;
	
	//constructor
	public:
	
	Memory(){
	}
	
	//proses get dan set
	void setFrequency(string frequency){
		this->frequency = frequency;
	}
	
	string getFrequency(){
		return this->frequency;
	}
	
	void setSize(string size){
		this->size = size;
	}
	
	string getSize(){
		return this->size;
	}
	
	void setCuda(string cuda){
		this->cuda = cuda;
	}
	
	string getCuda(){
		return this->cuda;
	}
	
	//destructor
	~Memory(){
	}
};
	
	