package kg.megacom.interface2.service;

public interface Angel {
    void saveLive();
    void inspire();
    void cure();
    default void serve(){
        System.out.println("I am serving");
    }

    static void fly(){
        System.out.println("I am fly");
    }

    private void sing (){
        System.out.println("I am sing");
    }
}
