/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author a1276310
 */
public interface InterfaceServ extends Remote{
    
    public void chamar(String nomeCliente, InterfaceCli refCliente) throws RemoteException;
    
}
