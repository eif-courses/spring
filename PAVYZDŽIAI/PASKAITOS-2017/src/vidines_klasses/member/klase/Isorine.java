package vidines_klasses.member.klase;

/**
 * Created by Marius on 1/25/2017.
 */
class Isorine{
    private int duomenys=99;
    class Vidine{
        void zinute(){System.out.println("duomenys: "+duomenys);}
    }
    public static void main(String args[]){
        Isorine isorine = new Isorine();
        Isorine.Vidine vidine = isorine.new Vidine();
        vidine.zinute();
    }
}