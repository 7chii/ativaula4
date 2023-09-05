/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P111;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author maria
 */
public class JFRAME {
    public static void main(String[] args){
        
        LOGIN log = new LOGIN();
        
        //jan entrada
        JFrame jan = new JFrame("ENTRADA");
        jan.setSize(350, 150);
        jan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jan.setResizable(false);
        JPanel pai = new JPanel();
        //texto nome
        JTextField texto = new JTextField(20);
        texto.addActionListener((ActionEvent e) -> {
            log.NOME = texto.getText();
        });
        //texto sobrenome
        JTextField texto2 = new JTextField(20);
        texto2.addActionListener(new ActionListener()
        {
            public void ActionPerformed(ActionEvent e)
            {
            log.SOBRENOME = texto2.getText();
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        //JLabel TITULO = new JLabel();
        JButton bota = new JButton("ENTRAR");
        bota.addActionListener((ActionEvent e) -> {
            log.NOME = texto.getText();
            log.SOBRENOME = texto2.getText();
            
            String message = "Bem Vindo(a) "+ log.NOME+ " "+log.SOBRENOME;
            JOptionPane.showMessageDialog(jan, message , "LOGIN REALIZADO",JOptionPane.PLAIN_MESSAGE);
            
        });
        JLabel nome = new JLabel();
        nome.setText("NOME:");
        nome.setHorizontalAlignment(JLabel.CENTER);
        nome.setVerticalAlignment(JLabel.CENTER);
        //label sobrenome
        JLabel sobren = new JLabel();
        sobren.setText("SOBRENOME:");
        sobren.setHorizontalAlignment(JLabel.CENTER);
        //comp em PAInel rs
        pai.add(nome);
        pai.add(texto);
        pai.add(sobren);
        pai.add(texto2);
        pai.add(bota);
        //add PAInel em janela
        jan.getContentPane().add(pai);
        jan.setVisible(true);
    }
    
}
