class Benzinarie
{
    private int fuelLeft = 0;
    private Masina[] carList = new Masina[10];
    private int carCount = 0;

    public boolean addFuelToCar(Masina car)
    {
        if(this.fuelLeft >= car.getFuelTank()){
            this.fuelLeft -= car.getFuelTank();
            return true;
        }
        
        return false;
    }

    public boolean alimenteazaMasina(Masina car)
    {
        if(this.addFuelToCar(car)){
            return true;
        }
        else{
            if(this.carCount < 10){
                carList[carCount++] = car;
                return true;
            }
        }
        return false;
    }

    public String toString()
    {
        String retData = new String("Coada benzinarie : ");

        for(int i = 0;i < this.carCount;i++){
            retData += "Masina " + (i + 1) + " " + carList[i] + " ";
        }

        return retData;
    }

    public void alimenteazaBenzinarie(int fuelQuantity)
    {
        this.fuelLeft += fuelQuantity;

        while(addFuelToCar(this.carList[this.carCount - 1]) && this.carCount >= 0){
            this.carCount--;
        }
    }
}