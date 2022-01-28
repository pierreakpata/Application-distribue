package serveur;

import calcul.CalculMathInterface;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServeurCalcul {

    public ServeurCalcul(){}

    public static void main(String[] args){
        try{
            CalculMathInterfaceImpl objDistant = new CalculMathInterfaceImpl();
            CalculMathInterface stub = (CalculMathInterface) UnicastRemoteObject.exportObject(objDistant, 0);

            Registry registry = LocateRegistry.createRegistry(13045);
            registry.bind("CalculMathObject", stub);

            System.err.println("Serveur prêt");
        }catch(RemoteException | AlreadyBoundException e){
            e.printStackTrace();
        }
    }
}
