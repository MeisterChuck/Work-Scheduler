package Data;

import Worker.Worker;

import java.util.ArrayList;

public class EmployeeList {
    ArrayList<Worker> employees = new ArrayList<Worker>();

    public void addWorker(Worker worker) {
        employees.add(worker);
    }
}
