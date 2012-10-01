package project;

/**
 *
 * @author Jeff
 */
public class Main {
    public static void main(String[] args) {
        Swapper swapper = new Swapper();

        // Swapper
        long timerStart = System.currentTimeMillis();
        String swapped = swapper.print("poepiehee", 1);
        System.out.println(swapped);
        System.out.println("Took " + (System.currentTimeMillis() - timerStart) + "ms");

        // Palindroom
        PalindroomCheck p = new PalindroomCheck();
        boolean palindroom = p.checkPalindroom("parterretrap");
        System.out.println("Palindroom: " + palindroom);
    }
}
