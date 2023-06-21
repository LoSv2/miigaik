import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Game extends JFrame {
    private JTextField txtGuess;
    private JLabel lblOutput;
    private int theNumber;
    public void checkGuess() {
        String guessText = txtGuess.getText();
        String message = "";
        try {
            int guess = Integer.parseInt(guessText);
            if (guess < theNumber) {
                message = guess + " is too low. Try again.";
            }
            if (guess > theNumber) {
                message = guess + " is too high. Try again.";
            }
            if (guess == theNumber) {
                message = guess + " is correct. You win after " + " tryes! Let's play again!" ;
                newGame();
            }
        } catch (Exception e) {
            message = "Enter a whole number between 1 and 100.";
        }
        lblOutput.setText(message);
        txtGuess.requestFocus();
        txtGuess.selectAll();
    }
    public void newGame() {
        theNumber = (int)(Math.random() * 100 + 1);
    }
    public Game() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Artyom High-Low Guessing Game");
        getContentPane().setLayout(null);
        JLabel lblNewLabel = new JLabel("Artyom High-Low Guessing Game");
        lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(0, 11, 434, 21);
        getContentPane().add(lblNewLabel);
        JLabel lblNewLabel_1 = new JLabel("Guess a number between 1 and 100:");
        lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setBounds(17, 53, 297, 34);
        getContentPane().add(lblNewLabel_1);
        txtGuess = new JTextField();
        txtGuess.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                checkGuess();
            }
        });
        txtGuess.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
        txtGuess.setBounds(331, 55, 86, 31);
        getContentPane().add(txtGuess);
        txtGuess.setColumns(10);

        JButton btnGuess = new JButton("Guess!");
        btnGuess.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                checkGuess();
            }
        });
        btnGuess.setForeground(new Color(0, 0, 0));
        btnGuess.setBackground(new Color(255, 255, 255));
        btnGuess.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
        btnGuess.setBounds(166, 98, 102, 34);
        getContentPane().add(btnGuess);

        lblOutput = new JLabel("Enter a number above and click Guess!");
        lblOutput.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
        lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
        lblOutput.setBounds(0, 170, 434, 57);
        getContentPane().add(lblOutput);
    }
    public static void main(String[] args) {
        Game theGame = new Game();
        theGame.newGame();
        theGame.setSize(new Dimension(450,300));
        theGame.setVisible(true);
    }
}
