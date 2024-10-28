class Utilizator
{
    private String username;
    protected String messageHistory = new String();

    public Utilizator(String username)
    {
        this.username = username;
    }

    public void receptioneaza(Utilizator sender, String messageRecieved)
    {
        this.messageHistory += "Primit de la " + sender.getUsername() + " mesajul : " + messageRecieved + "\n";
    }

    public void trimite(Utilizator destination, String message)
    {
        if(!this.equals(destination)){
            this.messageHistory += "Trimis catre " + destination.getUsername() + " mesajul : " + message + "\n";

            destination.receptioneaza(this, message);
        }
    }

    public String getUsername()
    {
        return this.username;
    }

    public boolean equals(Utilizator b)
    {
        return this.getUsername().equals(b.getUsername());
    }

    public String toString()
    {
        return this.getUsername() + " : \n" + this.messageHistory;
    }
}