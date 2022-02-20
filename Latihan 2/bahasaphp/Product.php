<?php 
 
 //parent class
 class Product{
	
	//atribut private
	private $price;
	private $id;
	
	//constructor
	function __construct(){
	}
		
	//proses get dan set
	function setPrice($price){
		$this->price = $price;
	}
		
	function getPrice(){
		return $this->price;
	}
		
	function setId($id){
		$this->id = $id;
	}
		
	function getId(){
		return $this->id;
	}
	
	//destructor
	 function __destruct(){
	 }
}
?>