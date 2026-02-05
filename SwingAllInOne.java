import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;

public class SwingAllInOne extends JFrame{
    public SwingAllInOne()
    {
        setTitle("Swing All In One");
        setLayout(new FlowLayout());
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label=new JLabel("Enter name:");
        add(label);
        JTextField textField=new JTextField(15);
        add(textField);

        JCheckbox textArea=new JCheckBox(5,20);
        JScrollPane textScrollPane=new JScrollPane(textArea);
        add(textScrollPane);

        JButton button=new JButton("Show Message");
        add(button);
        button.addActionListener(e->{
            String name=textField.getText();
            boolean accepted=CheckBox.inSelected();
            JOptionPane.showMessageDialog(this,
            "Name:"+name+"\nAccepted:"+accepted,
            "Info",JOptionPane.INFORMATION_MESSAGE);
        });
        String[] columns={"ID","Name"};
        String[][] date={
            {"1","Alice"},
            {"2","Bob"}
        };

        JTable table=new JTable(new DefaultTableModel(date,columns));
        JScrollPane tableScrollPane=new JScrollPane(table);
        tableScrollPane.setPreferredSize(new Dimension(200,70));
        add(tableScrollPane);

        String[] fruits={"Apple","Banana","Cherry"};
        JList<String> fruitsList=new JList<>(fruits);
        JScrollPane listScrollPane=new JScrollPane(fruitsList);
        listScrollPane.setPreferredSize(new Dimension(100,70));
        add(listScrollPane);

        JScrollBar scrollBar=new JScrollBar(JScrollBar.HORIZONTAL,50,10,0,100);
        add(scrollBar);

        DefaultMutableTreeNode root=new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child1=new DefaultMutableTreeNode("Child1");
        DefaultMutableTreeNode child2=new DefaultMutableTreeNode("Child2");
        root.add(child1);
        root.add(child2);

        JTree tree=new JTree(root);
        JScrollPane treeScrollPane=new JScrollPane(tree);
        treeScrollPane.setPreferredSize(new Dimension(150,100));
        add(treeScrollPane);

       JButton dialogButton=new JButton("Open Dialog");
       add(dialogButton);
       dialogButton.addActionListener(e->{
            JDialog dialog=new JDialog(this,"My Dialog",true);
            dialog.setSize(200,100);
            dialog.setLayout(new FlowLayout());
            dialog.add(new JLabel("This is a JDialog"));
            JButton closeBtn=new JButton("Close");
            closeBtn.addActionListener(event->dialog.dispose());
            dialog.add(closeBtn);
            dialog.setVisible(true);
        });
        setVisible(true);
    }
    
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(SwingAllInOne::new);
    }
}