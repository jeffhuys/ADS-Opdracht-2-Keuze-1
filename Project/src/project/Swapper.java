package project;

/**
 *
 * @author Vincent
 */
public class Swapper {

    private String swappedWord = "";
    private String word;

    public String print(String s, int pos) {
        if (s.length() == 0) {
            return swappedWord;
        } else {
            if (s.length() == 1) {
                swappedWord += s.substring(0, s.length());
                word = "";
            } else {
                swappedWord += s.charAt(s.length() - 1);
                word = s.substring(0, s.length() - 1);
            }

            return print(word, pos + 1);
        }
    }
}
