package view;

import controller.BusinessLogic;

/*
 * Klasa ViewInterface - Widok.
 * Zawiera Kontroler do sterowania systemem
 */

public class ViewInterface {

    private BusinessLogic controller;

    public ViewInterface(){
        controller = new BusinessLogic();
    }

    public BusinessLogic getController() {
        return controller;
    }
}
