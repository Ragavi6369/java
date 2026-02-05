import java.awt.*;
import java.swingx.*;
import javax.swingx.table.DefaultTableModel;
import java.awt.event.*;
import java.io.*;


public class SwingList extends JFrame implements ActionListener
{
    public SwingList()
    {
        setTitle("Swing Linked List");
        setLayout(new FlowLayout());
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label=new JLabel("Enter name:");
        add(label);

        JTextField textField=new JTextField(15);
        add(textField);
        JButton button=new JButton("Submit");
        add(button);
        String name=button.getText().trim();
        
        
   }
   
   public void actionperformed(ActionEvent e)
    {
            
        JButton button=new JButton("Submit");
        add(button);
        button.addActionListener(e->{
            String name=textField.getText();
        });

           
    }
   
   public static void main(String[] args)
   {
    SwingUtilities.invokeLater(SwingList::new);
   }
}