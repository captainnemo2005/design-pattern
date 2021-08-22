package FactoryPattern;

public class ComputerFactory {

    public Computer createComputer(String type){
        if(type.equalsIgnoreCase("laptop")){
            return new Laptop();
        }
        else if(type.equalsIgnoreCase("pc")){
            return new PC();
        } return null;
    }
}
