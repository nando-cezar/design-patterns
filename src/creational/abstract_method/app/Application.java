package creational.abstract_method.app;

import creational.abstract_method.buttons.Button;
import creational.abstract_method.checkboxes.Checkbox;
import creational.abstract_method.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
