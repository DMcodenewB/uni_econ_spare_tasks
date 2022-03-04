import controller.BusinessLogic;
import controller.BusinessLogic.AccType;
import model.Offices.TaxOffice;
import model.Owner;
import view.ViewInterface;


/*
 * Main - klasa sterująca.
 */

public class Main {

    public static void main(String[] args) {
        BusinessLogic controller = new BusinessLogic();
        ViewInterface vi = new ViewInterface(controller);
        ViewInterface vi2 = new ViewInterface(controller);
        Owner o1 = new Owner("David", "Marshall");
        Owner o2 = new Owner("Kristof", "Chodak");
        Owner o3 = new Owner("Greg", "Schwarz");
        TaxOffice skarbowka = new TaxOffice();


        //dodanie kont
        controller.addNewAccount(o1, AccType.BANKING);
        controller.addNewAccount(o2, AccType.SAVING);
        controller.addNewAccount(o3, AccType.SAVING);

        controller.addObserver(skarbowka);
        controller.setNewInterestRate(0.5);

        controller.deposit(1, 500);
        controller.deposit(2, 1000);
        controller.deposit(3, 30000);

        controller.printAccInfo();

        controller.withdraw(1, 100);
        controller.withdraw(2, 1100);
        controller.withdraw(3, 11000);

        controller.printAccInfo();

        controller.transfer(1,2,100);
        controller.transfer(2,1,1000);
        controller.transfer(3,1,15000);

        controller.printAccInfo();

        //tricky przelewy
        
        controller.deposit(1,-100); //deposit ujemnej liczby
        controller.deposit(4, 10); //deposit na nieistniejące konto
        controller.withdraw(0, 100); //withdraw na nieistniejace konto
        controller.withdraw(1, -100); //withdraw nieistniejacej liczby

        controller.printAccInfo();
        
        skarbowka.raport();

    }
}
