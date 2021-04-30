/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmichat_comun;
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author euris
 */
public interface ClienteCallback extends Remote{
    //Indica que o servior está enviando uma mensagem ao cliente, e que deve ser exibida
    public void onEnviandoMensagem(String mensagem) throws RemoteException;
    //Indica que o servidor está avisando que vai ser encerrado
    public void onServidorDesligando() throws RemoteException;
}
