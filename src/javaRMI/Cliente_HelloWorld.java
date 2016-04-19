/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaRMI;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author a1276310
 */
public class Cliente_HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException, NotBoundException {
        int portaSN = 55555;
        Registry referenciaServicoNomes = LocateRegistry.getRegistry("localhost", portaSN);
        InterfaceServ refServidor = (InterfaceServ) referenciaServicoNomes.lookup("serv");
        CliImpl cli = new CliImpl(refServidor);
    }
    
}
