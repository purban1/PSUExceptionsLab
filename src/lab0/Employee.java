package lab0;

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

    public Employee() {
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        hireDate = new Date();
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, Date hireDate, int daysVacation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.hireDate = hireDate;
        this.daysVacation = daysVacation;
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
        this.hireDate = hireDate;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public final String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
}
