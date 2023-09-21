# The code is creating an instance of the `Competition` class and assigning it to the variable
# `competicao`. It then takes an input `n` which represents the number of competitors. It then takes
# input for each competitor's name, jump difficulty, and grades. The grades are split into a list of
# floats and passed to the `AddCompetidor` method of the `competicao` object. Finally, it prints the
# `competicao` object, which likely displays the competition results.
# https://www.beecrowd.com.br/judge/pt/problems/view/2311

from Competition import Competition

if __name__ == '__main__':
    # The code is creating an instance of the `Competition` class and assigning it to the variable
    # `competicao`.
    competicao = Competition()

    n = int(input())

    for i in range(n):
        nome = input()
        jumpDiff = float(input())
        nextLine = input()
        grades = nextLine.split()
        notas = []
        for i in range(len(grades)):
            notas.append(float(grades[i]))

        competicao.AddCompetidor(nome, jumpDiff, notas)

    print(competicao)
