/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmichat_comun;

/**
 *
 * @author euris
 */
public class ChatException extends Exception{
    //Construtor
    public ChatException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
    //Construtor
    public ChatException(String mensagem) {
        super(mensagem);
    }
}
