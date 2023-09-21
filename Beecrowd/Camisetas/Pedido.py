# The class "Pedido" represents a customer order, which includes the customer's name and the shirt
# they ordered.
from Blusa import Blusa

class Pedido:

    pedidos = []

    def __init__(self, nome, camisa):
        self.__nome = nome
        self.__camisa = camisa

    # * funções

    @staticmethod
    def addPedido(pedido) -> None:
        Pedido.pedidos.append(pedido)

    @staticmethod
    def pedido_sort_name(pedido) -> str:
        return pedido.getNome()

    @staticmethod
    def clearList() -> None:
        Pedido.pedidos = []

    def __str__(self) -> str:
        return self.getCamisa().getCor() + ' ' + self.getCamisa().getTamanho().name + ' ' + self.__nome

    # * getters

    def getNome(self) -> str:
        return self.__nome

    def getCamisa(self) -> Blusa:
        return self.__camisa