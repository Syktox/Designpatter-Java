package MVC;

public class MVCDemo {
    public static void main(String[] args) {
        Model model = new Model(20);
        View view = new View();
        Controll controller = new Controll(model, view);

        controller.setValue(50);
        controller.updateView();
    }
}
