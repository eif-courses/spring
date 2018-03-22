package vidines_klasses.sta_tic.klase;

/**
 * Created by Marius on 1/25/2017.
 */
class Isorine{
    static int duomenys = 59;
    static class Vidine{
        void zinute(){System.out.println("duom:"+duomenys);}
    }
    public static void main(String args[]){
        Isorine.Vidine obj=new Isorine.Vidine();
        obj.zinute();
    }
}