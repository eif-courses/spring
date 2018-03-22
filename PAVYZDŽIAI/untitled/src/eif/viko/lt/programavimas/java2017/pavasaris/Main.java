package eif.viko.lt.programavimas.java2017.pavasaris;

import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Main {

    public static void main(String[] args) {

        JFrame langas = new JFrame("Rundziu kaimas");
        FlowLayout springLayout = new FlowLayout();

        langas.setLayout(springLayout);
        langas.setSize(600, 400);
        langas.setVisible(true);
        JButton ok = new JButton("OK");
        JTextField jTextField = new JTextField("",20);
        langas.add(jTextField);
        langas.add(ok);



        jTextField.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, ""+jTextField.getText());
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });


        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,""+jTextField.getText());
            }
        });
        langas.pack();


	// write your code here
    }
}
