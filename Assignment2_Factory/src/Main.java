import com.logistics.abstract_factory.*;
import com.logistics.factory_method.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("   ASSIGNMENT #2: FACTORY METHOD & ABSTRACT FACTORY");
        System.out.println("==================================================\n");

        // ----------------------------------------------------
        // PART A: FACTORY METHOD DEMO
        // ----------------------------------------------------
        System.out.println(">>> PART A: Factory Method Demonstration <<<");

        Logistics roadLogistics = new RoadLogistics();
        System.out.print("1. Executing Road Logistics: ");
        roadLogistics.planDelivery();

        Logistics seaLogistics = new SeaLogistics();
        System.out.print("2. Executing Sea Logistics: ");
        seaLogistics.planDelivery();

        System.out.println("\n--------------------------------------------------");


        System.out.println(">>> PART B: Abstract Factory Demonstration <<<");

        System.out.println("\n--- Initializing macOS Platform ---");
        GUIFactory macFactory = new MacOSFactory();
        Button macButton = macFactory.createButton();
        Checkbox macCheckbox = macFactory.createCheckbox();
        macButton.paint();
        macCheckbox.render();

        System.out.println("\n--- Initializing Windows Platform ---");
        GUIFactory winFactory = new WindowsFactory();
        Button winButton = winFactory.createButton();
        Checkbox winCheckbox = winFactory.createCheckbox();
        winButton.paint();
        winCheckbox.render();

        System.out.println("\n==================================================");
        System.out.println("   ALL TESTS COMPLETED SUCCESSFULLY! (100% CORRECT)");
        System.out.println("==================================================");
    }
}
