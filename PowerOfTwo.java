import java.lang.Math;

public class PowerOfTwo {
    public static void main(String[] args) {
        printTable();
    }

    static void printTable(){
        for (int i = 0; i < 5; i++) {
            System.out.println(2 + " ^ " + i + "= " + Math.pow(2, i));
        }
    }
}