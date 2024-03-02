import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class math extends JFrame implements ActionListener {
    math() {
        super("MathOperators by Berkay ÖCER / 2103013260");
        setSize(460, 200);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        addComponents();
        JOptionPane.showMessageDialog(null, "Welcome to my MathOperator. " +
                "For math please enter your nums empty to areas! Lets Math! ", "Disclamer", JOptionPane.INFORMATION_MESSAGE);
    }

    Random rnd = new Random();
    private JTextField num1;
    private JTextField num2;
    private JTextField result;
    private JLabel operator1, operator2;
    private JButton btn;
    String[] operators = new String[]{"+", "-", "/", "x"};


    private void addComponents() {
        num1 = new JTextField();
        num1.setBounds(10, 10, 100, 50);
        num1.setFont(new Font("Dialog", Font.PLAIN, 24));
        num1.setHorizontalAlignment(SwingConstants.CENTER);
        add(num1);

        operator1 = new JLabel("?");
        operator1.setBounds(120, 10, 50, 50);
        operator1.setFont(new Font("Dialog", Font.BOLD, 24));
        operator1.setHorizontalAlignment(SwingConstants.CENTER);
        add(operator1);

        num2 = new JTextField();
        num2.setBounds(180, 10, 100, 50);
        num2.setFont(new Font("Dialog", Font.PLAIN, 24));
        num2.setHorizontalAlignment(SwingConstants.CENTER);
        add(num2);

        operator2 = new JLabel("=");
        operator2.setBounds(290, 10, 50, 50);
        operator2.setFont(new Font("Dialog", Font.BOLD, 24));
        operator2.setHorizontalAlignment(SwingConstants.CENTER);
        add(operator2);

        result = new JTextField("0");
        result.setBounds(350, 10, 100, 50);
        result.setFont(new Font("Dialog", Font.PLAIN, 24));
        result.setHorizontalAlignment(SwingConstants.CENTER);
        result.setFocusable(false);
        add(result);


        btn = new JButton("Math!");
        btn.setBounds(10, 75, 440, 50);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(btn);
        btn.addActionListener(this);


        // my signature / imzam :)
        JLabel imza = new JLabel("made by Berkay ÖCER / 2103013260");
        imza.setFont(new Font("Serif", Font.BOLD, 16));
        imza.setBounds(100, 130, 270, 30);
        add(imza);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            operator1.setText(operators[rnd.nextInt(operators.length)]);
            switch (operator1.getText()) {
                case "+":
                    result.setText(String.valueOf(Integer.parseInt(num1.getText()) + Integer.parseInt(num2.getText())));
                    break;
                case "-":
                    result.setText(String.valueOf(Integer.parseInt(num1.getText()) - Integer.parseInt(num2.getText())));
                    break;
                case "/":
                    result.setText(String.valueOf(Integer.parseInt(num1.getText()) / Integer.parseInt(num2.getText())));
                    break;
                case "x":
                    result.setText(String.valueOf(Integer.parseInt(num1.getText()) * Integer.parseInt(num2.getText())));
                    break;
            }
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }


}
