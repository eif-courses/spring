/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package propertychangedexample;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author Marius
 */
public class OnPropertyChangedListener implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("Name = " + evt.getPropertyName());
        System.out.println("Old Value = " + evt.getOldValue());
        System.out.println("New Value = " + evt.getNewValue());
        System.out.println("**********************************");
    }

}
