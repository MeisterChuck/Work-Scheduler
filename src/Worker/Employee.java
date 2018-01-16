package Worker;

import java.text.NumberFormat;
import java.util.Locale;

public class Employee implements Worker {
    protected String firstName;
    protected String lastName;
    protected double salary = 0.00;

    Employee() {
        firstName = "New";
        lastName = "Hire";
    }

    Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    @Override
    public void SetFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void SetLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public void SetSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void Promotion(int promotion) {
        this.salary += promotion;
    }

    @Override
    public String PrintName() {
        return this.lastName + ", " + this.firstName;
    }

    @Override
    public String PrintSalary() {
        Locale locale = new Locale("en", "US");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        return currencyFormatter.format(salary);
    }
}
