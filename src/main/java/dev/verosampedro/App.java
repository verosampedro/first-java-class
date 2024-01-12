package dev.verosampedro;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Person vero = new Person("Vero", "Sampedro", 20092002, 2002, "Spain", 'F');
        Person javier = new Person("Javier", "Calvo", 10032002, 2002, "Cuba", 'H');
        vero.printPersonInfo();
        System.out.println("---------------------------------");
        javier.printPersonInfo();
    }
}
