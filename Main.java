public class Main {
    public static void main(String[] args) {
        Person model = new Person();
        PersonView view = new PersonView();
        PersonControl controller = new PersonControl(model, view);
        controller.askUser();
    }
}