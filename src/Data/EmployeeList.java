package Data;

import Worker.Worker;

import java.util.ArrayList;

public class EmployeeList {
    /*ArrayList<Worker> employees = new ArrayList<Worker>();

    public void addWorker(Worker worker) {
        employees.add(worker);
    }*/
    private static EmployeeList firstInstance = null;
    private ArrayList<Worker> employees = new ArrayList<Worker>();

    private EmployeeList(){

    }

    public static EmployeeList getInstance() {
        if (firstInstance == null) {
            synchronized (EmployeeList.class) {
                if (firstInstance == null) {
                    firstInstance = new EmployeeList();
                }
            }
        }

        return firstInstance;
    }

    public void hireWorker(Worker worker) {
        employees.add(worker);

        System.out.println(worker.toString());
        System.out.println(employees);
    }
}
