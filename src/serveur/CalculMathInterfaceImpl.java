package serveur;

import calcul.CalculMathInterface;

import java.rmi.RemoteException;

public class CalculMathInterfaceImpl implements CalculMathInterface {

    public CalculMathInterfaceImpl(){}

    @Override
    public int additionner(int a, int b) throws RemoteException {
        return a+b;
    }

    @Override
    public double diviser(int a, int b) throws RemoteException {
        return (double)a/b;
    }
}
