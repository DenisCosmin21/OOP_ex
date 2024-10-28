class Masina
{
    private String licensePlate;
    private int fuelTank;

    public Masina(String licensePlate, int fuelTank)
    {
        this.licensePlate = licensePlate;
        this.fuelTank = fuelTank;
    }

    public int getFuelTank()
    {
        return this.fuelTank;
    }

    public String getLicensePlate()
    {
        return this.licensePlate;
    }

    public String toString()
    {
        return this.licensePlate + " " + this.fuelTank;
    }
}
