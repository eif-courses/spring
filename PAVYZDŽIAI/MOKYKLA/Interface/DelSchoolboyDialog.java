
package Interface;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import mano.Mokinys;

public class DelSchoolboyDialog extends JFrame
{
    Dialog owner;
    JTextField index = new JTextField(5);
    JLabel l_index = new JLabel("Mokinio nr sarase");
    JButton b_remove = new JButton("Remove");
    JButton b_cancel = new JButton("Cancel");

    public DelSchoolboyDialog(String tittle, Dialog owner) {
        super(tittle);
        this.owner = owner;
        setLayout(new FlowLayout(FlowLayout.RIGHT));
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setVisible(false);
        setSize(200, 100);
        add(l_index);
        add(index);
        add(b_remove);
        add(b_cancel);
        b_cancel.addActionListener(new CancelBtn());
        b_remove.addActionListener(new RemoveBtn());
    }

    class CancelBtn implements ActionListener
    {
        public void actionPerformed(ActionEvent e) {
            setVisible(false);
            owner.setVisible(true);
        }
    }
    class RemoveBtn implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            int i = Integer.parseInt(index.getText());
            if(owner.removeSchoolboy(i))
            {
                owner.refreshList();
                JOptionPane.showMessageDialog(null, "Mokinys sekmingai pasalintas");
            }
            else
                JOptionPane.showMessageDialog(null, "Nera mokinio su tokiu indeksu");
        }
    }


}
