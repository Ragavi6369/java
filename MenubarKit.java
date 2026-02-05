import java.awt.*;
import java.awt.event.*;
public class MenubarKit extends Frame{
    MenubarKit(){
        setLayout( new FlowLayout());
        Scrollbar scrollbar=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,100);
        add(scrollbar);
        MenuBar menubar=new MenuBar();
        Menu file=new Menu("File");
        MenuItem open=new MenuItem("Open");
        MenuItem save=new MenuItem("Save");
        MenuItem saveAs=new MenuItem("Save As");
        MenuItem exit=new MenuItem("Exit");
        file.add(open);
        file.add(save);
        file.add(saveAs);
        file.add(exit);
        menubar.add(file);
        Menu help=new Menu("Help");
        MenuItem About=new MenuItem("About");
        help.add(About);
        menubar.add(help);
        setMenuBar(menubar);
        setTitle("Menu Items");
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
    public static void main(String[] args){
        new MenubarKit();
    }
}