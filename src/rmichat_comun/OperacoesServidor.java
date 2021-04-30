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
//Interface utilizada pelos clientes para se comunicarem com o servidor
public interface OperacoesServidor extends Remote{
    //Contante que indica o nome do objeto remoto do servidor registrado no RMI Registry
    public static final String SERVER_OBJ_NAME = "chatServer";
    //Faz a conexão de um cliente no servidor
    public void connect(InformacaoCliente clientInfo) throws RemoteException, NomeDuplicadoException;
    //Desconecta um cliente do servidor
    public void disconect(InformacaoCliente clientInfo, String mensagem) throws RemoteException;
    //public void disconect(InformacaoCliente clientInfo);
    //Envia uma mensagem ao servidor, para ser distribuída para todos do clientes
    public void enviarMensagem(InformacaoCliente clientInfo, String mensagem) throws RemoteException;
}
