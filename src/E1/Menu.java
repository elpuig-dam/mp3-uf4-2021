package E1;

import java.util.Scanner;

public class Menu {
    private Scanner in = new Scanner(System.in);
    private int op;
    private boolean result;
    private int guanys;

    public Menu() {
        guanys = 0;
    }

    public void menuPrincipal() {
        do {
            System.out.println("1. Joc de Daus");
            System.out.println("2. Parxis");
            System.out.println("3. Curses");
            System.out.println("0. Acabar");
            op = in.nextInt();
            switch (op) {
                case 1:
                    JocDaus joc = new JocDaus();
                    result = joc.play();
                    System.out.println(joc);
                    break;
                case 2:
                    System.out.println("Parxis");
                    break;
                case 3:
                    System.out.println("Curses");
                    break;
                case 0:
                    System.out.println("Adeu!");
                    System.out.println("Has guanyat " + guanys + " partides");
                    break;
                default:
                    System.out.println("ha de ser un valor entre 0 i 3");
            }

            if(result) {
                System.out.println("Campió!!!");
                guanys++;
            }

        }while(op!=0);

    }
}
