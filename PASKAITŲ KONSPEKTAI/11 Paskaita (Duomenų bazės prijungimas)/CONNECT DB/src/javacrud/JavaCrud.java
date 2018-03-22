/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacrud;

import java.util.List;

/**
 *
 * @author Marius
 */
public class JavaCrud {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         PersonDaoImpl pdi = new PersonDaoImpl();
 
        /**Create table. Note that you can always run this
         * method. Table will be created only once (if it doesn't exist)**/
        pdi.createPersonTable();
 
        /**Insert a new record. Create a new Person instance and just
         * pass it as an argument in "insert" method**/
        Person person = new Person("John","Johnson");
        //pdi.insert(person);
 
        /**Select by id**/
        Person personSelect = pdi.selectById(2);
        System.out.println(personSelect.getId()+", "+personSelect.getFirstName()+", "+personSelect.getLastName());
 
        /**Delete person by id**/
        pdi.delete(3);
 
        /**Update person**/
        Person personUpdate = new Person("Tom","Johnson");
        pdi.update(personUpdate,1);
 
        /**Select all persons**/
        List<Person> persons = pdi.selectAll();
        /**To retrieve values, you will have to use "for each" loop
         * to iterate through list**/
        for(Person p : persons) {
            System.out.println(p.getId()+", "+p.getFirstName()+", "+p.getLastName());
        }
        DB_GUI db_gui = new DB_GUI();
        db_gui.setVisible(true);
    }
    
}
