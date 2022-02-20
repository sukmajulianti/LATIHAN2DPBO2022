class Product:
#kelas yang digunakan untuk mengimplementasikan kelas product
    def __init__(self):
    #konstruktor
        self.price = ""
        self.idProduct = ""
    
    def setPrice(self, price):
    #mengeset nilai atribut price
        self.price = price
    
    def getPrice(self):
    #mengembalikan nilai atribut price
        return self.price
    
    def setIdProduct(self, idProduct):
    #mengeset nilai atribut idProduct
        self.idProduct = idProduct
    
    def getIdProduct(self):
    #mengembalikan nilai atribut idProduct
        return self.idProduct
    