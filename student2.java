import java.awt.*;
import java.awt.event.*;
public class student2 extends Frame
{
    student2()
    {

        TextField namefield;

        setLayout(new FlowLayout());
        Label namelabel=new Label("Name:");
        namelabel.setBounds(50,50,60,20);
        add(namelabel);

        namefield =new TextField();
        namefield.setBounds(120,50,200,20);
        add(namefield);

        Label label2=new Label("Father name:");
        add(label2);
        TextArea textArea2=new TextArea(1,20);
        add(textArea2);

        Label label3=new Label("Mother name:");
        add(label3);
        TextArea textArea3=new TextArea(1,20);
        add(textArea3);

        Label label4=new Label("Age:");
        add(label4);
        TextArea textArea4=new TextArea(1,20);
        add(textArea4);

        Label label5=new Label("Date of birth:");
        add(label5);
        TextArea textArea5=new TextArea(1,20);
        add(textArea5);

        Label label6=new Label("Address:");
        add(label6);
        TextArea textArea6=new TextArea(5,40);
        add(textArea6);

        Label label7=new Label("Colleage Name:");
        add(label7);
        TextArea textArea7=new TextArea(2,20);
        add(textArea7);

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

        Label label8=new Label("Percentage:");
        add(label8);
        TextArea textArea8=new TextArea(1,20);
        add(textArea8);

        MenuBar menuBar=new MenuBar();
        Menu file=new Menu("File");
        MenuItem open =new MenuItem("Open");
        MenuItem save=new MenuItem("Save");
        MenuItem saveAs=new MenuItem("Save as");
        MenuItem exit=new MenuItem("Exit");
        file.add(open);
        file.add(save);
        file.add(saveAs);
        file.add(exit);
        menuBar.add(file);

        Menu help=new Menu("Help");
        MenuItem about=new MenuItem("About");
        help.add(about);
        menuBar.add(help);
        setMenuBar(menuBar);
        setTitle("Students Registration");
        setSize(400,550);
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
        new student2();
    }
}