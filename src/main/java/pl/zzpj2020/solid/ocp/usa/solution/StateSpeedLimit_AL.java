package pl.zzpj2020.solid.ocp.usa.solution;

public class StateSpeedLimit_AL implements StateSpeedLimit {
    private static final int AL_MAX_SPEED = 0;
    @Override
    public double calcualateSpeedLimitFine(int speed) {
        double fine = 0;
        if (speed > AL_MAX_SPEED) {
            // calculate...
        }
        return fine;
    }
}
