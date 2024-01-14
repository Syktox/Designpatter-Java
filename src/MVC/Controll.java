package MVC;

public class Controll {
    private Model model;
    private View view;

    public Controll(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void setValue(int value) {
        model.setValue(value);
    }

    public int getValue() {
        return model.getValue();
    }

    public void updateView() {
        view.PrintValue(model);
    }

}
