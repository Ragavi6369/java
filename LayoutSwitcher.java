import java.awt.*;
import java.lang.String;
import javax.swing.*;
public class LayoutSwitcher extends JFrame
{
    private JPanel panel;
    private JList<String>layoutList;
    private CardLayout cardLayout;
    public LayoutSwitcher()
    {
        setTitle("Layout Manager Switcher");
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        String[] layouts = {"BorderLayout", "FlowLayout", "GridLayout", "CardLayout", "BoxLayout", "SpringLayout"};
        layoutList=new JList<>(layouts);
        layoutList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        layoutList.setSelectedIndex(0);
        add(new JScrollPane(layoutList),BorderLayout.WEST);
        panel=new JPanel();
        panel.setLayout(new BorderLayout());
        add(panel,BorderLayout.CENTER);
        for (int i=1;i<=5;i++)
        {
            panel.add(new JButton("Box"+i),BorderLayout.CENTER);
        }
        layoutList.addListSelectionListener(e->{
            if(!e.getValueIsAdjusting()){
                updateLayout(layoutList.getSelectedValue());
            }
        });
        updateLayout(layouts[0]);
        setVisible(true);
    }
    private void updateLayout(String layout)
    {
        panel.removeAll();
        switch(layout)
        {
            case"BorderLayout":
                panel.setLayout(new BorderLayout());
                panel.add(new JButton("Bpx 1"),BorderLayout.NORTH);
                panel.add(new JButton("Box 2"),BorderLayout.SOUTH);
                panel.add(new JButton("Box 3"),BorderLayout.EAST);
                panel.add(new JButton("Box 4"),BorderLayout.WEST);
                panel.add(new JButton("Box 5"),BorderLayout.CENTER);
                break;
            case "FlowLayout":
                panel.setLayout(new FlowLayout());
                for(int i=1;i<=5;i++)
                {
                    panel.add(new JButton("Box"+i));
                }
                break;
            case "GridLayout":
                panel.setLayout(new GridLayout());
                for(int i=1;i<=5;i++)
                {
                    panel.add(new JButton("Box"+i));
                }
                break;
            case "CardLayout":
                cardLayout=new CardLayout();
                panel.setLayout(cardLayout);
                for(int i=1;i<=5;i++)
                {
                    panel.add(new JButton("Box"+i));
                }
                cardLayout.show(panel,"Card 1");
                break;
            case "BoxLayout":
                panel.setLayout(new BoxLayout(panel,BoxLayout.X_AXIS));
                for(int i=1;i<=5;i++)
                {
                    panel.add(new JButton("Box"+i));
                }
                break;
            case "SpringLayout":
                panel.setLayout(new SpringLayout());
                for(int i=1;i<=5;i++)
                {
                    JButton box=new JButton("Box"+i);
                    panel.add(box);
                    SpringLayout layoutManager=(SpringLayout)panel.getLayout();
                    if(i==1)
                    {
                        layoutManager.putConstraint(SpringLayout.WEST,box,10,SpringLayout.WEST,panel);
                    }else{
                        layoutManager.putConstraint(SpringLayout.WEST,box,10,SpringLayout.EAST,panel.getComponent(i-2));

                    }
                    layoutManager.putConstraint(SpringLayout.NORTH,box,10,SpringLayout.NORTH,panel);
                }
                break;
        }
        panel.revalidate();
        panel.repaint();
    }
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(()->new LayoutSwitcher());
    }
}