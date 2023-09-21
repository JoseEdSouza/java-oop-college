from Sapo import Sapo
from Obstaculo import Obstaculo


# The class "Jogo" represents a game where a player controls a frog to jump over obstacles, and the
# class contains methods to add obstacles, check if the player has successfully jumped over all
# obstacles, and get information about the frog and obstacles.
class Jogo:
    __Obstaculos = []

    def __init__(self, sapoJumpHeight, numObstaculos):
        self.__sapo = Sapo(sapoJumpHeight)
        self.__numObstaculos = numObstaculos

    # * getters

    def getSapo(self) -> Sapo:
        return self.__sapo

    def getObstaculo(self, index) -> Obstaculo:
        return self.__Obstaculos[index]

    def getNumObstaculos(self) -> int:
        return self.__numObstaculos
    

    # * funções

    def addObstaculo(self, ObstacleHeight) -> None:
        """
        The function adds an obstacle with a specified height to a list of obstacles.
        
        :param ObstacleHeight: The parameter "ObstacleHeight" represents the height of the obstacle that
        you want to add
        """
        self.__Obstaculos.append(Obstaculo(ObstacleHeight))

    def GameOver(self) -> bool:
        """
        The function checks if the player has successfully jumped over all obstacles and returns True if
        they have, otherwise it returns False and prints "GAME OVER".
        :return: a boolean value. If the player wins the game, it returns True. If the player loses the
        game, it returns False.
        """
        self.__sapo.setHeight(self.__Obstaculos[0].getSize())
        for i in range(1,len(self.__Obstaculos)):
            if self.__sapo.jump(self.__Obstaculos[i]):
                continue
            else:
                print('GAME OVER')
                return False
        
        print('YOU WIN')
        return True