package pl.zzpj2020.solid.ocp.usa.solution;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class USASpeedLimitFines {
    private StateSpeedLimit state;

    public double calcualateSpeedLimitFine(int speed) {
        return this.state.calcualateSpeedLimitFine(speed);
    }
}
