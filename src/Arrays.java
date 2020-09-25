public class Arrays {

    public static void main(String[] args) {
        Prints.sep(50,'*',"Array d'Strings");
        String[] alumnes = new String[5];
        int nota[] = new int[5];
        alumnes[0] = "Toni";
        for(int i=0; i<alumnes.length; i++) {
            System.out.println(alumnes[i]);
        }

        Prints.sep(50,'*',"Arrays d'alumnes");
        Alumne[] llistaAlumnes = new Alumne[5];
        Alumne a1 = new Alumne("Toni","DAM", 2);

        //presa de dades abans o bé usar setters
        String nom = "Juanmi";
        String cicle = "DAM";
        int curs = 2;
        Alumne a2 = new Alumne(nom,cicle,curs);

        //amb setters
        Alumne a3 = new Alumne();
        a3.setNom("Óscar");
        a3.setCicle("DAM");
        a3.setCurs(2);

        llistaAlumnes[0] = a1;
        llistaAlumnes[1] = a2;
        llistaAlumnes[2] = a3;
        llistaAlumnes[3] = new Alumne();
        llistaAlumnes[4] = new Alumne();

        for(int i=0; i<llistaAlumnes.length; i++) {
            System.out.println(llistaAlumnes[i].getNom());
        }

        Prints.sep(50,'*',"Recórrer un Array");
        for(Alumne a : llistaAlumnes) {
            System.out.println(a);
        }

    }
}
