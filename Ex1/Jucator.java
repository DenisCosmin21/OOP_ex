class Jucator
{
    private String playerName;
    private int playerNumber = 0;
    private int id;

    public Jucator(String playerName, int playerNumber)
    {
        this.playerName = playerName;
        this.playerNumber = playerNumber;
        String forSpecialId = playerName + playerNumber;
        this.id = forSpecialId.hashCode(); //Generam un identificator special fiecarui jucator bazat pe nr de pe tricou si pe nume
        //pentru a evita cazurile in care pot fi lafel doi jucatori
    }

    public boolean equals(Jucator player2)
    {
        return this.getId() == player2.getId();
    }

    public int getId()
    {
        return this.id;
    }

    public String toString()
    {
        return this.playerName + " " + this.playerNumber;
    }
}