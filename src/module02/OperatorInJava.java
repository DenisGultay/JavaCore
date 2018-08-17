package module02;

/**
 * Created by denis on 17.08.18.
 */
public class OperatorInJava {
    public static void main(String[] args) {

        int integer1 = 50;
        int integer2 = 10;

        int integer3 = integer1 + integer2;

        System.out.println(integer3);

        integer3 = integer1 / integer2;

        System.out.println(integer3);

        double doubleValue = (double)integer2 / integer1;

        System.out.println(doubleValue);

        int integer4 = 100;

        integer4 += 20;

        System.out.println(integer4);

        boolean bool1 = true;
        boolean bool2 = false;

        boolean bool3 = bool1 || bool2;

        System.out.println(bool3);
    }

}
