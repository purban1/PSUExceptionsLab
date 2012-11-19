package lab3.solution;

import javax.swing.JOptionPane;

/**
 * This class handles an InvalidNameException
 * 
 * @author production
 */
public class InvalidNameException extends IllegalArgumentException{
    
    
    public InvalidNameException(){
        
    }
    
    public InvalidNameException(String s){
        super("External Exception class here -->\n " + s);
    }
    
    
    
}
