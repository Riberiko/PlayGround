import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.MouseInputListener;

public class Log extends JPanel implements MouseInputListener,ActionListener{
    JLabel userLogo;
    JLabel passwordLogo;
    JTextField userName;
    JTextField userPassword;
    JButton submit;
    JButton create;

    Log(){
        setPreferredSize(new Dimension(400,125));
        setLayout(null);
        setBackground(Color.cyan);
        userLogo = new JLabel("user name");
        passwordLogo = new JLabel("password");
        userName = new JTextField("user name");
        userPassword = new JTextField("password");
        submit = new JButton("Submit");
        create = new JButton("Sign Up");
        userLogo.setBounds(15, 15, 100, 30);
        add(userLogo);
        userName.setBounds(80, 15, 110, 30);
        userName.addMouseListener(this);
        add(userName);
        passwordLogo.setBounds(200, 15, 100, 30);
        add(passwordLogo);
        userPassword.setBounds(260, 15, 120, 30);
        userPassword.addMouseListener(this);
        add(userPassword);
        create.setBounds(100, 60, 90, 30);
        create.addActionListener(this);
        add(create);
        submit.setBounds(200, 60, 90, 30);
        submit.addActionListener(this);
        add(submit);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == userName){
            if(userName.getText().equals("user name")){
                userName.setText("");
            }
        }
        if(e.getSource() == userPassword){
            if(userPassword.getText().equals("password")){
                userPassword.setText("");
            }
        }
        
    }
    @Override
    public void mousePressed(MouseEvent e) {
    }
    @Override
    public void mouseReleased(MouseEvent e) {
    }
    @Override
    public void mouseEntered(MouseEvent e) {
    }
    @Override
    public void mouseExited(MouseEvent e) { 
    }
    @Override
    public void mouseDragged(MouseEvent e) {
    }
    @Override
    public void mouseMoved(MouseEvent e) {
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == submit){
            System.out.println("What");
        }
        if(e.getSource() == create){
            System.out.println("Fuck it all");
            Main.removeLog();
        }
    }
    
}
