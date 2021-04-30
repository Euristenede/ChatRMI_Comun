/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmichat_comun;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.Component;
import javax.swing.JOptionPane;
/**
 *
 * @author euris
 */
public class UIUtilitarios {
    //Centralizar a janela no meio da tela
    public static void centralizarJanela(Window janela){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        //Obter a resolução da tela
        Dimension tamanhoTela = toolkit.getScreenSize();
        //Possiciona a janela no meio da tela, de acordo com a resolução da tela
        janela.setLocation(tamanhoTela.width / 2 - janela.getWidth() / 2, tamanhoTela.height / 2 - janela.getHeight());
    }
    //Exibe uma caixa de dialogo de erro
    public static void disparaException(Component parent, Exception e){
        //Imprime a exceção no console
        e.printStackTrace();
        //Exibe a mensagem de diálogo
        JOptionPane.showMessageDialog(parent, e.getMessage(), "Exceção lançada", JOptionPane.ERROR_MESSAGE);
    }
    //Exibe uma caixa de dialogo de alerta
    public static void disparaAlerta(Component parent, String titulo, String mensagem){
        JOptionPane.showMessageDialog(parent, mensagem, titulo, JOptionPane.WARNING_MESSAGE);
    }
}
