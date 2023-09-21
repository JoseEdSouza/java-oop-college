# The code is importing the `Jogo` class from a module called `Jogo`. It then takes user input and
# uses it to create an instance of the `Jogo` class. It also takes additional user input to add
# obstacles to the game. Finally, it calls the `GameOver` method of the `Jogo` instance.
# https://www.beecrowd.com.br/judge/pt/problems/view/1961

from Jogo import Jogo

if __name__ == "__main__":
    # The code is taking user input and using it to create an instance of the `Jogo` class.
    cmd = []
    comando = input()
    cmd = comando.split()
    game = Jogo(int(cmd[0]), int(cmd[1]))
    comando = input()
    cmd = comando.split()
    for i in range(game.getNumObstaculos()):
        game.addObstaculo(int(cmd[i]))
    game.GameOver()
