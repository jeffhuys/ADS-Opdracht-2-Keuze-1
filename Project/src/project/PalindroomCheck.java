/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Jeff
 */
public class PalindroomCheck {

    public boolean checkPalindroom(String s) {
        if (s.length() <= 1) {
            // Dan altijd palindroom
            return true;
        }
        
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return checkPalindroom(s.substring(1, s.length() - 1));
        }
        return false;
    }
}
