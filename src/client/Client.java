package client;

import calcul.CalculMathInterface;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

    public Client(){}

    public static void main(String[] args) {
        Registry registry;
        try {
            registry = LocateRegistry.getRegistry(13045);
            CalculMathInterface stub = (CalculMathInterface) registry.lookup("CalculMathObject");
            System.out.println(stub.additionner(3,4));
            System.out.println(stub.diviser(4,5));

        }catch (RemoteException | NotBoundException e){
            e.printStackTrace();
        }
    }
}
