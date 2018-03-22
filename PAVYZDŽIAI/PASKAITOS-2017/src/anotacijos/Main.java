package anotacijos;


import com.sun.xml.internal.ws.api.model.wsdl.WSDLBoundOperation;

import javax.annotation.processing.ProcessingEnvironment;
import javax.tools.JavaFileObject;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

interface ManoInterface{}


@Retention(RetentionPolicy.RUNTIME)
@interface Anotacija {
    String zinute() default "tekstas";
    int reiksme() default 88;
    int [] arr() default {88888,9};
}
@Anotacija(arr={89, 99, 77}, zinute = "Sveikas")
class Meta {

    @Anotacija(zinute = "Laba diena", reiksme = 55, arr = {777,99,44})
    public static void metodas(String str, int i) {
        Meta ob = new Meta();
        try {
            Class c = ob.getClass();
            Method m = c.getMethod("metodas", String.class, int.class);
            Anotacija anno = m.getAnnotation(Anotacija.class);

            System.out.println(anno.zinute() + " " + anno.reiksme());
        } catch (NoSuchMethodException exc) {
            System.out.println("metodas nerastas");}
    }

    public static void main(String args[]) {


        Funkcinis task2 = (x) -> { System.out.println("Task #2 is running"+x.toString()); };








        Method[] methods = Meta.class.getMethods();
        for (Method m : methods)
        {
            if (m.isAnnotationPresent(Anotacija.class))
            {
                Anotacija ta = m.getAnnotation(Anotacija.class);

                System.out.println(ta.zinute() +" "+ ta.reiksme()+" "+ ta.arr()[0]);
            }
        }


       // metodas("test", 10);
    }
}