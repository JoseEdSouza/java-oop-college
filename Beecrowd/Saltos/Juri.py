# The Juri class represents a judge who evaluates a competitor's performance and calculates their
# final score by removing the highest and lowest scores and multiplying the remaining scores by the
# competitor's jump difficulty.
from Competidor import Competidor


class Juri:
    def __init__(self, CompetidorAvaliado, Notas):
        self.__CompetidorAvaliado = CompetidorAvaliado
        self.__Notas = Notas

    # * getters

    def getCompetidorAvaliado(self) -> Competidor:
        return self.__CompetidorAvaliado

    def getNotas(self) -> list:
        return self.__Notas

    # * funções

    # devolve a soma das notas com exceção da maior e da menor multiplicado
    # pela dificuldade do salto
    def getResultado(self) -> float:
        """
        The function `getResultado` calculates the sum of a list of numbers after removing the maximum
        and minimum values, and then multiplies it by the jump difficulty of a competitor.
        :return: the sum of the list `resultado` after removing the maximum and minimum values,
        multiplied by the jump difficulty of the evaluated competitor.
        """
        resultado = self.__Notas
        resultado.remove(max(resultado))
        resultado.remove(min(resultado))
        return sum(resultado)*self.getCompetidorAvaliado().getJumpDiff()
