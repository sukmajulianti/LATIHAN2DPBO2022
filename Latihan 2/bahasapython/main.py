#import
from Product import Product
from Hardware import Hardware
from Memory import Memory

	#("-> Price: Rp 365.000");
	#("-> Id Product: 11223344");
	#("-> Brand: Samsung");
	#("-> Model: DDR4");
	#("-> Frequency: 2666MHz");
	#("-> Size Memory: 8GB");
	#("-> sports Cuda: Nvidia Gtx Gaming");
    
#instansiasi
p = Product()
h = Hardware()
m = Memory()

#mengeset isi atribut product p
p.setPrice("Rp 365.000");
p.setIdProduct("11223344");


#mencetak atribut product p
print("1. Kelas Produk")
print("====================================")
print("============= PRODUCT ==============")
print("-> Price: " + str(p.getPrice()))
print("-> Id Product: " + str(p.getIdProduct()))
print("====================================")
print("\n")

#mengeset isi atribut hardware h
h.setPrice("Rp 365.000");
h.setIdProduct("11223344");
h.setBrand("Samsung");
h.setModel("DDR4");

#mencetak isi atribut hardware h
print("2. Kelas Perangkat Keras")
print("====================================")
print("============= HARDWARE =============")
print("-> Price: " + str(h.getPrice()))
print("-> Id Product: " + str(h.getIdProduct()))
print("-> Brand: " + str(h.getBrand()))
print("-> Model: " + str(h.getModel()))
print("====================================")
print("\n")

#mengeset isi atribut memory m
m.setPrice("Rp 365.000");
m.setIdProduct("11223344");
m.setBrand("Samsung");
m.setModel("DDR4");
m.setFrequency("2666MHz");
m.setSize("8GB");
m.setCuda("Nvidia Gtx Gaming");

#mencetak isi atribut memory m
print("3. Kelas Memori")
print("====================================")
print("============== MEMORY ==============")
print("-> Price: " + str(m.getPrice()))
print("-> Id Product: " + str(m.getIdProduct()))
print("-> Brand: " + str(m.getBrand()))
print("-> Model: " + str(m.getModel()))
print("-> Frequency: " + str(m.getFrequency()))
print("-> Size Memory: " + str(m.getSize()))
print("-> sports Cuda: " + str(m.getCuda()))
print("====================================")