class Main{
	
	/* ("-> Price: Rp 365.000");
	("-> Id Product: 11223344");
	("-> Brand: Samsung");
	("-> Model: DDR4");
	("-> Frequency: 2666MHz");
	("-> Size Memory: 8GB");
	("-> sports Cuda: Nvidia Gtx Gaming"); */
	
	public static void main(String[] args){
	//create new class
	Product part_product; 
	Hardware part_hardware; 
	Memory part_memory; 
	
	
	part_product = new Product(); //call base class method
	part_product.setPrice("-> Price: Rp 365.000");
	part_product.setId("-> Id Product: 11223344");
	
	System.out.println("1. Kelas Produk");
	System.out.println("====================================");
	System.out.println("============= PRODUCT ==============");
	System.out.println(part_product.getPrice());
	System.out.println(part_product.getId());
	System.out.println(part_product.getPrice());
	System.out.println("====================================\n");
	
	part_hardware = new Hardware(); //call derived class 1 method
	part_hardware.setPrice("-> Price: Rp 365.000");
	part_hardware.setId("-> Id Product: 11223344");
	part_hardware.setBrand("-> Brand: Samsung");
	part_hardware.setModel("-> Model: DDR4");
	
	System.out.println("2. Kelas Perangkat Keras");
	System.out.println("====================================");
	System.out.println("============= HARDWARE =============");
	System.out.println(part_hardware.getPrice());
	System.out.println(part_hardware.getId());
	System.out.println(part_hardware.getBrand());
	System.out.println(part_hardware.getModel());
	System.out.println("====================================\n");
	
	part_memory = new Memory(); //call derived class 2 method
	part_memory.setPrice("-> Price: Rp 365.000");
	part_memory.setId("-> Id Product: 11223344");
	part_memory.setBrand("-> Brand: Samsung");
	part_memory.setModel("-> Model: DDR4");
	part_memory.setFrequency("-> Frequency: 2666MHz");
	part_memory.setSize("-> Size Memory: 8GB");
	part_memory.setCuda("-> sports Cuda: Nvidia Gtx Gaming");
	
	System.out.println("3. Kelas Memori");
	System.out.println("====================================");
	System.out.println("============== MEMORY ==============");
	System.out.println(part_memory.getPrice());
	System.out.println(part_memory.getId());
	System.out.println(part_memory.getBrand());
	System.out.println(part_memory.getModel());
	System.out.println(part_memory.getFrequency());
	System.out.println(part_memory.getSize());
	System.out.println(part_memory.getCuda());
	System.out.println("====================================");
	
	}
}