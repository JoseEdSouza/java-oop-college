# The class "Destino" manages a list of "Jipe" objects, keeping track of the total number of
# passengers and providing methods to add and remove jipes.

class Destino:
    __jipes = []
    __qntdPessoas =0
    def __init__(self):
        pass
    
    def addJipe(self,jipe) -> None:
        """
        The function adds a jipe object to a list and updates the total number of passengers.
        
        :param jipe: The parameter "jipe" is an object of the class "Jipe"
        """
        self.__jipes.append(jipe)
        self.__qntdPessoas += self.__jipes[-1].getNumPassageiros()
        self.__jipes[-1].terminarCorrida()
        
    def removeJipe(self,qntdPessoas) -> None:
        """
        The function removes a specified number of people from a list of jipes.
        
        :param qntdPessoas: The parameter "qntdPessoas" represents the number of people to be removed
        from the jipe (jeep) object
        """
        self.__qntdPessoas -= qntdPessoas
        del self.__jipes[0]
        
    def show(self):
        """
        The function "show" prints the number of people and the length of the list of jipes.
        """
        print(self.__qntdPessoas)
        print(len(self.__jipes))