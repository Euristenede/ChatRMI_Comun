/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmichat_comun;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author euris
 */
public class InformacaoCliente implements Serializable{
    //Nome do cliente digitado na interface grafica
    private String nome;
    //Referência do cliente, utilizada pelo servidor
    private ClienteCallback callback;
    //Construtor
    public InformacaoCliente(String nome, ClienteCallback callback) {
        this.nome = nome;
        this.callback = callback;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ClienteCallback getCallback() {
        return callback;
    }

    public void setCallback(ClienteCallback callback) {
        this.callback = callback;
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result +((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        InformacaoCliente other = (InformacaoCliente) obj;
        if (nome == null) {
            if (other.nome != null){
                return false;
            }
        }else if (!nome.equals(other.nome)){
            return false;
        }
        return true;
    }
    
    
}
