/**
 * The Main class in the Agiota package demonstrates the functionality of an Agiota object by adding
 * clients, lending and receiving money, and checking the status of the Agiota object.
 */
package LoanShark;

public class Main {
    public static void main(String[] args) {
        LoanShark ag = new LoanShark(500);
        ag.addCli("maria", 500);
        ag.addCli("josue", 60);
        ag.addCli("maria", 300); // fail

        ag.lend("maria", 300);
        ag.lend("josue", 50);
        ag.lend("maria", 100);

        System.out.println(ag); // check

        ag.lend("bruno", 30);// fail
        ag.lend("maria", 60);// fail
        ag.lend("josue", 30);// fail

        System.out.println(ag); // check

        ag.receive("maria", 1000);// fail
        ag.receive("maria", 350);
        ag.receive("josue", 1);
        ag.receive("maria", 10);

        System.out.println(ag); // check

        ag.kill("maria");

        System.out.println(ag); // check
    }
}
