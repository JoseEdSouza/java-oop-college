# The class "Lanche" represents a food item with a code, price, and name, and provides getter methods
# to access these attributes.
class Lanche:
    
    def __init__(self, cod, price,name):
        self.__cod = cod
        self.__price = price
        self.__name = name
    
    # * getters

    def getCod(self) -> int:
        return self.__cod

    def getPrice(self) -> float:
        return self.__price

    def getName(self) -> str:
        return self.__name
