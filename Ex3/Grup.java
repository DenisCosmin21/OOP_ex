import java.util.ArrayList;

class Grup extends Utilizator //Clasa grup va da extned la clasa utilizator, deoarece este un tip de utilizator si grupul, care poate
//receptiona mesaje, si trimite mesaje
//astfel vom putea folosi si metode din clasa Utilizator, si atributuri specifice clasei, putem folosi gettere, settere, si
//avem access la date si metode cu caracteristica de public sau protected
{
    private ArrayList<Utilizator> memberList = new ArrayList<Utilizator>(); //tablou dinamic, putem pune oricate elemente

    public Grup(String name, Utilizator mainReciever)
    {
        super(name);
        memberList.add(mainReciever);
    }

    private void addMember(Utilizator newMember) throws DestinatarDuplicat //Creem functie care poate arunca exceptie
    {
        for(Utilizator user : this.memberList){
            if(newMember.equals(user)){
                throw new DestinatarDuplicat(newMember.getUsername(), this.getUsername());//Verificam conitia pentru a arunca exceptia 
            }
        }
        this.memberList.add(newMember);//Daca exceptia nu se arunca se adauga membrul
    }

    public void inscrie(Utilizator newMember)
    {
        try{//se incearca o metoda, urmand ca apoi sa se prinda exceptia daca ceva nu merge bine adica user deja in grup
            this.addMember(newMember);
        }
        catch(DestinatarDuplicat ex){
            System.out.println(ex.getMessage());
        }
    }

    public void receptioneaza(Utilizator sender, String messageRecieved)
    {
        for(Utilizator member : this.memberList){
            if(!member.equals(sender)){
                member.receptioneaza(sender, messageRecieved);
            }
        }
    }
}
