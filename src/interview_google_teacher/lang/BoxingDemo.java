package interview_google_teacher.lang;

public class BoxingDemo {

    public static void main(String[] args) {
        System.out.println(
                "new Integer(2) == 2 ?" + (new Integer(2) == 2));
        System.out.println(
                "new Integer(2) == new Integer(2) ?" + (new Integer(2) == new Integer(2)));
        System.out.println(
                "Integer.valueOf(2) == Integer.valueOf(2) ?" + (Integer.valueOf(2) == Integer.valueOf(2)) );
        System.out.println(
                "Integer.valueOf(1000) == Integer.valueOf(1000) ?" + (Integer.valueOf(1000) == Integer.valueOf(1000)) );
        System.out.println(
                "Integer.valueOf(2).intValue() == 2 ?" + (Integer.valueOf(2).intValue() == 2) );
        System.out.println(
                "new Integer(2).equals(new Integer(2)) ?" + (new Integer(2).equals(new Integer(2))));
        System.out.println(
                "new Integer(2).equals(new Integer(2)) ?" + (new Integer(2000).equals(new Integer(2000))));
    }

}