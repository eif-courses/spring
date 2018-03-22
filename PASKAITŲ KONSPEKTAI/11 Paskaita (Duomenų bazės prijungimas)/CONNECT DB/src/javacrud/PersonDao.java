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
public interface PersonDao {
 
    void createPersonTable();
 
    void insert(Person person);
 
    /**
     *
     * @param id
     * @return
     */
    Person selectById(int id);
 
    List<Person> selectAll();
 
    void delete(int id);
 
    /**
     *
     * @param person
     * @param id
     */
    void update(Person person,int id);
}