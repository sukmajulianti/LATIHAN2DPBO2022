from Hardware import Hardware

class Memory(Hardware):
#kelas yang digunakan untuk mengimplementasikan kelas memory

    def __init__(self):
    #konstruktor
        self.frequency = ""
        self.size = ""
        self.cuda = ""
        
    def setFrequency(self, frequency):
    #mengeset nilai atribut frequency
        self.frequency = frequency
        
    def getFrequency(self):
    #mengembalikan nilai atribut frequency
        return self.frequency
    
    def setSize(self, size):
    #mengeset nilai atribut size
        self.size = size
        
    def getSize(self):
    #mengembalikan nilai atribut size
        return self.size
        
    def setCuda(self, cuda):
    #mengeset nilai atribut cuda
        self.cuda = cuda
        
    def getCuda(self):
    #mengembalikan nilai atribut cuda
        return self.cuda
        
        