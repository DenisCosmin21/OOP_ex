public class Portofel {

    private String ownerName; /*Folosim private intotdeauna chiar daca in java nu este necesar deoarece este un good practice
    datorita faptului ca in anumite limbaje este obligatoriu sa specificam aceste lucruri, iar asa ne va intra in instinct, plus faciliteaza citirea si intelegerea codului de catre alt programator, mai ales unul care poate nu programeaza in java in general, si nu stie despre acest lucru ceea ce ar duce la o confuzie si o intelegere gresita a codului */

    private Card[] cardList = new Card[6];
    
    private int cardCount = 0;

    public Portofel(String ownerName)
    {
        this.ownerName = ownerName;
    }
    
    public boolean adaugaCard(String cardNr, int cardBalance)
    {
        /*intotdeauna cand ne referim la un atribuit cum este cardCount, vom folosi this.atributName pentu a intelege mai bine
         la ce ne referim, astfel si un programator din alt limbaj poate intelege codul nostru, plus uneori se poate folosi acelasi nume si ca parametru la metoda, dar si ca nume de atribut, poate pentru a se intelege mai bine unde urmeaza sa fie folosita variabila*/

        if(this.cardCount >= 6){
            System.err.println("Wallet full");
            return false;
        }
        for(int i = 0;i < this.cardCount;i++){
            if(this.cardList[i].getCardNr().equals(cardNr)){
                System.err.println("Card with number : " + cardNr + " already in wallet");
                return false;
            }
        }

        Card cardToAdd = new Card(cardNr, cardBalance);
        this.cardList[this.cardCount++] = cardToAdd;
        return true;
    }

    public String toString()
    {
        String retData = this.ownerName + " : ";

        for(int i = 0;i < this.cardCount;i++){
            retData += this.cardList[i];
        }

        return retData;
    }

    public int calculeazaSold()
    {
        int totalBalance = 0;
        for(int i = 0;i < this.cardCount;i++){
            totalBalance += this.cardList[i].getCardBalance();
        }

        return totalBalance;
    }
}
