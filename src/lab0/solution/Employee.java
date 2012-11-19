package lab0.solution;

import lab0.*;
import java.util.Date;

/**
 * In this challenge you need to address the probability that at some point the
 * arguments to method parameters may not be valid. <p> For example, String
 * arguments may be null or empty; other objects may be null; or primitive
 * numbers may be out of acceptable range. <p> You need to validate ALL method
 * parameters to make sure any and all arguments are valid. The only exception
 * is when any argument is acceptable based on requirements. Fix the code below
 * using if logic to validate method arguments and throw
 * IllegalArgumentException or a custom exception if the validation fails.
 *
 * @author Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {

    public static final int MAX_VACATION_DAYS = 28;
    public static final int MIN_VACATION_DAYS = 0;
    private String firstName;
    private String lastName;
    private String ssn;
    private Date hireDate;
    private int daysVacation;
    private final String VACATION_DAYS =
            "The number of vacations days must be between 0 and " + MAX_VACATION_DAYS;
    private final String FIRST_NAME = 
            "First name entered was either null or has been left blank.";
    private final String LAST_NAME = 
            "The last name entered was either null or has been left blank.";
    private final String SSN_ERROR = 
            "The Social Security Number entered was either null or has been left blank.";
    private final String DATE_ERROR = "Null Object for the Date of Hire.";

    public Employee() {
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        hireDate = new Date();
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, Date hireDate, int daysVacation) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setSsn(ssn);
        this.setHireDate(hireDate);
        this.setDaysVacation(daysVacation);
    }

    public int getDaysVacation() {
        return daysVacation;
    }

    /**
     * Sets the number of vacation days allowed for this employee or the number
     * remaining for this employee
     *
     * @param daysVacation days of vacation allowed per year
     * @throws IllegalArgumentException if values not in range of 0 and 28
     */
    public void setDaysVacation(int daysVacation) throws IllegalArgumentException {
        if (daysVacation < MIN_VACATION_DAYS || daysVacation > MAX_VACATION_DAYS) {
            throw new IllegalArgumentException(VACATION_DAYS);
        }
        this.daysVacation = daysVacation;
    }

    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name for this employee
     * 
     * @param firstName first Name of the Employee
     * @throws IllegalArgumentException if the String is null or a length of 0
     */
    public void setFirstName(String firstName) throws IllegalArgumentException{
        if (firstName == null || firstName.length() == 0) {
            throw new IllegalArgumentException(FIRST_NAME);
        }
        this.firstName = firstName;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        if (hireDate == null) {
            throw new IllegalArgumentException(SSN_ERROR);
        }
        this.hireDate = hireDate;
    }

    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name for the Employee
     * 
     * @param lastName last name of the employee
     * @throws IllegalArgumentException if the String is null or a length of 0
     */
    public void setLastName(String lastName) throws IllegalArgumentException{
        if (lastName == null || lastName.length() == 0) {
            throw new IllegalArgumentException(DATE_ERROR);
        }
        this.lastName = lastName;
    }

    public final String getSsn() {
        return ssn;
    }

    /**
     * Set the Social Security Number for the Employee
     * 
     * @param ssn a String of the Employee Social Security Number
     * @throws IllegalArgumentException if the String is null or a length of 0
     */
    public void setSsn(String ssn) throws IllegalArgumentException{
        if (ssn == null || ssn.length() == 0) {
            throw new IllegalArgumentException(SSN_ERROR);
        }
        
        this.ssn = ssn;
    }
}
