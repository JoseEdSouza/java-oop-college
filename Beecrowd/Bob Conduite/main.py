# The code is solving a problem from the website beecrowd.com.br. It imports two classes, `Cabo` and
# `Conduite`, from separate files.

# https://www.beecrowd.com.br/judge/pt/problems/view/1589

from Cabo import Cabo
from Conduite import Conduite


if __name__ == '__main__':
    # The code is taking input from the user to determine the number of test cases (`numTestes`).
    # Then, it creates an empty list called `conduiteList` to store instances of the `Conduite` class.
    numTestes = input()
    conduiteList = []
    for i in range(int(numTestes)):
        raio1, raio2 = [int(x) for x in input().split()]
        conduiteList.append(Conduite(Cabo(raio1), Cabo(int(raio2))))
    for i in conduiteList:
        print(i.getRaio())
