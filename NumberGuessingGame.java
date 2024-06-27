import javax.swing.*;
import javax.swing.border.AbstractBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class NumberGuessingGame extends JFrame {

    // diclaring labels and textfield
    JFrame frame = new JFrame("Number Guessing Game By Gitesh");
    JTextField textField = new JTextField();
    JLabel welcomeLabel = new JLabel("Welcome to the Number Guessing Game!");
    JLabel instructionLabel = new JLabel("I am thinking of a number between 1 and 100.");
    JButton guess = new JButton("Guess");
    JLabel MainLabel = new JLabel("You have 6 attempts to guess the number.");

    // declaring variables
    private int R_Number;
    private int attempts;

    // Constructor
    public NumberGuessingGame() {
        CreateGUI2();
        Add_Components();
    }

    // This metheod create the external box or frame 
    public void CreateGUI2() {
        frame.setSize(500, 350);
        frame.getContentPane().setLayout(null); // Set layout to null
        frame.getContentPane().setBackground(Color.white);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // This method add all the components
    // In this method there are numberical values for ex "welcomeLabel.setBounds(10, 20, 465, 40);" here 10 is x-axis, 20 is y-axis, 465 is width and 40 is height
    public void Add_Components() {
        NumberGuessingGame.RoundedBorder roundedBorder = new RoundedBorder(10);
        
        welcomeLabel.setBounds(10, 20, 465, 40);
        welcomeLabel.setBackground(Color.white);
        welcomeLabel.setForeground(Color.BLACK);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        welcomeLabel.setBorder(roundedBorder);
        frame.add(welcomeLabel);

        instructionLabel.setBounds(10, 70, 465, 40);
        instructionLabel.setBackground(Color.white);
        instructionLabel.setForeground(Color.BLACK);
        instructionLabel.setFont(new Font("Arial", Font.BOLD, 20));
        instructionLabel.setHorizontalAlignment(SwingConstants.CENTER);
        instructionLabel.setBorder(roundedBorder);
        frame.add(instructionLabel);

        textField.setBounds(10, 120, 465, 40);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        textField.setBorder(roundedBorder);
        frame.add(textField);

        guess.setBounds(185, 170, 130, 40);
        guess.setBackground(Color.red);
        guess.setFont(new Font("Arial", Font.BOLD, 20));
        guess.setFocusable(false);
        frame.add(guess);

        MainLabel.setBounds(10, 220, 465, 40);
        MainLabel.setBackground(Color.white);
        MainLabel.setForeground(Color.BLACK);
        MainLabel.setFont(new Font("Arial", Font.BOLD, 20));
        MainLabel.setHorizontalAlignment(SwingConstants.CENTER);
        MainLabel.setBorder(roundedBorder);
        frame.add(MainLabel);
        
        // Add action listener
        guess.addActionListener(new GuessButtonListener());
        resetGame();
    }

    // This method reset the game
    private void resetGame() {
        R_Number = getRandomNumber(1, 100);
        attempts = 6;
        MainLabel.setText("You have 6 attempts to guess the number.");
    }

    // This method generate random number
    // We will inbuild method to generate random number
    private int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    // Add action listener
    private class GuessButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String userInput = textField.getText();
            try {
                int userGuess = Integer.parseInt(userInput);
                attempts--;

                // This are the condition for the game and give user a hint about guess
                if (userGuess == R_Number) {
                    MainLabel.setText("Congratulations! You guessed the number!");
                } else if (attempts == 0) {
                    MainLabel.setText("Nope! The number was " + R_Number);
                } else if (userGuess < R_Number) {
                    MainLabel.setText("Your guess is too low. Attempts left: " + attempts);
                } else {
                    MainLabel.setText("Your guess is too high. Attempts left: " + attempts);
                }
            } catch (NumberFormatException ex) {
                MainLabel.setText("Please enter a valid number.");
            }
        }
    }

    // Rounded Border
    // I have used this class to give borders
    private static class RoundedBorder extends AbstractBorder {
        private int radius;

        RoundedBorder(int radius) {
            this.radius = radius;
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
        }

        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(radius + 1, radius + 1, radius + 1, radius + 1);
        }

        @Override
        public Insets getBorderInsets(Component c, Insets insets) {
            insets.left = insets.top = insets.right = insets.bottom = radius + 1;
            return insets;
        }
    }

    public static void main(String[] args) {
        // Creating object of class NumberGuessingGame
        NumberGuessingGame game = new NumberGuessingGame();
        game.setVisible(true);
    }
}
