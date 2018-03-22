package lamda.israiskos;

/**
 * Created by Marius on 2/26/2017.
 */
public class Main {

    public static void main(String[] args) {

        Calculator calc = (x, y) -> x * y + 25;
        engine(calc, 30, 30);

    }
    private static void engine(Calculator calculator, int x, int y){
        int result = calculator.calculate(x,y);
        System.out.println(result);
    }
}
@FunctionalInterface
interface Calculator{
    int calculate(int x, int y);
}
