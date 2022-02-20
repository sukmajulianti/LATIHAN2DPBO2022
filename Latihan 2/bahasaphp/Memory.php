<?php 
 //derived class 2
class Memory extends Hardware{
	
	//atribut private
	private $frequency;
	private $size;
	private $cuda;
	
	//constructor
	function __construct(){
	}
		
	//proses get dan set
	function setFrequency($frequency){
		$this->frequency = $frequency;
	}
		
	function getFrequency(){
		return $this->frequency;
	}
		
	function setSize($size){
		$this->size = $size;
	}
		
	function getSize(){
		return $this->size;
	}
	
	function setCuda($cuda){
		$this->cuda = $cuda;
	}
		
	function getCuda(){
		return $this->cuda;
	}
	
	//destructor
	 function __destruct(){
	 }
}
?>