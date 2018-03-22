package mano;
import java.util.ArrayList;
import java.util.HashMap;
import Interface.*;

public class Tvarkarastis 
{
    private HashMap<Integer, ArrayList<String>> pamokos = new HashMap
                                                 <Integer, ArrayList<String>>();

    public boolean addLesson(Integer savDiena, String pamoka)
    {
        ArrayList<String> arr = pamokos.get(savDiena);
        if(arr == null)
        {
            arr = new ArrayList<String>();
            arr.add(pamoka);
            pamokos.put(savDiena,  arr);
            return true;
        }
        else
        arr.add(pamoka);
        return true;
    }
    public String getLesson(Integer savDiena, int index)
    {

        if(pamokos.get(new Integer(1)) == null)
                return "NERA PAMOKOS!!!!!!!!!!!!!!!";
        try
        {
            return pamokos.get(savDiena).get(index);
        }
        catch(IndexOutOfBoundsException e)
        {
            return "NERA PAMOKOS";
        }
    }
    public boolean removeLesson(Integer savDiena, int index)
    {
        try
        {
            pamokos.get(savDiena).remove(index);
		    return true;
        }
        catch(IndexOutOfBoundsException e)
        {
            return false;
        }
    }
    @Override
    public String toString()
    {
        String tvark = "";
        String dienos[] = {"Pirmadienis", "Antradienis", "treciadienis", "Ketvirtadienis", "Penktadienis" };
        for(int i = 0; i < dienos.length; i++)
        {
            tvark += dienos[i] + ":\n";
            ArrayList diena = pamokos.get(new Integer(i+1));
            if(diena == null)
                continue;
            Object pamokos1[] =  diena.toArray();
            for(int j = 0; j < pamokos1.length; j++)
                tvark += "\t" +pamokos1[j]+"\n";
        }
        return tvark;
    }
}


