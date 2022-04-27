package app;

public class ElgaPortal {
    public static void main(String[] args) {
        Anmeldung anmeldungPatient = new Anmeldung(new Arzt(), "Müller", "1234");
        Anmeldung anmeldungArzt = new Anmeldung(new RegularPatient(), "Hermann", "456");

        System.out.println("System rennt\n");
        anmeldungPatient.anmelden();
        anmeldungArzt.anmelden();
        System.out.println("\nSystem wird beendet");
    }
}


