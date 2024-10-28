class Echipa 
{
    Jucator[] titulari;
    Jucator[] rezerve;

    public Echipa(Jucator[] titulari, Jucator[] rezerve)
    {
        this.titulari = titulari;
        this.rezerve = rezerve;
    }

    public boolean efectueazaSchimbare(Jucator titularSchimb, Jucator rezervaSchimb)
    {
        int posTitular = 0, posRezerva = 0;
        for(Jucator titular : this.titulari){//realizam loop pe fiecar3 elemnt al tabloului titulari luand in parte fiecare element de tip Jucator
            if(titularSchimb.equals(titular)){
                for(Jucator rezerva : this.rezerve){
                    if(rezervaSchimb.equals(rezerva)){
                        this.titulari[posTitular] = rezervaSchimb;
                        this.rezerve[posRezerva] = titularSchimb;
                        return true;
                    }
                    posRezerva++;
                }
                System.err.println("Jucatorul " + rezervaSchimb + " nu se afle in rezervele echipei");
                return false;
            }
            posTitular++;
        }
        System.err.println("Jucatorul " + rezervaSchimb + " nu se afle in titularii echipei");
        return false;
    }

    public String toString()
    {
        String retData = new String("Titulari : ");
        for(Jucator titular : titulari){
            retData = retData + titular + " ";
        }
        retData = retData + "; Rezerve : ";

        for(Jucator rezerva : rezerve) {
            retData = retData + rezerva + " ";
        }
        
        return retData;
    }
}
