/**
 * The App class is the main class that controls the execution of the Motorcycle program.
 */
package Motorcycle;

public class App {
    static Shell sh = new Shell();
    static Motorcycle motoca = new Motorcycle(1);

    public static void main(String[] args) {

        sh.setfn("init", () -> motoca = new Motorcycle(toInt(sh.par(1))));
        sh.setfn("buy", () -> motoca.buyTime(toInt(sh.par(1))));
        sh.setfn("enter", () -> motoca.enter(new People(sh.par(1), toInt(sh.par(2)))));
        sh.setfn("drive", () -> motoca.drive(toInt(sh.par(1))));
        sh.setfn("leave", () -> {
            People person = motoca.leave();
            if (person != null) {
                System.out.println(person.toString());
            }
        });
        sh.setfn("honk", () -> motoca.honk());
        sh.setfn("show", () -> System.out.println(motoca));

        sh.execute();
    }

    static int toInt(String s) {
        return Integer.parseInt(s);
    }
}
