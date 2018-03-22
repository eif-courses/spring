
package Interface;

import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import mano.InvalidSchoolboyDataException;
import mano.Mokinys;


public class AddScoolboyDialog extends JFrame
{
    JTextField name = new JTextField(15);
    JTextField surname = new JTextField(15);
    JTextField _class = new JTextField(3);
    JTextField hours = new JTextField(4);
    JLabel l_name = new JLabel("Vardas");
    JLabel l_surname = new JLabel("Pavarde");
    JLabel l_class = new JLabel("Klase");
    JLabel l_hours = new JLabel("Valandu sk");
    JButton b_add = new JButton("Add");
    JButton b_cancel = new JButton("Cancel");
    Dialog owner;


    public AddScoolboyDialog(String tittle, Dialog owner)
    {
        super(tittle);
        this.owner = owner;
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(l_name);
        add(name);
        add(l_surname);
        add(surname);
        add(l_class);
        add(_class);
        add(l_hours);
        add(hours);
        add(b_add);
        add(b_cancel);
        setVisible(false);
        setSize(250, 150);
        b_add.addActionListener(new AddBtn());
        b_cancel.addActionListener(new CancelBtn());
    }

    class CancelBtn implements ActionListener
    {
        public void actionPerformed(ActionEvent actionEvent)
        {
            setVisible(false);
            owner.setVisible(true);
        }
    }
   class AddBtn implements ActionListener
    {
        public void actionPerformed(ActionEvent actionEvent)
        {
            int classs = 0, hour = 0;
            try{
                classs = Integer.parseInt(_class.getText());
                hour = Integer.parseInt(hours.getText());
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "please enter valid numbers");
                return;
            }

            Mokinys mok;
            try{
                mok = new Mokinys(name.getText(), surname.getText(),
                        classs, hour);
            }
            catch(InvalidSchoolboyDataException e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage());
                return;
            }
            owner.addSchoolBoy(mok);
            owner.refreshList();
            JOptionPane.showMessageDialog(null, "Mokinys sekmingai pridetas");
        }
    }
}