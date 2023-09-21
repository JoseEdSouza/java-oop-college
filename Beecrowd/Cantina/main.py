# The code is importing the `Pedido` class from the `Pedido` module and using it to create an instance
# of `Pedido` with the values `cod` and `qntd`. It then calls the `conta()` method on the `pedido`
# object and prints the result formatted as a string. The URL of the problem is:
# https://www.beecrowd.com.br/judge/pt/problems/view/1038

from Pedido import Pedido

if __name__ == "__main__":
    # The code is taking input from the user in the form of two integers separated by a space. It then
    # assigns the first integer to the variable `cod` and the second integer to the variable `qntd`.
    cod, qntd = [int(x) for x in input().split()]
    pedido = Pedido(cod, qntd)
    print('Total: R$ {conta:.2f}'.format(conta=pedido.conta()))
