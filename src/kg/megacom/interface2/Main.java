package kg.megacom.interface2;

import kg.megacom.interface2.model.Batmat;
import kg.megacom.interface2.model.Rescuer;
import kg.megacom.interface2.model.SuperHero;
import kg.megacom.interface2.service.Angel;

public class Main {

    public static void main(String[] args) {

        Angel rescuer = new Rescuer();
        Angel batmat = new Batmat();
        Angel programmer = new ProgrammerImpl();

        SuperHero superHero = new SuperHero(rescuer);

        programmer.serve();
        batmat.serve();

        Angel.fly();







    }
}
