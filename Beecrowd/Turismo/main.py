# The code snippet is a Python script that interacts with a `Destino` class and a `Jipe` class. It
# reads user input commands and performs actions based on those commands.
# https://www.beecrowd.com.br/judge/pt/problems/view/2708

from Destino import Destino
from Jipe import Jipe

if __name__ == '__main__':
    # The code snippet is creating an instance of the `Destino` class and assigning it to the variable
    # `praia`.
    praia = Destino()
    while True:
        comando = input()
        args = comando.split()
        if args[0] == "ABEND":
            praia.show()
            break
        elif args[0] == "SALIDA":
            praia.addJipe(Jipe(int(args[1])))
        elif args[0] == "VUELTA":
            praia.removeJipe(int(args[1]))
        else:
            print('fail: invalid command')
