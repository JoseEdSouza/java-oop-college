
# The class "Cabo" has a private attribute "raio" and a method "getRaio" to retrieve its value.
class Cabo:
    def __init__(self, raio):
        self.__raio = raio

    def getRaio(self):
        return self.__raio
