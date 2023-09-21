package Balance;

public enum Planeta {
    // The code snippet is defining an enum called `Planeta` which represents different planets in our
    // solar system. Each planet is defined with its mass and radius values.
    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6),
    MARS(6.421e+23, 3.3972e6),
    JUPITER(1.9e+27, 7.1492e7),
    SATURN(5.688e+26, 6.0268e7),
    URANUS(8.686e+25, 2.5559e7),
    NEPTUNE(1.024e+26, 2.4746e7);

    private final double massa;
    private final double raio;

    Planeta(double massa, double raio) {
        this.massa = massa;
        this.raio = raio;
    }

    // The line `private static final double G = 6.67300e-11;` is declaring a private static final
    // variable named `G` and assigning it a value of `6.67300e-11`.
    private static final double G = 6.67300e-11;

    /**
     * The function calculates the gravitational force using the mass, gravitational constant, and
     * radius.
     * 
     * @return The method is returning the value of the gravitational force, which is calculated by
     * multiplying the mass by the gravitational constant (G) and dividing it by the square of the
     * radius.
     */
    public double gravidade() {
        return ((massa * G) / Math.pow(raio, 2));
    }

    /**
    * The function calculates the weight of an object by multiplying its mass with the acceleration due
    * to gravity.
    * 
    * @param objectMass The objectMass parameter represents the mass of an object.
    * @return The method is returning the product of the object mass and the value returned by the
    * "gravidade()" method.
    */
    public double peso(double objectMass) {
        return (objectMass * gravidade());
    }

}
