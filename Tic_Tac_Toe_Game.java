import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Tic_Tac_Toe_Game {
    static int BorderWidth = 700;
    static int BorderHeight = 750;
    static JFrame frame = new JFrame("Welcome to Tic-Tac-Toe made by Gitesh");
    static JLabel textLabel = new JLabel();
    static JPanel panel = new JPanel();
    static JPanel boardPanel = new JPanel();
    static JButton board[][] = new JButton[3][3];
    static String playerX = "X";
    static String playerO = "O";
    static String Curr_player = playerX;
    static boolean game_over = false;
    static int Turns = 0;

    public Tic_Tac_Toe_Game() {
        GUI_Create();
        AddComponents();
    }

    private static void GUI_Create() {
        frame.setSize(BorderWidth, BorderHeight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
    }

    private static void AddComponents() {
        textLabel.setBackground(Color.black);
        textLabel.setForeground(Color.white);
        textLabel.setFont(new Font("Arial", Font.BOLD, 50));
        textLabel.setHorizontalAlignment(JLabel.CENTER);
        textLabel.setText("Welcome to Tic-Tac-Toe");
        textLabel.setOpaque(true);

        panel.setLayout(new BorderLayout());
        panel.add(textLabel);
        frame.add(panel, BorderLayout.NORTH);

        boardPanel.setLayout(new GridLayout(3, 3));
        boardPanel.setBackground(Color.black);
        frame.add(boardPanel);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JButton title = new JButton();
                board[i][j] = title;
                boardPanel.add(title);
                title.setBackground(Color.darkGray);
                title.setForeground(Color.WHITE);
                title.setFont(new Font("Arial", Font.BOLD, 120));
                title.setFocusable(false);

                title.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JButton tile = (JButton) e.getSource();
                        if (!game_over && tile.getText().equals("")) {
                            tile.setText(Curr_player);
                            Turns++;
                            check_Winner();
                            if (!game_over) {
                                Curr_player = Curr_player == playerX ? playerO : playerX;
                                textLabel.setText(Curr_player + "'s Turn");
                            }
                        }
                        
                    }
                });
            }
        }
    }

    private static void check_Winner() {
        // Check Rows
        for (int i = 0; i < 3; i++) {
            if (!board[i][0].getText().equals("") &&
                board[i][0].getText() == board[i][1].getText() &&
                board[i][1].getText() == board[i][2].getText()) {
                for (int j = 0; j < 3; j++) {
                    setWinner(board[i][j]);
                }
                game_over = true;
                return;
            }
        }

        // Check Columns
        for (int i = 0; i < 3; i++) {
            if (!board[0][i].getText().equals("") &&
                board[0][i].getText() == board[1][i].getText() &&
                board[1][i].getText() == board[2][i].getText()) {
                for (int j = 0; j < 3; j++) {
                    setWinner(board[j][i]);
                }
                game_over = true;
                return;
            }
        }

        // Check Diagonals
        if (!board[0][0].getText().equals("") &&
            board[0][0].getText() == board[1][1].getText() &&
            board[1][1].getText() == board[2][2].getText()) {
            for (int j = 0; j < 3; j++) {
                setWinner(board[j][j]);
            }
            game_over = true;
            return;
        }

        // Anti Diagonals
        if (board[0][2].getText() == board[1][1].getText() &&
            board[1][1].getText() == board[2][0].getText() &&
            board[0][2].getText() != "") {
            setWinner(board[0][2]);
            setWinner(board[1][1]);
            setWinner(board[2][0]);
            game_over = true;
            return;
        }

        if (Turns == 9) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    setTie(board[i][j]);
                }
            }
            game_over = true;
        }
    }

    private static void setTie(JButton tile) {
        tile.setForeground(Color.red);
        tile.setBackground(Color.black);
        textLabel.setText("DRAW");
    }

    private static void setWinner(JButton tile) {
        tile.setForeground(Color.green);
        tile.setBackground(Color.gray);
        if (Curr_player == playerX) {
            textLabel.setText("Player X has won");
        } else {
            textLabel.setText("Player O has won");
        }
    }

    public static void main(String[] args) {
        Tic_Tac_Toe_Game game = new Tic_Tac_Toe_Game();
    }
}
