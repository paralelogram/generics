import java.util.Scanner;

public class TestPlural {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        Plural<Character> plural1 = new Plural<Character>();
        Plural<Character> plural2 = new Plural<Character>();

        plural1.tList.add('h');
        plural1.tList.add('e');
        plural1.tList.add('l');
        plural1.tList.add('g');
        plural1.tList.add('o');
        plural1.tList.add('w');

        plural2.tList.add('j');
        plural2.tList.add('h');
        plural2.tList.add('e');
        plural2.tList.add('l');

        System.out.println(plural2.combining(plural1.tList));
        System.out.println(plural1.section(plural2.tList));


    }
}
