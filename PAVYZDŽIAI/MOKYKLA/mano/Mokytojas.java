
package mano;
import Interface.*;
public class Mokytojas extends DarboLaikas implements DarbuotojasInterface
{
    protected double salary;
    protected String name, surname;
    protected String office;

    public Mokytojas(String name, String surname,
                    String office, double salary, int a)
    {    
        super(a);
        this.name = name;
        this.surname = surname;
        this.office = office;
		this.salary = salary;
	}
    public String getName(String name)
    {
        return name;
    }
    public String getSurname(String surname)
    {
        return surname;
    }
    public double getSalary(double salary)
    {
        return salary;
    }
    public String getOffice(String office)
    {
        return office;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setSurname(String surname)
    {
        this.surname = surname;
    }
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    public void setOffice(String office)
    {
        this.office = office;
    }
    @Override
    public String toString()
    {
    return "Mokytojo informacija : " +name+"  " +surname + "  pareigos " +
           office+"atlyginimas "+salary+" Lt "+
           "mokina -os klases mokinius";
    }
    public void raiseSalary()
    {
       salary = salary + (salary * 0.5);
    }
    public void reduceSalary()
    {
        salary = salary - (salary * 0.5);
    }
    @Override
    public int perDayTime()
    {
        System.out.println("Darbo laikas per diena h");
        return hours  ;
    }
    @Override
    public int perWeekTime()
    {
        System.out.println("Viso per viena savaite h");
        return hours * 5 ;
    }
};

