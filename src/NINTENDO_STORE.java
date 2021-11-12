import javafx.scene.control.TabPane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NINTENDO_STORE extends JFrame
{
    private JPanel mainPanel;
    private CardLayout cardLayout;
    private TabPane tabPane;
    private JRadioButtonMenuItem botonesTipoUsuario;
   private InitialScreen initialScreen;
    private CreateAccountPanel createAccountPanel;
    private LogInPanel logingPanel;

    public NINTENDO_STORE(String title){
        //Jpanel Principal
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);
        this.setPreferredSize(new Dimension(600,600));
       initialScreen = new InitialScreen(cardLayout,mainPanel);
        mainPanel.add(initialScreen,"Initial");
        createAccountPanel = new CreateAccountPanel(cardLayout,mainPanel);
        mainPanel.add(createAccountPanel,"createAccountPanel");
       logingPanel = new LogInPanel(cardLayout,mainPanel);
        mainPanel.add(logingPanel,"LogInPanel");

        add(mainPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setLocationByPlatform(true);
        setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                NINTENDO_STORE main = new NINTENDO_STORE("NINTENDO STORE");
            }
        });
    }
}
class InitialScreen extends JPanel{
    JLabel welcomeLabel = new JLabel("NINTENDO STORE");
    JLabel iconNintendo = new JLabel(new ImageIcon("C:/Users/jcoq2/IdeaProjects/ExamenLab5P2_JoseOsejo/QyyndtG2.png")
            ,JLabel.LEFT);
    public InitialScreen(CardLayout cardLayout,JPanel mainPanel) {
        setLayout(null);
        welcomeLabel.setBounds(220,50,180,25);
        welcomeLabel.setFont(new Font("BritanicBold",Font.BOLD,18));
        welcomeLabel.setForeground(Color.WHITE);
        iconNintendo.setBounds(100,30,400,300);

        setBackground(Color.BLACK);
        JButton logInButton = new JButton("Log In");
        logInButton.setLayout(null);
        logInButton.setBounds(170,300,120,25);
        logInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                cardLayout.show(mainPanel,"LogInPanel");
            }
        });
        JButton createAccountButton = new JButton("CreateAccount");
        createAccountButton.setLayout(null);
        createAccountButton.setBounds(320,300,120,25);
        createAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                cardLayout.show(mainPanel,"createAccountPanel");
            }
        });
        add(logInButton);
        add(createAccountButton);
        add(welcomeLabel);
        add(iconNintendo);
    }
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(300, 300);
    }
}
class CreateAccountPanel extends JPanel
{
    JTextField textName= new JTextField();
    JTextField textGender= new JTextField();
    JTextField textUser= new JTextField();
    JTextField textPassword= new JTextField();
    JTextField textAge= new JTextField();
    JLabel nameLabel = new JLabel("Name");
    JLabel genderLabel = new JLabel("Gender");
    JLabel userLabel = new JLabel("Username");
    JLabel passwordLabel = new JLabel("Password");
    JLabel ageLabel = new JLabel("Age");
    JLabel twitterLogoAccount = new JLabel(new ImageIcon("C:/Users/jcoq2/IdeaProjects/ExamenLab5P2_JoseOsejo/QyyndtG3.png"));
    public CreateAccountPanel(CardLayout cardLayout, JPanel mainPanel)
    {
        setBackground(Color.BLACK);
        setLayout(null);
        textName.setBounds(110,50,100,25);
        textGender.setBounds(110,100,100,25);
        textUser.setBounds(110,150,100,25);
        textPassword.setBounds(110,200,100,25);
        textAge.setBounds(110,250,100,25);
        nameLabel.setBounds(10,50,100,25);
        nameLabel.setFont(new Font("TimesRoman",Font.ITALIC,18));
        nameLabel.setForeground(Color.WHITE);
        genderLabel.setBounds(10,100,100,25);
        genderLabel.setFont(new Font("TimesRoman",Font.ITALIC,18));
        genderLabel.setForeground(Color.WHITE);
        userLabel.setBounds(10,150,100,25);
        userLabel.setFont(new Font("TimesRoman",Font.ITALIC,18));
        userLabel.setForeground(Color.WHITE);
        passwordLabel.setBounds(10,200,100,25);
        passwordLabel.setFont(new Font("TimesRoman",Font.ITALIC,18));
        passwordLabel.setForeground(Color.WHITE);
        ageLabel.setBounds(10,250,100,25);
        ageLabel.setFont(new Font("TimesRoman",Font.ITALIC,18));
        ageLabel.setForeground(Color.WHITE);
        twitterLogoAccount.setBounds(250,60,200,200);
        JButton createButton = new JButton("Create");
        createButton.setLayout(null);
        createButton.setBounds(150,350,100,50);
        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //cardLayout.show(mainPanel,"");

            }
        });
        JButton backButton = new JButton("Back");
        backButton.setLayout(null);
        backButton.setBounds(20,350,100,50);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //cardLayout.show(mainPanel,"");
                cardLayout.show(mainPanel,"Initial");
            }
        });
        add(textName);
        add(textGender);
        add(textUser);
        add(textPassword);
        add(textAge);
        add(nameLabel);
        add(genderLabel);
        add(userLabel);
        add(passwordLabel);
        add(ageLabel);
        add(twitterLogoAccount);
        add(backButton);
        add(createButton);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(300, 300);
    }
}
class LogInPanel extends JPanel {
    JTextField userTextfield = new JTextField();
    JTextField passwordTextfield = new JTextField();
    JLabel usernameLabel = new JLabel("Username");
    JLabel passwordLabel = new JLabel("Password");
    JLabel loginLogo = new JLabel(new ImageIcon("c:/Users/jcoq2/IdeaProjects/Practica/phoneLogoMini.png"));
    JLabel logInLabel = new JLabel("Log In");

    public LogInPanel(CardLayout cardLayout, JPanel mainPanel) {
        setBackground(Color.BLACK);
        setLayout(null);
        userTextfield.setBounds(200, 130, 100, 25);
        passwordTextfield.setBounds(200, 220, 100, 25);
        usernameLabel.setBounds(100, 130, 100, 25);
        usernameLabel.setForeground(Color.WHITE);
        passwordLabel.setBounds(100, 220, 100, 25);
        passwordLabel.setForeground(Color.WHITE);
        loginLogo.setBounds(320, 140, 100, 95);
        logInLabel.setBounds(210, 50, 100, 25);
        logInLabel.setForeground(Color.WHITE);
        logInLabel.setFont(new Font("BritanicBold", Font.BOLD, 18));
        JButton logButton = new JButton("Log In");
        logButton.setLayout(null);
        logButton.setBounds(280, 330, 100, 50);

        JButton backButton = new JButton("Back");
        backButton.setLayout(null);
        backButton.setBounds(130, 330, 100, 50);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //cardLayout.show(mainPanel,"");
                cardLayout.show(mainPanel,"Initial");
            }
        });
        add(userTextfield);
        add(passwordTextfield);
        add(usernameLabel);
        add(passwordLabel);
        add(loginLogo);
        add(logInLabel);
        add(logButton);
        add(backButton);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(300, 300);
    }
}
