# The Competidor class represents a competitor with a name and a jump difficulty.
class Competidor:
    def __init__(self, name, jumpDiff):
        self.__name = name
        self.__jumpDiff = jumpDiff
    
    #* getters
    
    def getName(self) -> str:
        return self.__name

    def getJumpDiff(self) -> float:
        return self.__jumpDiff
