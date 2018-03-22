package mano;

public abstract class DarboLaikas
{
    protected int hours;
    protected int minutes;

    abstract int perDayTime();
    abstract int perWeekTime();
    
    DarboLaikas(int a)
    {
        hours = a;
        minutes = a * 60;
    }
    public void information(int type)
    {
        if (type == 1)
        {
            System.out.println("Darbuotojo darbo laikas = " + hours+"h "+" (minutemis " +minutes+"min)");
        }
        else if (type == 2)
        {
            System.out.println("Mokinys mokinasi = " + hours+"h "+" (minutemis "+ minutes+"min)");
        }
      
        else if(type == 3)
        {
            System.out.println("Nezinomas tipas ");
        }
       
     }
}







   



