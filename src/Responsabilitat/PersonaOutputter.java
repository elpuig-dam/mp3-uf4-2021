package Responsabilitat;

public class PersonaOutputter {
    private Persona persona;

    public PersonaOutputter(Persona persona) {
        this.persona = persona;
    }

    public void output () {
        System.out.println(persona.getNom() + ":" + persona.getEdat());
    }

    public String toJson() {
        //JSONObject jsonObject = new JSONObject(persona);
        //System.out.println(jsonObject);
        return "{" + toCSV(',') + "}";

    }

    public String toCSV(char sep) {
        return persona.getNom() + sep + persona.getEdat();
    }



}
