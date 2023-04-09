package creational.abstract_method.factories;

import creational.abstract_method.buttons.Button;
import creational.abstract_method.buttons.WindowsButton;
import creational.abstract_method.checkboxes.Checkbox;
import creational.abstract_method.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
