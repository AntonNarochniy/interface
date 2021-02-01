package kg.megacom.interface2;

import kg.megacom.interface2.service.Angel;
import kg.megacom.interface2.service.Programmer;

public class ProgrammerImpl implements Programmer, Angel {
    @Override
    public void saveLive() {
        System.out.println("Make 911 telegram bot");
    }

    @Override
    public void daMyAwesomeSite() {
        System.out.println("Creating wordpress site");
    }

    @Override
    public void inspire() {
        System.out.println("I am Batman");

    }

    @Override
    public void cure() {
        System.out.println("I am Batman");

    }
}
