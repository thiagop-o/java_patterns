package br.com.cod3r.factory.apple.before.model;

public class Iphone16 extends IPhone{
    @Override
    public void getHardware() {
        System.out.println("Hardware list");
        System.out.println("\t- 6.5in Screen");
        System.out.println("\t- A12 Chipset");
        System.out.println("\t- 16Gb RAM");
        System.out.println("\t- 512Gb Memory");
    }
}
