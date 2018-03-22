
/**
 *
 * @author Marius
 */
public final class Mat{
    
    public static final double PI = 3.14285714286;
    public static final double CI = 3.25555;
    public static final double FI = 3.14285714286;
    public static final double E = 3.25555;
    public static final double R = 3.14285714286;
    public static final double T = 3.25555;
    public static final double K = 3.14285714286;
    public static final double L = 3.25555;
    private static double counter = 0;
    
    
    private Mat(){
        throw new AssertionError();   
    }
    public static int multiply(int a, int b){
        counter = a * b;
        return (int) counter;
    }
    public static double multiply(double a, double b){
        
        counter = a * b;
        return counter;
    }
    public static double divide(double a, double b){
        
        counter = a / b;
        return counter;
    }
    public static int divide(int a, int b){
        
        counter = a / b;
        return (int) counter;
    }
    public static double sum(double a, double b){
        
        counter = a + b;
        return counter;
    }
    
    //Pitagoro teorema teigia, jog stataus trikampio statinių kvadratų suma yra lygi įžambinės kvadratui:
    //a² + b² = c²
    //Kai a ir b yra trikampio statinių ilgiai, o c -įžambinės ilgis
    //
    public static double statausTrikampioIzambine(double a, double b){
        double c = (a*a) + (b*b);
        c = Math.sqrt(c);
        return c;
    }
    
    
}
