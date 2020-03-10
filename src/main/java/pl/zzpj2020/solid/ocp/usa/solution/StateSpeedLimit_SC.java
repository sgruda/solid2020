package pl.zzpj2020.solid.ocp.usa.solution;

public class StateSpeedLimit_SC implements StateSpeedLimit {
    private static final int SC_MAX_SPEED = 0;
    @Override
    public double calcualateSpeedLimitFine(int speed) {
        double fine = 0;
        if (speed > SC_MAX_SPEED) {
            // calculate...
        }
        return fine;
    }
}