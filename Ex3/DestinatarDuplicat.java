class DestinatarDuplicat extends Exception  
{
    public DestinatarDuplicat(String name, String group)
    {
        super("User " + name + " already in group " + group);
    }
}
