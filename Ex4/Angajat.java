public class Angajat {
    private String name;
    private int sallary;
    private int employeeIdentifier;

    public Angajat(String name, int sallary)
    {
        this.name = name;
        this.sallary = sallary;
        this.employeeIdentifier = (this.name + this.sallary).hashCode(); //generam un id special pentru fiecare anagajt, pentru o recunoastere mai usoara
        //acest id ofera o imposibilitate de a reproduce o relatie de egalitate intre 2 anagajti, dsca nu au exact acelasi nume, in aceeasi ordine, si acelais salariu
    }

    public boolean equals(Angajat employee)
    {
        return (this.getId() == employee.getId());//verificam daca au celasi id pentru a verifica egalitatea
    }

    public int getId()
    {
        return this.employeeIdentifier;
    }

    public String toString()
    {
        return "Angajat " + this.getName() + " " + this.getSallary() + " "; 
    }

    public int getSallary()
    {
        return this.sallary;
    }

    public String getName()
    {
        return this.name;
    }
}
