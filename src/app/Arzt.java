package app;

public class Arzt implements Benutzeroperation {
    @Override
    public void anmelden(String name, String password) {
        System.out.println(name + " will registrated as physician. PSWD: " + password);
    }
}


