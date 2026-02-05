import java.awt.*;
import java.awt.event.*;
public class third1 extends Frame
{
    third1()
    {
        setLayout(new FlowLayout());
        Label label=new Label("Enter description:");
        add(label);
        TextArea textArea=new TextArea(5,30);
        add(textArea);
        Checkbox cb1=new Checkbox("Java");
        Checkbox cb2=new Checkbox("Python");
        add(cb1);
        add(cb2);
        List list=new List(3);
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        add(list);
        Choice choice=new Choice();
        choice.add("Red");
        choice.add("Blue");
        choice.add("Green");
        add(choice);
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
        MenuItem about=new MenuItem("About");
        help.add(about);
        menuBar.add(help);
        setMenuBar(menuBar);
        setTitle("AWT All-in-one-GUI");
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
        new third1();
    }
}