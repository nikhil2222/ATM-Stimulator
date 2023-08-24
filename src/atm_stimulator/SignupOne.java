package atm_stimulator;
import javax.swing.*;
import java.awt.*;
import java.util.Map;
import java.util.Random;

public class SignupOne extends JFrame  {



    SignupOne(){
        setLayout(null);
        Random ran = new Random();
        long random = Math.abs((ran.nextLong() % 900L)+100L);

        JLabel formno = new JLabel("APPLICATION FORM NO. "+random);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140,20,600,40);
        add(formno);

        JLabel personalDetails = new JLabel("Page 1 : Personal Details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetails.setBounds(290,80,400,30);
        add(personalDetails);

        JLabel name = new JLabel("Name");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100,140,100,30);
        add(name);
        JTextField nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);

        JLabel fname = new JLabel("Fathers Name");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100,190,200,30);
        add(fname);
        JTextField fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        fnameTextField.setBounds(300, 190, 400, 30);
        add(fnameTextField);

        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100,240,200,30);
        add(dob);
        JTextField datechooser = new JTextField();
        datechooser.setFont(new Font("Raleway", Font.BOLD, 14));
        datechooser.setBounds(300, 240, 400, 30);
        add(datechooser);



        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100,290,200,30);
        add(gender);
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        male.setBounds(300,290,120,30);
        male.setBackground(Color.white);
        add(male);
        female.setBounds(450,290,120,30);
        female.setBackground(Color.white);
        add(female);
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);


        JLabel email = new JLabel("Email:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100,340,200,30);
        add(email);
        JTextField emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        emailTextField.setBounds(300, 340, 400, 30);
        add(emailTextField);

        JLabel martial = new JLabel("Martial Status:");
        martial.setFont(new Font("Raleway", Font.BOLD, 20));
        martial.setBounds(100,390,200,30);
        add(martial);
        JRadioButton married = new JRadioButton("Male");
        JRadioButton unmarried = new JRadioButton("Female");
        JRadioButton others = new JRadioButton("Others");
        married.setBounds(300,390,100,30);
        married.setBackground(Color.white);
        add(married);
        unmarried.setBounds(450,390,120,30);
        unmarried.setBackground(Color.white);
        add(unmarried);
        others.setBounds(630,390,120,30);
        others.setBackground(Color.white);
        add(others);
        ButtonGroup maritilagroup = new ButtonGroup();
        gendergroup.add(married);
        gendergroup.add(unmarried);
        gendergroup.add(others);


        JLabel address = new JLabel("Address: ");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100,440,200,30);
        add(address);
        JTextField addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        addressTextField.setBounds(300, 440, 400, 30);
        add(addressTextField);

        JLabel city = new JLabel("City :");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100,490,200,30);
        add(city);
        JTextField cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        cityTextField.setBounds(300, 490, 400, 30);
        add(cityTextField);

        JLabel state = new JLabel("State :");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100,540,200,30);
        add(state);
        JTextField stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        stateTextField.setBounds(300, 540, 400, 30);
        add(stateTextField);

        JLabel pincode = new JLabel("Pin Code :");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        JTextField pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        pincodeTextField.setBounds(300, 590, 400, 30);
        add(pincodeTextField);

        JButton next = new JButton("next");
        next.setFont(new Font("Raleway", Font.BOLD,14));
        next.setBounds(620,660,80,30);
        add(next);



        setSize(850, 850);
        setLocation(350, 10);
        setVisible(true);
        getContentPane().setBackground(Color.white);

    }


    public static void main(String args[]){
        new SignupOne();
    }
}
