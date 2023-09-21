# The Motor class has a private attribute rpm and a method to get the value of rpm.
class Motor:
    def __init__(self, rpm):
        self.__rpm = rpm

    def getRpm(self):
        return self.__rpm
