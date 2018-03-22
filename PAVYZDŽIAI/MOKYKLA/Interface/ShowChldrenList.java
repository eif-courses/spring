    /*
     * To change this template, choose Tools | Templates
     * and open the template in the editor.
     */

    package Interface;

    import javax.swing.JFrame;
    import javax.swing.JTextArea;


    public class ShowChldrenList extends JFrame{
        JTextArea text = new JTextArea();
        public ShowChldrenList(Dialog owner)
        {
            super("List");
            setSize(400, 200);
            setVisible(false);
            setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            add(text);
            text.setEditable(false);
            text.setLineWrap(true);
        }
    }
