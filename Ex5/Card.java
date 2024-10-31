class Card
{
    private String cardNumber;
    private int balance;

    public Card(String cardNumber, int balance)
    {
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    public String getCardNr()
    {
        return this.cardNumber;
    }

    public int getCardBalance()
    {
        return this.balance;
    }

    public String toString()
    {
        return this.cardNumber + " " + this.balance + " ";
    }
}