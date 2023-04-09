package creational.abstract_method.factories;

import creational.abstract_method.buttons.Button;
import creational.abstract_method.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
