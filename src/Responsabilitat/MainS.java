package Responsabilitat;

public class MainS {

    public static void main(String[] args) {
        Persona p = new Persona("Jordi",(short)45);
        PersonaOutputter personaOutputter = new PersonaOutputter(p);

        personaOutputter.output();
        System.out.println(personaOutputter.toJson());
        System.out.println(personaOutputter.toCSV(','));
    }
}
