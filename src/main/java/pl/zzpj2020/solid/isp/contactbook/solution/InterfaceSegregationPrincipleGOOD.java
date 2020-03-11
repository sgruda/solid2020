package pl.zzpj2020.solid.isp.contactbook.solution;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class InterfaceSegregationPrincipleGOOD {
    private Email email;
    private Phone phone;

    public static void main(String[] args) {

        InterfaceSegregationPrincipleGOOD interfaceSegregationPrinciple = new InterfaceSegregationPrincipleGOOD(new Emailer(), new Dialler());
        interfaceSegregationPrinciple.contactPeople();
    }

    public void contactPeople() {

        Contact contact = new Contact("Jan Kowalski", "Kielce", "jan.kowalski@gmail.com", "83744-23434");
        email.sendMessage(contact, "promocja", "tanio dzisiaj!");
        phone.makeCall(contact);
    }
}
