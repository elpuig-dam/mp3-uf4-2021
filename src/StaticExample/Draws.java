package StaticExample;

public class Draws {

    public static void sep(int n, char c) {
        for(int i=0; i < n; i++) System.out.print(c);
    }

    public static void title(String t) {
        sep(t.length() + 4,'*');
        System.out.println();
        System.out.println("* " + t.toUpperCase() + " *");
        sep(t.length() + 4,'*');
        System.out.println();
    }




}
