package abstractfactory.java.concrete.creator;

import abstractfactory.java.abstracts.Dialog;
import abstractfactory.java.concrete.product.WindowsButton;
import abstractfactory.java.interfaces.IButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

  @Override
  public IButton createButton() {
    return new WindowsButton();
  }
}