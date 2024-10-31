public class Firma {
    private String name;
    private int budget;

    private Angajat[] employeesList = new Angajat[30];

    private int employeesCount = 0;

    public Firma(String name, int budget)
    {
        this.name = name;
        this.budget = budget;
    }

    public boolean adaugaAngajat(Angajat newEmployee)
    {
        if(this.employeesCount >= 30){
            System.err.println("Bussiness full");
            return false;
        }
        else if(this.employeesCount == 0){
            addToList(newEmployee);
            return true;
        }

        int i = 0;
        Angajat employee = this.employeesList[0];
        for(;i < this.employeesCount;i++, employee = this.employeesList[i])
        {
            if(employee.equals(newEmployee)){
                System.err.println("Employee " + newEmployee.getName() + "already in bussiness");
                return false;
            }
        }
        
        addToList(newEmployee);
        
        return true;
    }

    private void addToList(Angajat newEmployee)
    {
        this.employeesList[this.employeesCount++] = newEmployee;
    }

    public String toString()
    {
        String retData = this.name + ": ";

        int i = 0;
        Angajat employee = this.employeesList[0];
        for(;i < this.employeesCount;i++, employee = this.employeesList[i]){
            retData += employee; //Functia toString se apeleaza automat la incercarea de concatenare a 2 obiecte daca este definita
        }

        return retData;
    }

    public int[] platesteSalarii()//pentru a usura exprimarea bugetului in functie de : "buget ramas" si "buget necesar", folosim array pentru a specifica daca ne referim la buget ramas sau necesar
    {
        int[] retData = new int[2];

        int initialBudget = this.budget;
    
        int i = 0;
        Angajat employee = this.employeesList[0];
        for(;i < this.employeesCount;i++, employee = this.employeesList[i]){
            initialBudget -= employee.getSallary();
        }

        if(initialBudget < 0){
            retData[0] = 0 - initialBudget;
            retData[1] = 1;//1 semnifica faptul ca bugetul este insufucient si mai este nevoie de atatia bani pentru  acoperi integral salariile
            return retData;
        }
        
        else{
            retData[0] = initialBudget;
            retData[1] = 0;
            return retData;
        }

    }
}
