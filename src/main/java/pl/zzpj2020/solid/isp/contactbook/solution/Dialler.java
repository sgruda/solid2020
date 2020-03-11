package pl.zzpj2020.solid.isp.contactbook.solution;

public class Dialler implements Phone {
    @Override
    public void makeCall(Contact dialable) {
        String telephone = dialable.getTelephone();

        // call using telephone
    }
}
