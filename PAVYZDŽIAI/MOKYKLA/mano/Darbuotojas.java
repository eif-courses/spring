package mano;
import Interface.*;
public class Darbuotojas extends Mokytojas
{
    private String name, surname;
    private String office;
    private double salary;
    
    public Darbuotojas(String name, String surname, String office,
                      double salary, int a)
    {
        super(name, surname, office, salary, a);
        this.name = name;
        this.surname = surname;
        this.office = office;
	    this.salary = salary;
	}
    @Override
    public String getName(String name)
    {
        return name;
    }
    @Override
    public String getSurname(String surname)
    {
        return surname;
    }
    @Override
    public String getOffice(String office)
    {
		return office;
    }
    @Override
	public double getSalary(double salary)
    {
	    return salary;
    }
    @Override
    public void setName(String name)
    {
        this.name = name;
    }
    @Override
    public void setSurname(String surname)
    {
        this.surname = surname;
    }
    @Override
    public void setOffice(String office)
    {
		this.office = office;
    }
    @Override
	public void setSalary(double salary)
    {
	    this.salary = salary;
    }
    @Override
    public String toString()
    {
	return "Darbuotojo informacija : "+name+ " "+surname+ " " +
           " "+office+ " mokytojas " +salary+" Lt" ;
	}

    @Override
    public void raiseSalary()
    {
        salary = salary + (salary * 0.8);
    }

    @Override
    public void reduceSalary()
    {
        salary = salary - (salary * 0.4);
    }
}














