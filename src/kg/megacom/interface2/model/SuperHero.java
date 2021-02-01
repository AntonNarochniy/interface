package kg.megacom.interface2.model;

import kg.megacom.interface2.service.Angel;

public class SuperHero {

    private Angel angel;

    public SuperHero(Angel angel) {
        this.angel = angel;
    }

    public void protect(){
        this.angel.saveLive();
        this.angel.cure();
        this.angel.inspire();

    }
}
