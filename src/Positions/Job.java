package Positions;

public class Job implements Positions {
    protected enum Positions {
        CASHIER,
        TASK_TEAM,
        FRAMING,
        CUTTING_COUNTER,
        ASSISTANT_MANAGER,
        STORE_MANAGER, ZONING
    }


    @Override
    public String PrintPosition() {
        return null;
    }
}
