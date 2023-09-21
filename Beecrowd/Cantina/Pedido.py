# The `Pedido` class represents a customer's order and calculates the total cost based on the selected
# item and quantity.
from Cardapio import Cardapio


class Pedido:
    def __init__(self, arg, qntd):
        self.__lanche = Cardapio.getLanche(arg)
        self.__qntd = qntd

    def conta(self) -> float:
        return self.__lanche.getPrice() * self.__qntd
