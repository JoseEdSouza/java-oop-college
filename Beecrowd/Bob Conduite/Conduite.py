from Cabo import Cabo


# The class Conduite represents a conduit that combines two cables by adding their radii.
class Conduite(Cabo):
    def __init__(self, cabo1, cabo2):
        raio = cabo1.getRaio()+cabo2.getRaio()
        super().__init__(raio)
