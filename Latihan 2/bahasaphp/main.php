<?php

	include "Product.php";
	include "Hardware.php";
	include "Memory.php";
	
	/* ("-> Price: Rp 365.000");
	("-> Id Product: 11223344");
	("-> Brand: Samsung");
	("-> Model: DDR4");
	("-> Frequency: 2666MHz");
	("-> Size Memory: 8GB");
	("-> sports Cuda: Nvidia Gtx Gaming"); */
	
	
	//mengeset atribut class product
	$p = new Product();
	$p->setPrice("+ Price: Rp 365.000");
	$p->setId("+ Id Product: 11223344");
	
	//mencetak atribut class product
	echo "<h3> 1. Kelas Produk </h3>";
	echo("====================================<br/>");
	echo("============= PRODUCT ==============<br/>");
	echo $p->getPrice()."<br/>";
	echo $p->getId()."<br/>";
	echo("====================================<br/>");
	
	//mengeset atribut class hardware
	$h = new Hardware();
	$h->setPrice("+ Price: Rp 365.000");
	$h->setId("+ Id Product: 11223344");
	$h->setBrand("+ Brand: Samsung");
	$h->setModel("+ Model: DDR4");
	
	//mencetak atribut class hardware
	echo "<h3> 2. Kelas Perangkat Keras </h3>";
	echo("====================================<br/>");
	echo("============ HARDWARE =============<br/>");
	echo $h->getPrice()."<br/>";
	echo $h->getId()."<br/>";
	echo $h->getBrand()."<br/>";
	echo $h->getModel()."<br/>";
	echo("====================================<br/>");
	
	//mengeset atribut class memory
	$m = new Memory();
	$m->setPrice("+ Price: Rp 365.000");
	$m->setId("+ Id Product: 11223344");
	$m->setBrand("+ Brand: Samsung");
	$m->setModel("+ Model: DDR4");
	$m->setFrequency("+ Frequency: 2666MHz");
	$m->setSize("+ Size Memory: 8GB");
	$m->setCuda("+ sports Cuda: Nvidia Gtx Gaming");
	
	//mencetak atribut class memory
	echo "<h3> 3. Kelas Memori </h3>";
	echo("====================================<br/>");
	echo("============== MEMORY ==============<br/>");
	echo $m->getPrice()."<br/>";
	echo $m->getId()."<br/>";
	echo $m->getBrand()."<br/>";
	echo $m->getModel()."<br/>";
	echo $m->getFrequency()."<br/>";
	echo $m->getSize()."<br/>";
	echo $m->getCuda()."<br/>";
	echo("====================================<br/>");

	
?>