import javax.swing.*;

public class Login {

    String username, password;
    JFrame LoginFrame;
    JButton Login, Cancel;
    JPasswordField Password;
    JTextField Username;
    JLabel usernameLabel, passwordLabel;

    Login(){
        password = null;
        username = null;

        ComponentCreation();
        frameCreation();

    }

    private void ComponentCreation(){
        Login = new JButton();
        Cancel = new JButton();
        Username = new JTextField();
        Password = new JPasswordField();
        usernameLabel = new JLabel();
        passwordLabel = new JLabel();

        usernameLabel.setText("Username");
        usernameLabel.setBounds(50,300, 100, 40);
        passwordLabel.setText("Password");
        passwordLabel.setBounds(50,360,100,40);

        Username.setBounds(160, 300, 200, 40);
        Password.setBounds(160, 360, 200, 40);

        Login.setBounds(50, 550, 100, 50);
        Login.setText("Login");
        GetData();

        Cancel.setBounds(150, 550, 100, 50);
        Cancel.setText("Cancel");
    }
    private void GetData(){
        Login.addActionListener(e -> {
            username = Username.getText();
            password = String.valueOf(Password.getPassword());
        });
    }

    private void frameCreation(){
        LoginFrame = new JFrame();
        LoginFrame.add(Login);
        LoginFrame.add(Cancel);
        LoginFrame.add(Username);
        LoginFrame.add(Password);
        LoginFrame.add(usernameLabel);
        LoginFrame.add(passwordLabel);
        LoginFrame.setSize(500, 700);
        LoginFrame.setLayout(null);
        LoginFrame.setVisible(true);
    }




}

