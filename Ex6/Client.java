public class Client {
    public static void main(String[] args)
    {
        Desen drawing = new Desen("Cinema");
        Figura a = new Figura(20);
        Figura b = new Figura(30);
        Figura c = new Figura(20);
        drawing.adaugaFigura(a);
        drawing.adaugaFigura(b);
        drawing.adaugaFigura(c);
        drawing.adaugaFigura(a);
        System.out.println(drawing);
        System.out.println(drawing.medieArie());
    }
}
