class Client 
{
    public static void main(String[] args) {
        Utilizator Dan = new Utilizator("Dan");
        Utilizator Alex = new Utilizator("Alex");
        Utilizator Marius = new Utilizator("Marius");
        Grup Carnivorii = new Grup("Carnivorii", Alex);
        Carnivorii.inscrie(Dan);
        Carnivorii.inscrie(Marius);
        Carnivorii.inscrie(Alex);//Se va afisa exceptia arunjcata deoarece utilizatorul e duplicat
        Alex.trimite(Carnivorii, "Am deschuis magazinul");
        Marius.trimite(Carnivorii, "Vin acuma");
        System.out.println(Alex);
        System.out.println(Marius);
        System.out.println(Dan);
    }
}
