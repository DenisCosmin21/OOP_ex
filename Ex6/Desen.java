public class Desen 
{
    private String drawingName;

    private Figura[] figureList = new Figura[1024];
    private int figureCount = 0;

    public Desen(String drawingName)
    {
        this.drawingName = drawingName;
    }

    public boolean adaugaFigura(Figura newFigure)
    {
        if(this.figureCount >= 1024){
            System.err.println("Drawing full");
            return false;
        }
        for(int i = 0;i < this.figureCount;i++){
            if(this.figureList[i] == newFigure){//Comparam adresa pentru a sti daca este aceeasi figura sau nu
                System.err.println("Figure already in drawing");
                return false;
            }
        }

        this.figureList[this.figureCount++] = newFigure;

        return true;
    }

    public float medieArie()
    {
        float totalSurface = 0;

        for(int i = 0;i < this.figureCount;i++){
            totalSurface += this.figureList[i].getSurface();
        }

        return totalSurface / this.figureCount;
    }

    public String toString()
    {
        String retData = this.drawingName + " : ";

        for(int i = 0;i < this.figureCount;i++){
            retData += this.figureList[i] + ", ";
        }

        return retData;
    }
}
