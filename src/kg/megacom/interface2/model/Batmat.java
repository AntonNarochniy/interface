package kg.megacom.interface2.model;

import kg.megacom.interface2.service.Angel;

public class Batmat implements Angel {

    @Override
    public void saveLive() {
        System.out.println("I am Batman");
    }

    @Override
    public void inspire() {
        System.out.println("I am Batman");


    }

    @Override
    public void cure() {
        System.out.println("I am Batman");

    }

    @Override
    public void serve() {
        System.out.println("I am Batman");
    }
}
