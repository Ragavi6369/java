import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class second extends Frame implements ActionListener
{
    TextField nameField;
    TextField registerField;
    TextField emailField;
    TextField phoneField;
    TextField addressField;
    TextField dobField;
    Label statusLabel;
    Button submitButton;
    CheckboxGroup departmentGroup;
    public second()
    {
        setTitle("Student Registration");
        setSize(300,400);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);

        Label nameLabel=new Label("Name:");
        nameLabel.setBounds(50,50,60,20);
        add(nameLabel);

        nameField=new TextField();
        nameField.setBounds(120,50,120,20);
        add(nameField);

        Label registerLabel=new Label("Register no:");
        registerLabel.setBounds(50,80,60,20);
        add(registerLabel);

        registerField=new TextField();
        registerField.setBounds(120,80,120,20);
        add(registerField);

        Label emailLabel=new Label("Email:");
        emailLabel.setBounds(50,110,60,20);
        add(emailLabel);

        emailField=new TextField();
        emailField.setBounds(120,110,120,20);
        add(emailField);

        Label phoneLabel=new Label("Phone no:");
        phoneLabel.setBounds(50,140,60,20);
        add(phoneLabel);

        phoneField=new TextField();
        phoneField.setBounds(120,140,120,20);
        add(phoneField);

        Label addressLabel=new Label("Address:");
        addressLabel.setBounds(50,180,60,20);
        add(addressLabel);

        addressField=new TextField();
        addressField.setBounds(120,180,120,20);
        add(addressField);

        Label dobLabel=new Label("DOB:");
        dobLabel.setBounds(50,210,60,20);
        add (dobLabel);

        dobField=new TextField();
        dobField.setBounds(120,210,120,20);
        add(dobField);

        Label departmentLabel=new Label("Department:");
        departmentLabel.setBounds(50,240,60,20);
        add(departmentLabel);

        departmentGroup=new CheckboxGroup();
        Checkbox IT=new Checkbox("IT",departmentGroup,false);
        IT.setBounds(120,240,50,20);
        add(IT);

        Checkbox CSE=new Checkbox("CSE",departmentGroup,false);
        CSE.setBounds(120,260,50,20);
        add(CSE);

        Checkbox IC=new Checkbox("IC",departmentGroup,false);
        IC.setBounds(120,280,50,20);
        add(IC);

        Checkbox EEE=new Checkbox("EEE",departmentGroup,false);
        EEE.setBounds(120,300,60,20);
        add(EEE);

        submitButton=new Button("Submit");
        submitButton.setBounds(100,350,80,30);
        submitButton.addActionListener(this);
        add(submitButton);

        setVisible(true);
        addWindowListener(new WindowAdapter()
            {
                public void WindowClosing(WindowEvent we)
                {
                    dispose();
                }
            });
    }

    public void actionPerformed(ActionEvent e)
    {
        String  name=nameField.getText().trim();
        int register=Integer.parseInt(registerField.getText());
        String address=addressField.getText();
        String dob=dobField.getText();
        String email=emailField.getText().trim();
        String phone=phoneField.getText();

        Checkbox selecteddepartment=departmentGroup.getSelectedCheckbox();
        String department=selecteddepartment!=null?selecteddepartment.getLabel():"Not selected";

        if(name.isEmpty())
        {
            statusLabel.setText("Please enter name.");
            return;
        }
        if(register==0)
        {
            statusLabel.setText("Please enter your register no.");
            return;
        }
        if(address.isEmpty())
        {
            statusLabel.setText("Please enter your address.");
            return;
        }
        
        if(email.isEmpty())
        {
            statusLabel.setText("Please enter email.");
            return;
        }
        if(phone.isEmpty())
        {
            statusLabel.setText("Please enter your phone no.");
            return;
        }
        if(dob.isEmpty())
        {
            statusLabel.setText("Please enter your dob.");
            return;
        }
        
        String output="Name:"+name+"\nRegister no:"+register+"\nAddress:"+address+"\nEmail is"+email+"\nPhoneNumber:"+phone+"\nDepartment:"+department;
        // statusLabel.setText(output);

        String[] output1=new String[8];
        output1[0]=name;
        output1[1]=String.valueOf(register);
        output1[2]=address;
        output1[3]=dob;
        output1[4]=email;
        output1[5]=phone;
        output1[6]=department;
        for(int i=0;i<output1.length;i++)
        {
            System.out.println(output1[i]);
        }
        
        }
    public static void main(String[] args)
    {
        new second();
    }
}