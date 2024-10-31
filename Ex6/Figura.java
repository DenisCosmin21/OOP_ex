class Figura
{
    private float surface;

    public Figura(float surface)
    {
        this.surface = surface;
    }

    public float getSurface()
    {
        return this.surface;
    }
    
    public String toString()
    {
        return "Figura - Arie : " + this.surface + " ";
    }
}