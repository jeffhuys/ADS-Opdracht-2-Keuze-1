package project;

/**
 *
 * @author Jeff
 */
public class Main {
    private static Swapper swapper;

    public static void main(String[] args) {
        swapper = new Swapper();

        long timerStart = System.currentTimeMillis();
        System.out.println(swapper.print("poepiehee", 1));
        System.out.println("Took " + (System.currentTimeMillis() - timerStart) + "ms");
    }
}
