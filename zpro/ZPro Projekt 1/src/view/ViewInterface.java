package view;

import controller.BusinessLogic;

/*
 * Klasa ViewInterface - Widok.
 * Zawiera Kontroler do sterowania systemem
 */

public class ViewInterface {

    private BusinessLogic controller;

    public ViewInterface(BusinessLogic controller){
        this.controller = controller;
    }

    public BusinessLogic getController() {
        return controller;
    }
}
