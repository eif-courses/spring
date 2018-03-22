/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package propertychangedexample;

/**
 *
 * @author Marius
 */
public class PropertyChangedExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewBean bean = new NewBean();
        bean.addPropertyChangeListener(new OnPropertyChangedListener());
        bean.setSampleProperty("Statybininkas");
        bean.setSampleProperty("Dėstytojas");
        bean.setSampleProperty("Vairuotojas");
        bean.setSampleProperty("Valytojas");
        
    }

}
