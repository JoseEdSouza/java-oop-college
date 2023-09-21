# The `Teste` class has methods to add motors to a list and find the index of the first motor with a
# lower RPM than the previous motor.
class Teste:
    def __init__(self):
        pass

    __motores = []

    def addMotor(self, motor) -> None:
        self.__motores.append(motor)

    def findError(self) -> int:
        """
        The function `findError` returns the index of the first motor in the list `self.__motores` that
        has a lower RPM than the previous motor, or 0 if no such motor is found.
        :return: the index of the motor that has a lower RPM than the previous motor.
        """
        errorIndex = 0
        for i in range(1, len(self.__motores)):
            if (self.__motores[i].getRpm() < self.__motores[i-1].getRpm()):
                errorIndex = i
                return errorIndex+1
        return errorIndex
