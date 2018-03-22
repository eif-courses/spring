package collections.comparable.comparator;

import java.util.Comparator;

/**
 * Created by Marius on 1/30/2017.
 */
public class PersonComparatorBySalaryAndName implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        int flag = (int)o1.getSalary() - (int)o2.getSalary();
        if(flag==0) flag = o1.getName().compareTo(o2.getName());
        return flag;
    }
}
