
package mano;
import Interface.*;
import java.util.ArrayList;
import java.util.List;
public class Mokykla 
{
    private String name;

    private List <Darbuotojas> workers = new ArrayList <Darbuotojas>();
    private List <Mokytojas> teachers = new ArrayList <Mokytojas>();
    private List <Mokinys>  schoolboy = new ArrayList <Mokinys>();

    public Mokykla(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    
    // Mokinys

    public void addSchoolboy(Mokinys mokinys)
    {
        schoolboy.add(mokinys);
    }
    public boolean delSchoolboy(int index)
    {
        if (index <= schoolboy.size()-1)
        {
            schoolboy.remove(index);
            return true;
        }
        else
        {
            return false;
        }
    }
    public Mokinys getSchoolboy(int index)
    {
        return schoolboy.get(index);
    }
    public int getSchoolboyCount()
    {
        return schoolboy.size();
    }

    //Darbuotojas

    public void addWorker(Darbuotojas darbuotojas)
    {
        workers.add(darbuotojas);
    }
    public boolean delWorker(int index)
    {
        if (index <= workers.size())
        {
            workers.remove(index);
            return true;
        }
        else
        {
            return false;
        }
    }
    public Darbuotojas getWorker(int index)
    {
        return workers.get(index);
    }

    public int getWorkerCount()
    {
        return workers.size();
    }

    //Mokytojas

    public void addTeacher(Mokytojas mokytojas)
    {
        teachers.add(mokytojas);
    }
    public boolean delTeacher(int index)
    {
        if (index <= teachers.size())
        {
            teachers.remove(index);
            return true;
        }
        else
        {
            return false;
        }
    }
    public Mokytojas getTeacher(int index)
    {
        return teachers.get(index);
    }
    public int getTeacherCount()
    {
        return teachers.size();
    }
    public String printListSchoolboy()
    {
        String s = "Mokiniai:\n";
        for(int i = 0; i < schoolboy.size(); i++)
            s += schoolboy.get(i).toString() + "\n";
        return s;
    }
    public void printListWorkers()
    {
        System.out.println( "Darbuotojai: " +  workers +"\n");
    }
    public void printListTeachers()
    {
        System.out.println("Mokytojai: \t" +  teachers +"t\"\n");
    }
    @Override
    public String toString()
    {
        return "Mokyklos" + name + workers + teachers + schoolboy;
    }

}

















 

