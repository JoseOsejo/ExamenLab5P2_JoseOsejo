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
    JRadioButton tipoAdmin = new JRadioButton("Administrador");
    JRadioButton tipoComprador = new JRadioButton("Comprador");
    JRadioButton tipoVendedor = new JRadioButton("Vendedor");
    ButtonGroup buttonGroup = new ButtonGroup();
    JTextField textName= new JTextField();
    JTextField textCuentaBancaria= new JTextField();
    JTextField textUser= new JTextField();
    JTextField textPassword= new JTextField();
    JTextField textAge= new JTextField();
    JTextField textPersonajeFav= new JTextField();
    JLabel personajeFavLabel = new JLabel("Personaje Favorito");
    JLabel nameLabel = new JLabel("Name");
    JLabel cuentaBancariaLabel = new JLabel("Cuenta Bancaria");
    JLabel userLabel = new JLabel("Username");
    JLabel passwordLabel = new JLabel("Password");
    JLabel ageLabel = new JLabel("Age");
    //JLabel nintendoLogoAccount = new JLabel(new ImageIcon("C:/Users/jcoq2/IdeaProjects/ExamenLab5P2_JoseOsejo/logo4.png"));
    public CreateAccountPanel(CardLayout cardLayout, JPanel mainPanel)
    {
        setBackground(Color.BLACK);
        setLayout(null);
        textPersonajeFav.setBounds(300,270,100,25);
        textName.setBounds(130,80,100,25);
        textCuentaBancaria.setBounds(300,230,100,25);
        textUser.setBounds(400,80,100,25);
        textPassword.setBounds(400,130,100,25);
        textAge.setBounds(130,130,100,25);
        personajeFavLabel.setBounds(130,270,200,25);
        personajeFavLabel.setFont(new Font("TimesRoman",Font.ITALIC,18));
        personajeFavLabel.setForeground(Color.WHITE);
        nameLabel.setBounds(70,80,100,25);
        nameLabel.setFont(new Font("TimesRoman",Font.ITALIC,18));
        nameLabel.setForeground(Color.WHITE);
        cuentaBancariaLabel.setBounds(140,230,200,25);
        cuentaBancariaLabel.setFont(new Font("TimesRoman",Font.ITALIC,18));
        cuentaBancariaLabel.setForeground(Color.WHITE);
        userLabel.setBounds(300,80,100,25);
        userLabel.setFont(new Font("TimesRoman",Font.ITALIC,18));
        userLabel.setForeground(Color.WHITE);
        passwordLabel.setBounds(300,130,100,25);
        passwordLabel.setFont(new Font("TimesRoman",Font.ITALIC,18));
        passwordLabel.setForeground(Color.WHITE);
        ageLabel.setBounds(70,130,100,25);
        ageLabel.setFont(new Font("TimesRoman",Font.ITALIC,18));
        ageLabel.setForeground(Color.WHITE);
        tipoAdmin.setBounds(200,330,300,50);
        tipoComprador.setBounds(200,340,300,50);
        tipoVendedor.setBounds(200,350,300,50);
        buttonGroup.add(tipoAdmin);buttonGroup.add(tipoComprador);buttonGroup.add(tipoVendedor);
        tipoAdmin.setBackground(Color.BLACK);
        tipoVendedor.setBackground(Color.BLACK);
        tipoComprador.setBackground(Color.BLACK);
        tipoAdmin.setForeground(Color.WHITE);
        tipoComprador.setForeground(Color.WHITE);
        tipoVendedor.setForeground(Color.WHITE);
        // nintendoLogoAccount.setBounds(250,60,300,300);
        JButton createButton = new JButton("Create");
        createButton.setLayout(null);
        createButton.setBounds(320,480,100,50);
        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //cardLayout.show(mainPanel,"");

            }
        });
        JButton backButton = new JButton("Back");
        backButton.setLayout(null);
        backButton.setBounds(170,480,100,50);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //cardLayout.show(mainPanel,"");
                cardLayout.show(mainPanel,"Initial");
            }
        });
        add(personajeFavLabel);
        add(textPersonajeFav);
        add(textName);
        add(textCuentaBancaria);
        add(textUser);
        add(textPassword);
        add(textAge);
        add(nameLabel);
        add(cuentaBancariaLabel);
        add(userLabel);
        add(passwordLabel);
        add(ageLabel);
        add(tipoAdmin);add(tipoComprador);add(tipoVendedor);

        // add(nintendoLogoAccount);
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
