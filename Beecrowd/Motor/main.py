# The code is a Python script that performs a series of tests on motors.
# https://www.beecrowd.com.br/judge/pt/problems/view/2167

from Teste import Teste
from Motor import Motor

if __name__ == "__main__":
    # The code is taking user input to determine the number of tests to be performed. It then takes
    # another input which contains a series of numbers separated by spaces. These numbers represent
    # the performance of different motors.
    cmd = []
    comando = input()
    qntdTestes = int(comando)
    t = Teste()
    comando = input()
    cmd = comando.split()
    for i in range(qntdTestes):
        t.addMotor(Motor(int(cmd[i])))
        print(t.findError())
