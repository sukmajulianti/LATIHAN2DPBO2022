#include <iostream>
#include <string>

using namespace std;
#include "Product.cpp"
#include "Hardware.cpp"
#include "Memory.cpp"

int main(){
	//instansiasi
	Product p;
	Hardware h;
	Memory m;
	
	//mengeset atribut class product
	p.setPrice("-> Price: Rp 365.000");
	p.setId("-> Id Product: 11223344");
	
	//mencetak atribut class product
	cout << ("1. Kelas Produk") << endl;
	cout << ("====================================") << endl;
	cout << ("============= PRODUCT ==============") << endl;
	cout << p.getPrice() << endl;
	cout << p.getId() << endl;
	cout << ("====================================") << endl;
	cout << (" ") << endl;
	
	//mengeset atribut class hardware
	h.setPrice("-> Price: Rp 365.000");
	h.setId("-> Id Product: 11223344");
	h.setBrand("-> Brand: Samsung");
	h.setModel("-> Model: DDR4");
	
	//mencetak atribut class hardware
	cout << ("2. Kelas Perangkat Keras") << endl;
	cout << ("====================================") << endl;
	cout << ("============= HARDWARE =============") << endl;
	cout << h.getPrice() << endl;
	cout << h.getId() << endl;
	cout << h.getBrand() << endl;
	cout << h.getModel() << endl;
	cout << ("====================================") << endl;
	cout << (" ") << endl;
	
	//mengeset atribut class memory
	m.setPrice("-> Price: Rp 365.000");
	m.setId("-> Id Product: 11223344");
	m.setBrand("-> Brand: Samsung");
	m.setModel("-> Model: DDR4");
	m.setFrequency("-> Frequency: 2666MHz");
	m.setSize("-> Size Memory: 8GB");
	m.setCuda("-> sports Cuda: Nvidia Gtx Gaming");
	
	//mencetak atribut class memory
	cout << ("3. Kelas Memori") << endl;
	cout << ("====================================") << endl;
	cout << ("============== MEMORY ==============") << endl;
	cout << m.getPrice() << endl;
	cout << m.getId() << endl;
	cout << m.getBrand() << endl;
	cout << m.getModel() << endl;
	cout << m.getFrequency() << endl;
	cout << m.getSize() << endl;
	cout << m.getCuda() << endl;
	cout << ("====================================") << endl;

	return 0;
}