# The `Competition` class represents a competition with a list of competitors and their scores.
from Juri import Juri
from Competidor import Competidor


class Competition:
    __Competidores = []

    def __init__(self):
        pass

    # * getters

    def getCompetidores(self) -> list:
        return self.__Competidores

    # * funções

    def AddCompetidor(self, nome, jumpDiff, notas) -> None:
        """
        The function "AddCompetidor" adds a competitor with their name, jump difficulty, and scores to a
        list of competitors.
        
        :param nome: The parameter "nome" represents the name of the competitor
        :param jumpDiff: The parameter "jumpDiff" represents the difficulty level of the jump performed
        by the competitor. It is a numerical value that indicates how challenging the jump was
        :param notas: The parameter "notas" represents a list of scores given by the jury for a
        particular competitor
        """
        self.__Competidores.append(Juri(Competidor(nome, jumpDiff), notas))

    def __str__(self) -> str:
        """
        The function returns a formatted string representation of a list of competitors and their
        results.
        :return: The method `__str__` returns a string representation of the object.
        """
        retorno = ''
        for i in range(len(self.__Competidores)):
            if i != 0:
                retorno += '\n'
            retorno += '{nome} {resultado:.2f}'.format(
                nome=self.__Competidores[i].getCompetidorAvaliado().getName(), resultado=self.__Competidores[i].getResultado())

        return retorno
