import java.awt.*;
import java.awt.event.*;
import java.lang.String;
public class student1 extends Frame
{
    student1()
    {
        Checkbox cb1=new Checkbox("I year");
        Checkbox cb2=new Checkbox("II year");
        Checkbox cb3=new Checkbox("III year");
        Checkbox cb4=new Checkbox("IV year");
        add(cb1);
        add(cb2);
        add(cb3);
        add(cb4);

        List list=new List(5);
        list.add("IT");
        list.add("CSE");
        list.add("EEE");
        list.add("ECE");
        list.add("IC");
        add(list);

        Choice choice=new Choice();
        choice.add("NCC");
        choice.add("NSS");
        choice.add("JRC");
        add(choice);

        setLayout(new FlowLayout());
        Label label=new Label("Give Feedback");
        add(label);
        TextArea textArea=new TextArea(5,40);
        add(textArea);

        Scrollbar scrollbar=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,100);
        add(scrollbar);

        MenuBar menuBar=new MenuBar();
        Menu file=new Menu("File");
        MenuItem open=new MenuItem("Open");
        MenuItem save=new MenuItem("Save");
        MenuItem saveAs=new MenuItem("Save As");
        MenuItem exit=new MenuItem("Exit");
        file.add(open);
        file.add(save);
        file.add(saveAs);
        file.add(exit);
        menuBar.add(file);
        Menu help=new Menu("Help");
        MenuItem about=new MenuItem("about");
        help.add(about);
        menuBar.add(help);
        setMenuBar(menuBar);
        setTitle("Student Registration");
        setSize(400,600);
        setVisible(true);
        addWindowListener(new WindowAdapter()
        {
            public void WindowClosing(WindowEvent e)
            {
                dispose();
            }
        });
        exit.addActionListener(e->dispose());
    }
    public static void main(String[] args)
    {
        new student1();
    }
}