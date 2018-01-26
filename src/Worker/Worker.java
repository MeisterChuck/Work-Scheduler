package Worker;

public interface Worker {
    void setFirstName(String firstName);
    void setLastName(String lastName);
    void setSalary(double salary);
    void setManager(Boolean manager);
    String getFirstName();
    String getLastName();
    Double getSalary();
    Boolean getManager();
    void promotion(int promotion);
    String toString();
    String printSalary();
}
