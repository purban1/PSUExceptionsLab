package lab2.solution;

import lab2.*;
import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 *
 * @author Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {

    private NameService nameService;

    public InputOutputGui() {
        nameService = new NameService();
    }

    public void startConversation() {

        try {
            String fullName = JOptionPane.showInputDialog("Enter full name:");
            String lastName = nameService.extractLastName(fullName);
            String msg = "Your last name is: " + lastName;
//            String firstName = nameService.extractFirstName(fullName);
//            String msg = "Your first name is: " + firstName;
//            int length = nameService.getNameLength(fullName);
//            String msg = "The length of the name is: " + length;
            JOptionPane.showMessageDialog(null, msg);
        } catch (IllegalArgumentException iae) {
            JOptionPane.showMessageDialog(null, iae.getMessage());
        } catch (IndexOutOfBoundsException aob) {
            JOptionPane.showMessageDialog(null, aob.getMessage());
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(null, npe.getMessage());

        }
    }
}
