<?php 
 //derived class 1
class Hardware extends Product{
	
	//atribut private
	private $brand;
	private $model;
		
	//constructor
	function __construct(){
	}
		
	//proses get dan set
	function setBrand($brand){
		$this->brand = $brand;
	}
		
	function getBrand(){
		return $this->brand;
	}
		
	function setModel($model){
		$this->model = $model;
	}
		
	function getModel(){
		return $this->model;
	}
	
	//destructor
	 function __destruct(){
	 }
}
?>