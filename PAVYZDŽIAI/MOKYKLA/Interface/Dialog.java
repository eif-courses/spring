
package Interface;

import java.io.IOException;

import javax.swing.*;

import mano.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.GridBagConstraints;

public class Dialog extends JFrame
{

    Mokykla mokykla;
    Tvarkarastis tvarkarastis;

    AddScoolboyDialog addChildrenFrame;
    DelSchoolboyDialog delChildrenFrame;
    ShowChldrenList list;
    ShowLessonList lessons;



    private JButton buttonAddSchoolboy = new JButton("Prideti mokini");
    private JButton buttonDelSchoolboy = new JButton("Istrinti mokini");
    private JButton buttonCloseProgram = new JButton("Uzdaryti programa");
    private JButton buttonPrintListChildren = new JButton("Atspausdinti mokiniu sarasa");
    private JButton buttonPrintList = new JButton("Atspausdinti tvarkarasti");

    public Dialog(Mokykla mokykla, Tvarkarastis tvarkarastis)
    {
        super("Mokykla");
        this.mokykla = mokykla;
        this.tvarkarastis = tvarkarastis;

        addChildrenFrame = new AddScoolboyDialog("Prideti mokini", this);
        delChildrenFrame = new DelSchoolboyDialog("Istrinti mokini", this);
        list = new ShowChldrenList(this);
        lessons = new ShowLessonList();

        buttonCloseProgram.addActionListener(new CloseProgram());

        buttonAddSchoolboy.addActionListener(new AddSchoolboy());

        buttonDelSchoolboy.addActionListener(new DelSchoolboy());

        buttonPrintListChildren.addActionListener(new PrintListChildren());

        buttonPrintList.addActionListener(new PrintList());

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        GridBagConstraints constraint = new GridBagConstraints();
        constraint.gridx = 0;
        constraint.gridy = 0;
        constraint.weightx = 0.5;
        constraint.weighty = 0;
        constraint.fill = GridBagConstraints.HORIZONTAL;
        constraint.insets = new Insets(10,5,5,5);

        panel.add(buttonAddSchoolboy, constraint);
        constraint.gridx = 0;
        constraint.gridy = 2;
        constraint.weightx = 0;

        panel.add(buttonDelSchoolboy, constraint);
        constraint.gridx = 0;
        constraint.gridy = 3;
        constraint.weightx = 0.5;
        constraint.weighty = 0;

        panel.add(buttonPrintListChildren, constraint);
        constraint.gridx = 1;
        constraint.gridy = 0;
        constraint.weightx = 0.5;
        constraint.weighty = 0;

        panel.add(buttonPrintList, constraint);
        constraint.gridx = 1;
        constraint.gridy = 2;
        constraint.weightx = 0.5;
        constraint.weighty = 0;
        constraint.gridheight = 12;
        constraint.ipady = 40;
        

        panel.add(buttonCloseProgram, constraint);
        Container cointainer = getContentPane();
        cointainer.add(panel);
    }
    class CloseProgram implements ActionListener
    {
        public void actionPerformed(ActionEvent actionEvent)
        {
            delChildrenFrame.dispose();
            addChildrenFrame.dispose();
            lessons.dispose();
            list.dispose();
            dispose();
        }
    }

    public class AddSchoolboy implements ActionListener
    {
        public void actionPerformed(ActionEvent actionEvent)
        {
         addChildrenFrame.setVisible(true);
         setVisible(false);
        }
    }


    class DelSchoolboy implements ActionListener
    {

        public void actionPerformed(ActionEvent actionEvent)
        {
            setVisible(false);
            delChildrenFrame.setVisible(true);     
        }
    }


    class PrintListChildren implements ActionListener
    {
       
        public void actionPerformed(ActionEvent e)
        {
            list.text.setText(mokykla.printListSchoolboy());
            list.setVisible(true);

        }
       
    }
    
   class PrintList implements ActionListener
   {

       public void actionPerformed(ActionEvent e)
       {
            lessons.text.setText(tvarkarastis.toString());
            lessons.setVisible(true);
       }

    }
   public void addSchoolBoy(Mokinys mok)
   {
        mokykla.addSchoolboy(mok);
   }
   public boolean removeSchoolboy(int index)
   {
        return mokykla.delSchoolboy(index);
   }
   public void refreshList()
   {
       list.text.setText(mokykla.printListSchoolboy());
   }
}
    