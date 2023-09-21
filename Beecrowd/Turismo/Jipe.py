# The class Jipe represents a vehicle with a certain number of passengers, and it has methods to get
# and set the number of passengers, as well as a method to end a ride and set the number of passengers
# to zero.
class Jipe:
    def __init__(self, numPassageiros) -> None:
        self.__numPassageriros = numPassageiros

    # * getters

    def getNumPassageiros(self) -> int:
        return self.__numPassageriros
    
    
    #* setters
    
    def setNumPassageiros(self,numPassageiros) -> None:
        self.__numPassageriros=numPassageiros
    

    #* funções
    
    def terminarCorrida(self) -> None:
        self.__numPassageriros = 0
    