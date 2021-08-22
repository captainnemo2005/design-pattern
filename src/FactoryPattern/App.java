package FactoryPattern;

public class App {
    public static void main(String [] args){
        ComputerFactory computerFactory =   new ComputerFactory();
        Computer computer1               =   computerFactory.createComputer("Laptop");
        computer1.compute();

        Computer computer2               =   computerFactory.createComputer("pc");
        computer2.compute();
    }
}
