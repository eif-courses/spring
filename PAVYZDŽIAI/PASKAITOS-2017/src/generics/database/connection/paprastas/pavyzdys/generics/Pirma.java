package generics.database.connection.paprastas.pavyzdys.generics;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.SwingUtilities.updateComponentTreeUI;

/**
 * Created by Marius on 2/2/2017.
 */
public class Pirma {
    private JButton button1;
    private JPanel mainas;
    private JTree tree1;
    private JProgressBar progressBar1;

    public Pirma() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"hello");
            }
        });
    }

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {

        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        JFrame jFrame = new JFrame("Windows");
        jFrame.setSize(600, 480);
        jFrame.setContentPane(new Pirma().mainas);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        updateComponentTreeUI(jFrame);
        jFrame.pack();
        jFrame.setVisible(true);




    }


}
