public class Client {
    public static void main(String[] args) {
        Portofel x = new Portofel("denis");
        x.adaugaCard("1234", 2);
        x.adaugaCard("1234", 8);
        x.adaugaCard("2345", 100);
        System.out.println(x);
        System.out.println(x.calculeazaSold());
    }
}
