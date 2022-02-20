from Product import Product

class Hardware(Product):
#kelas yang digunakan untuk mengimplementasikan kelas hardware

    def __init__(self):
    #konstruktor
        self.brand = ""
        self.model = ""
        
    def setBrand(self, brand):
    #mengeset nilai atribut brand
        self.brand = brand
        
    def getBrand(self):
    #mengembalikan nilai atribut brand
        return self.brand
    
    def setModel(self, model):
    #mengeset nilai atribut model
        self.model = model
        
    def getModel(self):
    #mengembalikan nilai atribut model
        return self.model
        