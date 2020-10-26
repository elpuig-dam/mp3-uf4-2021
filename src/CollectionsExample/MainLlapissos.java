package CollectionsExample;

import polimorfisme.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class MainLlapissos {

    public static void main(String[] args) {
        List<Llapis> caixa1 = new ArrayList<>();
        List<Llapis> caixa2 = new ArrayList<>();

        for(int i=0; i<10; i++) {
            caixa1.add(new Llapis((int)(Math.random()*7)));
            caixa2.add(new Llapis((int)(Math.random()*7),(float)(Math.random()*3)));
        }

        System.out.println("Caixa 1");
        for(Llapis llapis : caixa1) System.out.println(llapis);
        System.out.println("Caixa 2");
        caixa2.forEach(System.out::println);
    }
}
