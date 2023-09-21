package BoardGame;

public class Jogo {
    private int NumJogadores;
    private boolean trap[];
    private boolean IsYourTurn[];
    private int position[];
    private boolean GameOver = false;
    private int numCasas;
    private int NextOne;

    // The `public Jogo(int NumJogadores, int numCasas)` constructor is initializing the Jogo (game)
    // object with the number of players and the number of houses on the game board.
    public Jogo(int NumJogadores, int numCasas) {
        this.NumJogadores = NumJogadores;
        this.numCasas = numCasas;
        this.position = new int[NumJogadores];
        this.IsYourTurn = new boolean[NumJogadores];
        this.trap = new boolean[numCasas + 13];
        this.NextOne = 0;
        for (int i = 0; i < NumJogadores; i++) {
            IsYourTurn[i] = true;
            position[i] = 0;
        }
        for (int i = 0; i <= numCasas; i++) {
            trap[i] = false;
        }
    }

    // *funções

    /**
     * The addTrap function adds a trap at a specified place in an array, but only if the place is
     * within the valid range.
     * 
     * @param place The parameter "place" represents the position of the trap in an array called
     * "trap". The method "addTrap" is used to add a trap at the specified position.
     */
    public void addTrap(int place) {
        if (place <= numCasas + 1 && place >= 1)
            trap[place] = true;
        else
            System.out.println("**ERROR-Casa inexistente.");
    }

    /**
     * The function "addMove" allows players to take turns rolling dice and moving their positions on a
     * game board, with special rules for traps and winning the game.
     * 
     * @param dice1 The value rolled on the first dice.
     * @param dice2 The parameter "dice2" represents the value rolled on the second dice in a game.
     */
    public void addMove(int dice1, int dice2) {
        if (GameOver) {
            System.out.println("**Warning:O jogo acabou.\n");
            return;
        } else {
            while (true) {
                if (IsYourTurn[NextOne]) {
                    position[NextOne] += dice1 + dice2;
                    System.out.printf("O jogador %d andou %d posições e foi para casa %d\n", NextOne + 1,
                            (dice1 + dice2), position[NextOne]);

                    if (trap[position[NextOne]]) {
                        System.out.printf(
                                "**Warning:O jogador %d caiu em uma armadilha e não poderá jogar no próximo turno.\n",
                                NextOne + 1);
                        IsYourTurn[NextOne] = false;
                    }

                    if (position[NextOne] > numCasas) {
                        System.out.printf("O jogador %d venceu o jogo!\n", NextOne + 1);
                        GameOver = true;
                        break;
                    }

                    if (NextOne + 1 <= NumJogadores - 1)
                        NextOne++;
                    else
                        NextOne = 0;

                    break;
                } else {
                    System.out.printf("O jogador %d passa a vez.\n", NextOne + 1);
                    IsYourTurn[NextOne] = true;

                    if (NextOne + 1 <= NumJogadores - 1)
                        NextOne++;
                    else
                        NextOne = 0;

                    continue;
                }
            }
        }
    }

    /**
     * The toString() function prints the position of each player in the game.
     * 
     * @return An empty string is being returned.
     */
    public String toString() {
        for (int i = 0; i < NumJogadores; i++) {
            System.out.printf("--Jogador[%d]: *posição-%d\n", i + 1, position[i]);
        }
        return "";
    }
}
