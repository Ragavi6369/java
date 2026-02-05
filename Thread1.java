import java.awt.*;
import java.awt.event.*;

public class Thread1 extends Frame
{
    setLayout(new FlowLayout());
    Label label1=new Label("Name:");
    add(label1);
    TextArea textArea1=new TextArea(5,10);
    add(textArea1);

    Checkbox c1=new Checkbox("I Year");
    Checkbox c2=new Checkbox("II Year");
    Checkbox c3=new Checkbox("III Year");
    Checkbox c4=new Checkbox("IV Year");
    add(c1);
    add(c2);
    add(c3);
    add(c4);
    SetTitle("Thread1");
    setSize(200,400);
    setVisible(true);
    addWindowListener(new WindowAdapter()
    {
        public void WindowClosing(WindowEvent e)
        {
            dispose();
        }
    });
    exit.addActionListener(e->dispose());
    public static void main(String[] args)
    {
        new Thread1();
    }
}