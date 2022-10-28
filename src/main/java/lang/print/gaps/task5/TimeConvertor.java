package lang.print.gaps.task5;
public class TimeConvertor {
    public static float convert(float minutes) {
                minutes = minutes * 60;
                return minutes;
            }
            public static void main(String[] args) {
                System.out.println(convert(1));
                System.out.println(convert(5));

            }
        }

