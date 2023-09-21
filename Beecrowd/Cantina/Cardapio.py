# The `Cardapio` class represents a menu with a list of food items, and it provides a method to
# retrieve a specific item based on its code, price, or name.
from Lanche import Lanche


class Cardapio:
    # The line `CARDAPIO = [Lanche(1, 4.00, 'Cachorro Quente'), Lanche(2, 4.50, 'X-salada'), Lanche(3,
    # 5.00, 'X-bacon'), Lanche(4, 2.00, 'Torrada simples'), Lanche(5, 1.50, 'Refrigerante')]` is
    # creating a list called `CARDAPIO` that contains instances of the `Lanche` class. Each instance
    # represents a different item on the menu, with its respective code, price, and name.
    CARDAPIO = [Lanche(1, 4.00, 'Cachorro Quente'), Lanche(2, 4.50, 'X-salada'), Lanche(3, 5.00, 'X-bacon'),
                  Lanche(4, 2.00, 'Torrada simples'), Lanche(5, 1.50, 'Refrigerante')]

    @staticmethod
    def getLanche(arg) -> Lanche:
        """
        The `getLanche` function in the Python code snippet is a static method that takes an argument
        and returns a `Lanche` object based on the type of the argument.
        
        :param arg: The `arg` parameter can be of type `int`, `float`, or `str`
        :return: The method `getLanche` returns an instance of the `Lanche` class.
    """
        if isinstance(arg, int):
            for i in Cardapio.CARDAPIO:
                if i.getCod() == arg:
                    return i
        elif isinstance(arg, float):
            for i in Cardapio.CARDAPIO:
                if i.getPrice() == arg:
                    return i
        elif isinstance(arg, str):
            for i in Cardapio.CARDAPIO:
                if i.getName() == arg:
                    return i
        return Lanche(None, None, None)
