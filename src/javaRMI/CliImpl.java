/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author a1276310
 */
public class CliImpl extends UnicastRemoteObject implements InterfaceCli {
   InterfaceServ refserv;

    CliImpl(InterfaceServ refServ) throws RemoteException{
        this.refserv = refServ;
        refserv.chamar("hello world", this);
    }
    
    
    @Override
    public void echo(String mensagem) throws RemoteException {
        System.out.println(mensagem);        
    }
    
}
