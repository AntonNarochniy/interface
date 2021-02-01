package kg.megacom.interface2.model;

import kg.megacom.interface2.service.Angel;

public class Rescuer implements Angel {

    @Override
    public void saveLive() {
        System.out.println("I am save life");
    }

    @Override
    public void inspire() {

        System.out.println("I am save life");

    }

    @Override
    public void cure() {

        System.out.println("I am save life");

    }
}
