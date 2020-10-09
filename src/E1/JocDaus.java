package E1;

import java.util.Arrays;

public class JocDaus {
    Dau[] dau;

    public JocDaus() {
        dau = new Dau[3];
        dau[0] = new Dau();
        dau[1] = new Dau();
        dau[2] = new Dau();
    }

    public boolean play() {
        int a,b,c;
        a = dau[0].tirar();
        b = dau[1].tirar();
        c = dau[2].tirar();
        if(a==b && b==c) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "JocDaus{" +
                "dau=" + Arrays.toString(dau) +
                '}';
    }
}
