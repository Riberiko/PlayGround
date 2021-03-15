import javax.swing.JFrame;

public class Main extends JFrame{
    static Main frame;
    static Log logIn;
    static Sign signUp;
    Main(String name){
        setTitle(name);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        logIn = new Log();
        add(logIn);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args){
        frame = new Main("Log in");
    }
    public static void removeLog(){
        frame.setVisible(false);
        frame.remove(logIn);
        signUp = new Sign();
        frame.add(signUp);
        frame.repaint();
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}