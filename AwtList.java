import java.awt.*;
import java.awt.event.*;

public class AwtList extends Frame implements ActionListener{

    TextField nameField,ageField;
    Button addButton;
    List displayList;
    public AwtList()
    {
        
        Label nameLabel=new Label("Name");
        add(nameLabel);
        nameField=new TextField(15); 
        add(nameField);
        Label ageLabel=new Label("Age");
        add(ageLabel);
        ageField=new TextField(10);
        add(ageField);
        addButton=new Button("Submit");
        add(addButton);
        displayList=new List();
        add(displayList);

        addButton.addActionListener(this);
        setLayout(new FlowLayout());
        setTitle("AWT List");
        setSize(200,400);
        setVisible(true);
    

        addWindowListener(new WindowAdapter()
        {
            public void WindowClosing(WindowEvent e)
            {
                dispose();
            }
        });
    }
    public void actionPerformed(ActionEvent e)
    {
        String name=nameField.getText().trim();
        String age=ageField.getText().trim();
        if(!name.isEmpty() && !age.isEmpty())
        {
            String entry="Name:"+name+"\t Age:"+age;
            displayList.add(entry);
            nameField.setText(" ");
            ageField.setText(" ");          
        }
    }
    public static void main(String[] args)
    {
        new AwtList();
    }
}