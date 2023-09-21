# The `Obstaculo` class represents an obstacle with a specific size.
class Obstaculo:
    def __init__(self,size):
        self.__size =size
    
    # *getters
    
    def getSize(self) -> int:
        return self.__size