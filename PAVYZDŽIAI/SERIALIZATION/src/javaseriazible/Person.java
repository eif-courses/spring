/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaseriazible;

import java.io.Serializable;

/**
 *
 * @author Marius
 */
public class Person implements Serializable {
  private String firstName;
  private String lastName;
  // transient laukai bus praleidžiami serializuojant
  transient private Thread myThread;

  public Person(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.myThread = new Thread();
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Override
  public String toString() {
    return "Person [firstName=" + firstName + ", lastName=" + lastName
        + "]";
  }

} 
