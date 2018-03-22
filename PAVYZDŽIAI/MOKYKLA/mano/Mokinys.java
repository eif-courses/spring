package mano;
import Interface.*;
public class Mokinys extends DarboLaikas
{
    protected int inclass;
    protected String name;
    protected String surname;

    public Mokinys(String name, String surname, int inclass, int a)
            throws InvalidSchoolboyDataException
    {
        super(a);
        if(name.length() <=0)
            throw new InvalidSchoolboyDataException("No name");
        if(surname.length() <=0)
            throw new InvalidSchoolboyDataException("No surname");
        if((inclass < 1) || (inclass > 12))
                throw new InvalidSchoolboyDataException("Invalid class number");            
        this.name = name;
        this.surname = surname;
        this.inclass = inclass;
    }
    public String getName()
    {
        return name;
    }
    public String getSurname()
    {
        return surname;
    }
    public int getInClass()
    {
        return inclass;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setSurname(String surname)
    {
        this.surname = surname;
    }
    public void setInClass(int inclass)
    {
        this.inclass = inclass;
    }
    @Override
    public String toString()
    {
        return "Mokinio informacija : " +name+ "  " +surname+
               " mokinasi "+inclass+ " klaseje";
    }
    @Override
    public int perDayTime()
    {
        System.out.println("Mokinasi per diena h");
        return hours;
    }
    @Override
    public int perWeekTime()
    {
        System.out.println("Viso per viena savaite h");
        return hours * 5;
    }
}
  
  
















