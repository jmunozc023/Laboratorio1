package laboratorio1;

/**
 *
 * @author josep
 */
public class Laboratorio1 {

    public static void FactorizacionRecursiva(int num, int div) {
        if (num > 1) {
            if ((num % div) == 0) {
                System.out.println(div);
                FactorizacionRecursiva(num / div, div);
            } else {
                FactorizacionRecursiva(num, div + 1);
            }
        }
    }
    public static void FactorizacionIterativa(int num, int div) {
        while (num > 1) {
            if (num % div == 0) {
                System.out.println(div);
                num /= div;
            } else {
                div++;
            }
        }
    }

public static void main(String[] args) {
        FactorizacionIterativa(75, 2);
    }

}
