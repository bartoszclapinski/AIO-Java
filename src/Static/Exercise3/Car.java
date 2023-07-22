package Static.Exercise3;

public class Car {
    public static final int START_SUCCESS = 100;
    public static final int ENGINE_FAILURE = 200;
    public static final int NO_FUEL = 300;
    public static final int FUEL_CAP_OPEN = 400;
    public static final int DOOR_OR_TRUNK_OPEN = 500;

    private boolean hasFuel = true;
    private boolean isEngineOk = true;
    private boolean isFuelCapClosed = true;
    private boolean areDoorsAndTrunkClosed = true;
    private boolean isEngineRunning = false;

    public int start() {
        if (!isEngineOk) return ENGINE_FAILURE;
        if (!hasFuel) return NO_FUEL;
        isEngineRunning = true;
        if (!isFuelCapClosed) return FUEL_CAP_OPEN;
        return !areDoorsAndTrunkClosed ? DOOR_OR_TRUNK_OPEN : START_SUCCESS;
    }

    public String status() {
        if (isEngineOk && hasFuel && isFuelCapClosed && areDoorsAndTrunkClosed)
            return "All systems are functioning, you can go on a safe journey";
        String status = "";
        if (!isEngineOk) status += "Engine failure. ";
        if (!hasFuel) status += "Out of fuel. ";
        if (!isFuelCapClosed) status += "Fuel cap is open. ";
        if (!areDoorsAndTrunkClosed) status += "Doors or trunk are open. ";
        return status.trim();
    }

    public void setHasFuel(boolean hasFuel) {
        this.hasFuel = hasFuel;
        if (!hasFuel) {
            isEngineRunning = false;
        }
    }

    public void setEngineOk(boolean engineOk) {
        this.isEngineOk = engineOk;
        if (!engineOk) {
            isEngineRunning = false;
        }
    }

    public void setFuelCapClosed(boolean fuelCapClosed) {
        this.isFuelCapClosed = fuelCapClosed;
    }

    public void setDoorsAndTrunkClosed(boolean doorsAndTrunkClosed) {
        this.areDoorsAndTrunkClosed = doorsAndTrunkClosed;
    }
}
