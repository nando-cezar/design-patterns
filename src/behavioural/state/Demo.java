package behavioural.state;

import behavioural.state.ui.Player;
import behavioural.state.ui.UI;

public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}