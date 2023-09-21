# The `Blusa` class represents a blouse with attributes for color and size.
from Tamanho import Tamanho

class Blusa:
    def __init__(self, cor, tamanho):
        self.__cor = cor
        if tamanho == 'P':
            self.__tamanho = Tamanho.P
        elif tamanho == 'M':
            self.__tamanho = Tamanho.M
        elif tamanho == 'G':
            self.__tamanho = Tamanho.G
            
    # * getters

    def getCor(self) -> str:
        return self.__cor

    def getTamanho(self) -> Tamanho:
        return self.__tamanho