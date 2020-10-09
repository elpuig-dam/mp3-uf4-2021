package E1;

import java.util.Objects;

public class Dau {
    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int tirar() {
        valor = (int)(Math.random()*6) + 1;
        return valor;
    }

    @Override
    public String toString() {
        return "Dau{" +
                "valor = " + valor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dau)) return false;
        Dau dau = (Dau) o;
        return getValor() == dau.getValor();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValor());
    }
}
