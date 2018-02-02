package Worker;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class Employee implements Worker {
    private String firstName;
    private String lastName;
    private double salary = 0.00;
    private boolean manager = false;
    private LocalDate hireDate;

    Employee() {
        firstName = "New";
        lastName = "Hire";
        this.salary = 8.00;
        this.manager = false;
        this.hireDate = LocalDate.now();
    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void setManager(Boolean manager) { this.manager = manager; }

    @Override
    public void setHireDate(LocalDate hireDate) { this.hireDate = hireDate; }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public Double getSalary() {
        return salary;
    }

    @Override
    public Boolean getManager() {
        return manager;
    }

    @Override
    public LocalDate getDateOfHire() {
        return hireDate;
    }

    @Override
    public void promotion(int promotion) {
        this.salary += promotion;
    }

    @Override
    public String printSalary() {
        Locale locale = new Locale("en", "US");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        return currencyFormatter.format(salary);
    }

    @Override
    public String toString() {
        /*return this.lastName + ", " + this.firstName + "\n"
                + "Salary: " + printSalary() + "\n"
                + "Manager: " + getManager() + "\n"
                + "Date of Hire: " + hireDate + "\n";*/

        return this.lastName + ", " + this.firstName;
    }
}
