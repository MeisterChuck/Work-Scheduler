package Worker;

import java.time.LocalDate;

public interface Worker {
    void setFirstName(String firstName);
    void setLastName(String lastName);
    void setSalary(double salary);
    void setManager(Boolean manager);
    String getFirstName();
    String getLastName();
    Double getSalary();
    Boolean getManager();
    LocalDate getDateOfHire();
    void promotion(int promotion);
    String printSalary();
    String toString();
}
