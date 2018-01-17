package Worker;

public interface Worker {
    void SetFirstName(String firstName);
    void SetLastName(String lastName);
    void SetSalary(double salary);
    void Promotion(int promotion);
    String toString();
    String printSalary();
}
