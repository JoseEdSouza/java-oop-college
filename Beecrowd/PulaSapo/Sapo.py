# The Sapo class represents a character that can jump over obstacles based on its jump height and the
# size of the obstacle.


class Sapo:
    def __init__(self, jumpHeight):
        self.__jumpHeight = jumpHeight
        self.__height = 1

    # * getters

    def getJumpHeight(self) -> int:
        return self.__jumpHeight

    # * setters

    def setHeight(self, height) -> None:
        self.__height = height

    # * funções

    def jump(self, obstacle) -> bool:
        """
        The function checks if a character can jump over an obstacle based on their jump height and the
        obstacle's size.
        
        :param obstacle: The parameter "obstacle" represents an object of the class "Obstacle"
        :return: a boolean value. It returns True if the height of the obstacle is within the jump
        height range of the object, and False otherwise.
        """
        if (((self.__jumpHeight+self.__height) >= obstacle.getSize())
                and (abs(self.__height-obstacle.getSize()) <= self.__jumpHeight)):
            self.__height = obstacle.getSize()
            return True
        else:
            return False
