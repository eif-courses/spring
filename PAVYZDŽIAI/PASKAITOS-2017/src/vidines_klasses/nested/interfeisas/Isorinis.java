package vidines_klasses.nested.interfeisas;

/**
 * Created by Marius on 1/25/2017.
 */
interface Interfeisas{
    void atvaizduoti();
    interface VidinisI{

         void zinute();
    }
}
class Isorinis implements Interfeisas.VidinisI{

    @Override public void zinute() {System.out.println("Vidinis Interfeisas");}
    public static void main(String args[]){
        Interfeisas.VidinisI vidinisI = new Isorinis();
        vidinisI.zinute();
    }
}