import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
   JButton login , clear, signup;
    JTextField cardTextField;
    JPasswordField pinTextField;
    Login(){

        setTitle("ATM");                  // title
        setLayout(null);       // to pick custom layout

        // ----------------- Image Icons ------------------------------
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg")); // to extarct icon
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);  // TO SCALE THE IAMGE
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3); // CANT PLACE IMAGE DIRECLTY we used to set image
        label.setBounds(70, 10, 100, 100); //l,r,h,w
        add(label);   // to add in frame

        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200, 40, 400, 40);
        add(text);

        // ---------------------------Label and text box -------------------

        JLabel cardNumber = new JLabel("Card No:");
        cardNumber.setFont(new Font("Raleway", Font.BOLD, 28));
        cardNumber.setBounds(120, 150, 150, 30);
        add(cardNumber);

        cardTextField = new JTextField();
        cardTextField.setBounds(300, 150, 230, 30);
        cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(cardTextField);

        JLabel Pin = new JLabel("PIN :");
        Pin.setFont(new Font("Raleway", Font.BOLD, 28));
        Pin.setBounds(120, 220, 250, 30);
        add(Pin);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 220, 230, 30);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(pinTextField);

        //------------------------buttons--------------------

        login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        login.addActionListener(this);
        add(login);

        clear = new JButton("Clear");
        clear.setBounds(430, 300, 100, 30);
        clear.addActionListener(this);
        add(clear);

        signup = new JButton("SIGN UP");
        signup.setBounds(300, 350, 230, 30);
        signup.addActionListener(this);
        add(signup);



        getContentPane().setBackground(Color.white);  //to set color


        setSize(800, 480);   //Size of Frame
        setVisible(true);                 // set visibility
        setLocation(350, 200);      // to set location visible


    }

    public static void main(String args[]){
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {        // when button is clicked what to do
         if(e.getSource()== clear){
             cardTextField.setText("");
             pinTextField.setText("");
         }
         else if(e.getSource()==login){

         }
         else if(e.getSource()==signup){

         }
    }
}

