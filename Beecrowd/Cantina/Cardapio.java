package Cantina;

// The code snippet provided is defining an enum called `Cardapio` which represents a menu of items in
// a cantina. Each item in the menu has a code (`cod`) and a price (`preco`). The enum constants
// `CACHORRO_QUENTE`, `X_SALADA`, `X_BACON`, `TORRADA_SIMPLES`, and `REFRIGERANTE` represent specific
// items in the menu with their respective codes and prices.
public enum Cardapio {
    CACHORRO_QUENTE(1,4.00),
    X_SALADA(2,4.50),
    X_BACON(3,5.00),
    TORRADA_SIMPLES(4,2.00),
    REFRIGERANTE(5,1.50);

    private final int cod;
    private final double preco;

    Cardapio(int cod, double preco){
        this.cod=cod;
        this.preco=preco;
    }
    //* getters */

    public int getCod() {
        return cod;
    }

    public double getPreco() {
        return preco;
    }
    
    //*funções */

    public double conta (int qntd){
        return this.preco * qntd;
    }

    
}   
