package Data;

import Worker.Worker;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    private static EmployeeList soleEmployeeListInstance = null;

    private static ArrayList<Worker> workerList = new ArrayList<>();
    private static ObservableList<Worker> workerObservableList = FXCollections.observableArrayList();

    private EmployeeList() {
        System.out.println("Creating...");
    }

    public static EmployeeList getSoleEmployeeListInstance() {
        if(soleEmployeeListInstance == null) {
            soleEmployeeListInstance = new EmployeeList();
        }

        return soleEmployeeListInstance;
    }

    public void hire(Worker worker) {
        workerList.add(worker);
        workerObservableList.add(worker);
    }

    public List<Worker> getWorkerList() {
        return workerList;
    }

    public ObservableList<Worker> getWorkerObservableList() {
        return workerObservableList;
    }
}
