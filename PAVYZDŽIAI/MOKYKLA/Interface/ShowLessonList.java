/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class ShowLessonList extends JFrame{

    JTextArea text = new JTextArea();

    public ShowLessonList()
    {
        super("Lesson list");
        setVisible(false);
        setSize(300, 530);
        text.setEditable(false);
        add(text);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }
}
