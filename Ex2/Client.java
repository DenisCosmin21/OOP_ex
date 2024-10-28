class Client {
    public static void main(String[] args) {
        Masina car1 = new Masina("abc", 5);
        Masina car2 = new Masina("def", 10);
        Masina car3 = new Masina("hgi", 15);

        Benzinarie petrom = new Benzinarie();

        petrom.alimenteazaMasina(car1);
        petrom.alimenteazaMasina(car2);
        petrom.alimenteazaMasina(car3);

        System.out.println(petrom);

        petrom.alimenteazaBenzinarie(15);

        System.out.println(petrom);
    }
}
