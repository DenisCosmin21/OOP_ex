class Client {
    public static void main(String[] args){
        Jucator[] titular = new Jucator[2];
        titular[0] = new Jucator("Denis", 1);
        titular[1] = new Jucator("Andrei", 2);
        Jucator[] rezerva = new Jucator[2];
        rezerva[0] = new Jucator("Marius", 1);
        rezerva[1] = new Jucator("Ana", 1);
        Echipa upt = new Echipa(titular, rezerva);
        Jucator x = new Jucator("Ploiesti", 3);
        System.out.println(upt);
        upt.efectueazaSchimbare(titular[0], x);
        System.out.println(upt);
    }
}
