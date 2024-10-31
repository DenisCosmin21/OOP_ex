public class Client {
    public static void main(String[] args) {
        Firma emag = new Firma("Emag", 100);
        Angajat first = new Angajat("john", 10);
        Angajat second = new Angajat("Andrei", 1);
        Angajat third = new Angajat("Marius", 100);

        emag.adaugaAngajat(first);
        emag.adaugaAngajat(second);
        emag.adaugaAngajat(third);
        emag.adaugaAngajat(first);
        int[] data = emag.platesteSalarii()
;        System.out.println(data[0] + " " + data[1]);
    }
}
