import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;

public class National extends JFrame
{
    public National()
    {
        setTitle("National shoping");
        setLayout(new FlowLayout());
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label=new JLabel("Customer Name");
        add(label);
        JTextField textField=new JTextField(15);
        add(textField);

        JLabel label1=new JLabel("phone number");
        add(label1);
        JTextField textField1=new JTextField(15);
        add(textField1);
        
        JLabel label3=new JLabel("Place");
        add(label3);
        JTextField textField3=new JTextField(15);
        add(textField3);

        
        JCheckBox checkbox=new JCheckBox("Feed Back");
        add(checkbox);
        JTextArea textArea=new JTextArea(5,20);
        JScrollPane scrollbar=new JScrollPane(textArea);
        add(scrollbar);

        String[] products={"Stationary","Kitchen items","Chocolate"};
        JList<String> productsList=new JList<>(products);
        JScrollPane listScrollPane=new JScrollPane(productsList);
        
        listScrollPane.setPreferredSize(new Dimension(150,90));
        add(listScrollPane);

        JButton button=new JButton("Show message");
        add(button);

        button.addActionListener(e->{
            String name=textField.getText();
            boolean accepted=checkbox.isSelected();
            JOptionPane.showMessageDialog(this,
            "Name:"+name+"\nyou would got product",
            "Info",JOptionPane.INFORMATION_MESSAGE);
        });

        String[] colums={"Name","WorkerID"};
        String[][] data={
            {"Ragavi","1234"}
        };
        JTable table=new JTable(new DefaultTableModel(data,colums));
        JScrollPane tableScrollPane=new JScrollPane(table);
        tableScrollPane.setPreferredSize(new Dimension(200,90));
        add(tableScrollPane);

        DefaultMutableTreeNode root=new DefaultMutableTreeNode("Free product");
        DefaultMutableTreeNode child1=new DefaultMutableTreeNode("Chocolate");
        DefaultMutableTreeNode child3=new DefaultMutableTreeNode("Pens");
        DefaultMutableTreeNode child4=new DefaultMutableTreeNode("Paste");
        DefaultMutableTreeNode child5=new DefaultMutableTreeNode("Soap");
        root.add(child1);
        root.add(child3);
        root.add(child4);
        root.add(child5);
        JTree tree=new JTree(root);
        JScrollPane treeScrollPane=new JScrollPane(tree);
        treeScrollPane.setPreferredSize(new Dimension(400,100));
        add(treeScrollPane);


        JLabel label2=new JLabel("creadites");
        add(label2);
        JTextField textField2=new JTextField(15);
        add(textField2);

        setVisible(true);
    }
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(National::new);
    }
}