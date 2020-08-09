package abstractfactory.java.concrete.creator;

import abstractfactory.java.abstracts.Dialog;
import abstractfactory.java.concrete.product.HtmlButton;
import abstractfactory.java.interfaces.IButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

  @Override
  public IButton createButton() {
    return new HtmlButton();
  }
}