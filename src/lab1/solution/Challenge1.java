package lab1.solution;

import lab1.*;
import javax.swing.JOptionPane;

/**
 * The purpose of this challenge is to give you practice time using Java
 * Exception handling techniques. <p> Your challenge is to consider all the
 * possible things that can go wrong with this program and use exception
 * handling where appropriate to prevent the program from crashing. In addition
 * you must display a friendly error message in a JOptionPane and ask the user
 * to try again.
 *
 * @author Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Challenge1 {

    private static final int LAST_NAME_IDX = 1;
    static final String ARRAY_ERROR = 
            "Please enter your First and Last name\n(No middle initial).";
    static final String LAST_NAME_LENGTH = 
            "Please enter your full last name.";

    public static void main(String[] args) 
            throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
        boolean passed = false;
        Challenge1 app = new Challenge1();

        while (!(passed)) {
            try {
                String fullName = JOptionPane.showInputDialog("Enter full name:");
                String lastName = app.extractLastName(fullName);
                String msg = "Your last name is: " + lastName;
                JOptionPane.showMessageDialog(null, msg);
                passed = true;
            } catch (ArrayIndexOutOfBoundsException aob) {
                JOptionPane.showMessageDialog(null, aob.getMessage());
            } catch (IllegalArgumentException iae){
                JOptionPane.showMessageDialog(null, iae.getMessage());
            }

        }
    }

    public String extractLastName(String fullName) {
        fullName = fullName.trim();
        String[] nameParts = fullName.split(" ");
        if (!(nameParts.length == 2)){
            throw new ArrayIndexOutOfBoundsException(ARRAY_ERROR);
        }
        if (nameParts[1].length() == 1){
            throw new IllegalArgumentException(LAST_NAME_LENGTH);
        }
        return nameParts[LAST_NAME_IDX];
    }
}
