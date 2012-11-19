package lab3.solution;

import lab3.*;

/**
 * This class provides various services relating to name manipulation.
 * No output should be performed here.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class NameService {
    private static final int FIRST_NAME_IDX = 0;
    private static final int LAST_NAME_IDX = 1;
        private static final String ARRAY_ERROR = 
            "Please enter your First and Last name\n(No middle initial).";
    private static final String LAST_NAME_LENGTH = "Please enter your full last name.";
    private static final String FIRST_NAME_LENGTH = 
            "Please enter your full first name.";
    private static final String EMPTY_NAME_LENGTH = 
            "Name is null  or blank, so the length can't be determined.";
    
    /**
     * Finds and returns the last name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     * @throws IndexOutOfBoundsException if the 2nd element of the array is null
     * @throws IllegalArgumentException if the 2nd Array element has a length of 1
     */
    public String extractLastName(String fullName) 
            throws IndexOutOfBoundsException, InvalidNameException {
        fullName = fullName.trim();
        String[] nameParts = fullName.split(" ");
        if (!(nameParts.length == 2)){
            throw new IndexOutOfBoundsException(ARRAY_ERROR);
        }
        if (nameParts[1].length() == 1){
            throw new InvalidNameException(LAST_NAME_LENGTH);
        }
        return nameParts[LAST_NAME_IDX];
    }
    
    /**
     * Finds and returns the first name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the first name
     * @throws IndexOutOfBoundsException if the array length is not 2
     * @throws IllegalArgumentException if the first Array element has a length of 1
     */
    public String extractFirstName(String fullName) 
            throws IndexOutOfBoundsException, InvalidNameException{
        fullName = fullName.trim();
        String[] nameParts = fullName.split(" ");
        if (!(nameParts.length == 2)){
            throw new IndexOutOfBoundsException(ARRAY_ERROR);
        }
        if (nameParts[0].length() == 1){
            throw new InvalidNameException(FIRST_NAME_LENGTH);
        }
        return nameParts[FIRST_NAME_IDX];
    }

    /**
     * Gets the length of a name.
     * 
     * @param name - any full name or part of a name.
     * @return the length of the name or part.
     * @throws  NullPointerException if the String is null or the length is 0
     */
    public int getNameLength(String name) throws NullPointerException{
        name = name.trim();
        if (name == null || name.length() == 0){
            throw new NullPointerException(EMPTY_NAME_LENGTH);
        }
        return name.length();
    }
    
}
