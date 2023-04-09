package creational.abstract_method.factories;

import creational.abstract_method.buttons.Button;
import creational.abstract_method.buttons.MacOSButton;
import creational.abstract_method.checkboxes.Checkbox;
import creational.abstract_method.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
    
}
