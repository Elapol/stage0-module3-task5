package lang.print.gaps.task5;

public class NumberDivider {

    static int divide(int toBeDivided) {
        toBeDivided = toBeDivided / 5;
        return toBeDivided;
    }

    public static void main(String[] args) {
        System.out.println(divide(5));
        System.out.println(divide(25));
    }
}