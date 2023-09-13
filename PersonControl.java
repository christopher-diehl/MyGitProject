import java.io.FileWriter;
import java.io.IOException;

public class PersonControl {
    private Person model;
    private PersonView view;

    public PersonControl(Person model, PersonView view) {
        this.model = model;
        this.view = view;
    }

    public void setName(String name) {
        model.setName(name);
    }

    public void setBirthdate(String birthdate) {
        model.setBirthdate(birthdate);
    }

    public void saveToFile() {
        try {
            FileWriter writer = new FileWriter("person.txt");
            writer.write("Name: " + model.getName() + "\n");
            writer.write("Geburtsdatum: " + model.getBirthdate() + "\n");
            writer.close();
            view.displayMessage("Daten wurden erfolgreich in der Datei gespeichert.");
        } catch (IOException e) {
            view.displayMessage("Fehler beim Speichern der Daten.");
        }
    }

    public void askUser() {
        String name = view.askName();
        String birthdate = view.askBirthdate();
        setName(name);
        setBirthdate(birthdate);
        saveToFile();
    }
}