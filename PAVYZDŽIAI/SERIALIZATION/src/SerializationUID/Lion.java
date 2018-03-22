/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SerializationUID;

/**
 *
 * @author Marius
 */
import java.io.Serializable;

public class Lion implements Serializable {

  private static final long serialVersionUID = 2L;
  private String sound;
 

  public Lion(String sound) {
    this.sound = sound;
  }

  public String getSound() {
    return sound;
  }

}