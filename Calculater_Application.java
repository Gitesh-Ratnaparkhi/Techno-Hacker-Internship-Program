
// Importing all important package
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculater_Application implements ActionListener {

    double num1 = 0, num2 = 0, result = 0;
    int calculation;

    JFrame frame = new JFrame("Calculator By Gitesh");
    JLabel label = new JLabel();
    JTextField textField = new JTextField();
    JRadioButton onRadioButton = new JRadioButton("On");
    JRadioButton offRadioButton = new JRadioButton("Off");
    JButton button_zero = new JButton("0");
    JButton button_one = new JButton("1");
    JButton button_two = new JButton("2");
    JButton button_three = new JButton("3");
    JButton button_four = new JButton("4");
    JButton button_five = new JButton("5");
    JButton button_six = new JButton("6");
    JButton button_seven = new JButton("7");
    JButton button_eigth = new JButton("8");
    JButton button_nine = new JButton("9");
    JButton button_dot = new JButton(".");
    JButton button_clear = new JButton("C");
    JButton button_Delete = new JButton("D");
    JButton button_Equal = new JButton("=");
    JButton button_Multiplication = new JButton("*");
    JButton button_Addition = new JButton("+");
    JButton button_subtraction = new JButton("-");
    JButton button_division = new JButton("/");
    JButton button_Square = new JButton("x\u00B2");
    JButton button_Reciprocal = new JButton("1/x");
    JButton button_SquareRoot = new JButton("x\u221A");

    // Class Constructor
    Calculater_Application() {
        Prepared_GUI();
        Add_Components();
        ActionListener_Event();

    }

    public void Prepared_GUI() {
        frame.setSize(305, 510);
        frame.getContentPane().setLayout(null); // Here we will set layout to null because we do not need that.
        frame.getContentPane().setBackground(Color.gray);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void Add_Components() {
        label.setBounds(250, 0, 50, 50);
        label.setForeground(Color.white);
        frame.add(label);
        textField.setBounds(10, 40, 270, 40);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

        // Now we will align all the button which we have created

        // On button
        onRadioButton.setBounds(10, 90, 60, 35);
        onRadioButton.setSelected(true);
        onRadioButton.setFont(new Font("Arial", Font.BOLD, 20));
        onRadioButton.setBackground(Color.black);
        onRadioButton.setForeground(Color.white);
        onRadioButton.setFocusable(false);
        frame.add(onRadioButton);

        // Off button
        offRadioButton.setBounds(10, 120, 60, 35);
        offRadioButton.setSelected(false);
        offRadioButton.setFont(new Font("Arial", Font.BOLD, 20));
        offRadioButton.setBackground(Color.black);
        offRadioButton.setForeground(Color.white);
        offRadioButton.setFocusable(false);
        frame.add(offRadioButton);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(onRadioButton);
        buttonGroup.add(offRadioButton);

        button_seven.setBounds(10, 230, 60, 40);
        button_seven.setFont(new Font("Arial", Font.BOLD, 20));
        button_seven.setFocusable(false);
        frame.add(button_seven);

        button_eigth.setBounds(80, 230, 60, 40);
        button_eigth.setFont(new Font("Arial", Font.BOLD, 20));
        button_eigth.setFocusable(false);
        frame.add(button_eigth);

        button_nine.setBounds(150, 230, 60, 40);
        button_nine.setFont(new Font("Arial", Font.BOLD, 20));
        button_nine.setFocusable(false);
        frame.add(button_nine);

        button_four.setBounds(10, 290, 60, 40);
        button_four.setFont(new Font("Arial", Font.BOLD, 20));
        button_four.setFocusable(false);
        frame.add(button_four);

        button_five.setBounds(80, 290, 60, 40);
        button_five.setFont(new Font("Arial", Font.BOLD, 20));
        button_five.setFocusable(false);
        frame.add(button_five);

        button_six.setBounds(150, 290, 60, 40);
        button_six.setFont(new Font("Arial", Font.BOLD, 20));
        button_six.setFocusable(false);
        frame.add(button_six);

        button_one.setBounds(10, 350, 60, 40);
        button_one.setFont(new Font("Arial", Font.BOLD, 20));
        button_one.setFocusable(false);
        frame.add(button_one);

        button_two.setBounds(80, 350, 60, 40);
        button_two.setFont(new Font("Arial", Font.BOLD, 20));
        button_two.setFocusable(false);
        frame.add(button_two);

        button_three.setBounds(150, 350, 60, 40);
        button_three.setFont(new Font("Arial", Font.BOLD, 20));
        button_three.setFocusable(false);
        frame.add(button_three);

        button_dot.setBounds(150, 410, 60, 40);
        button_dot.setFont(new Font("Arial", Font.BOLD, 20));
        button_dot.setFont(new Font("Arial", Font.BOLD, 20));
        button_dot.setFocusable(false);
        frame.add(button_dot);

        button_zero.setBounds(10, 410, 130, 40);
        button_zero.setFont(new Font("Arial", Font.BOLD, 20));
        button_zero.setFocusable(false);
        frame.add(button_zero);

        button_Equal.setBounds(220, 350, 60, 100);
        button_Equal.setFont(new Font("Arial", Font.BOLD, 20));
        button_Equal.setBackground(new Color(239, 188, 2));
        button_Equal.setFocusable(false);
        frame.add(button_Equal);

        button_division.setBounds(220, 110, 60, 40);
        button_division.setFont(new Font("Arial", Font.BOLD, 20));
        button_division.setBackground(new Color(239, 188, 2));
        button_division.setFocusable(false);
        frame.add(button_division);

        button_SquareRoot.setBounds(10, 170, 60, 40);
        button_SquareRoot.setFont(new Font("Arial", Font.BOLD, 20));
        button_SquareRoot.setBackground(new Color(239, 188, 2));
        button_SquareRoot.setFocusable(false);
        frame.add(button_SquareRoot);

        button_Multiplication.setBounds(220, 230, 60, 40);
        button_Multiplication.setFont(new Font("Arial", Font.BOLD, 20));
        button_Multiplication.setBackground(new Color(239, 188, 2));
        button_Multiplication.setFocusable(false);
        frame.add(button_Multiplication);

        button_subtraction.setBounds(220, 170, 60, 40);
        button_subtraction.setFont(new Font("Arial", Font.BOLD, 20));
        button_subtraction.setBackground(new Color(239, 188, 2));
        button_subtraction.setFocusable(false);
        frame.add(button_subtraction);

        button_Addition.setBounds(220, 290, 60, 40);
        button_Addition.setFont(new Font("Arial", Font.BOLD, 20));
        button_Addition.setBackground(new Color(239, 188, 2));
        button_Addition.setFocusable(false);
        frame.add(button_Addition);

        button_Square.setBounds(80, 170, 60, 40);
        button_Square.setFont(new Font("Arial", Font.BOLD, 20));
        button_Square.setBackground(new Color(239, 188, 2));
        button_Square.setFocusable(false);
        frame.add(button_Square);

        button_Reciprocal.setBounds(150, 170, 60, 40);
        button_Reciprocal.setFont(new Font("Arial", Font.BOLD, 20));
        button_Reciprocal.setBackground(new Color(239, 188, 2));
        button_Reciprocal.setFocusable(false);
        frame.add(button_Reciprocal);

        button_Delete.setBounds(150, 110, 60, 40);
        button_Delete.setFont(new Font("Arial", Font.BOLD, 20));
        button_Delete.setBackground(Color.red);
        button_Delete.setForeground(Color.white);
        button_Delete.setFocusable(false);
        frame.add(button_Delete);

        button_clear.setBounds(80, 110, 60, 40);
        button_clear.setFont(new Font("Arial", Font.BOLD, 20));
        button_clear.setBackground(Color.red);
        button_clear.setForeground(Color.white);
        button_clear.setFocusable(false);
        frame.add(button_clear);
    }

    public void ActionListener_Event() {
        onRadioButton.addActionListener(this);
        offRadioButton.addActionListener(this);
        button_nine.addActionListener(this);
        button_eigth.addActionListener(this);
        button_seven.addActionListener(this);
        button_six.addActionListener(this);
        button_five.addActionListener(this);
        button_four.addActionListener(this);
        button_three.addActionListener(this);
        button_two.addActionListener(this);
        button_one.addActionListener(this);
        button_zero.addActionListener(this);
        button_Addition.addActionListener(this);
        button_Delete.addActionListener(this);
        button_Equal.addActionListener(this);
        button_Multiplication.addActionListener(this);
        button_subtraction.addActionListener(this);
        button_division.addActionListener(this);
        button_Reciprocal.addActionListener(this);
        button_Square.addActionListener(this);
        button_SquareRoot.addActionListener(this);
        button_dot.addActionListener(this);
        button_clear.addActionListener(this);

    }

    public void Enabled() {
        onRadioButton.setEnabled(false);
        offRadioButton.setEnabled(true);
        button_nine.setEnabled(true);
        button_eigth.setEnabled(true);
        button_seven.setEnabled(true);
        button_six.setEnabled(true);
        button_five.setEnabled(true);
        button_four.setEnabled(true);
        button_three.setEnabled(true);
        button_two.setEnabled(true);
        button_one.setEnabled(true);
        button_zero.setEnabled(true);
        button_Addition.setEnabled(true);
        button_Delete.setEnabled(true);
        button_Equal.setEnabled(true);
        button_Multiplication.setEnabled(true);
        button_subtraction.setEnabled(true);
        button_division.setEnabled(true);
        button_Reciprocal.setEnabled(true);
        button_Square.setEnabled(true);
        button_SquareRoot.setEnabled(true);
        button_dot.setEnabled(true);
        button_clear.setEnabled(true);
    }

    public void Disable() {
        onRadioButton.setEnabled(true);
        offRadioButton.setEnabled(false);
        button_nine.setEnabled(false);
        button_eigth.setEnabled(false);
        button_seven.setEnabled(false);
        button_six.setEnabled(false);
        button_five.setEnabled(false);
        button_four.setEnabled(false);
        button_three.setEnabled(false);
        button_two.setEnabled(false);
        button_one.setEnabled(false);
        button_zero.setEnabled(false);
        button_Addition.setEnabled(false);
        button_Delete.setEnabled(false);
        button_Equal.setEnabled(false);
        button_Multiplication.setEnabled(false);
        button_subtraction.setEnabled(false);
        button_division.setEnabled(false);
        button_Reciprocal.setEnabled(false);
        button_Square.setEnabled(false);
        button_SquareRoot.setEnabled(false);
        button_dot.setEnabled(false);
        button_clear.setEnabled(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == onRadioButton) {
            Enabled();
        } else if (source == offRadioButton) {
            Disable();
        } else if (source == button_clear) {
            label.setText("");
            textField.setText("");
        } else if (source == button_Delete) {
            int len = textField.getText().length();
            int number = len - 1;
            if (len > 0) {
                StringBuilder str = new StringBuilder(textField.getText());
                str.deleteCharAt(number);
                textField.setText(str.toString());
            }
            if (textField.getText().endsWith("")) {
                label.setText("");
            }
        } else if (source == button_zero) {
            if (textField.getText().equals("0")) {
                return;
            } else {
                textField.setText(textField.getText() + "0");
            }
        } else if (source == button_one) {
            textField.setText(textField.getText() + "1");
        } else if (source == button_two) {
            textField.setText(textField.getText() + "2");
        } else if (source == button_three) {
            textField.setText(textField.getText() + "3");
        } else if (source == button_four) {
            textField.setText(textField.getText() + "4");
        } else if (source == button_five) {
            textField.setText(textField.getText() + "5");
        } else if (source == button_six) {
            textField.setText(textField.getText() + "6");
        } else if (source == button_seven) {
            textField.setText(textField.getText() + "7");
        } else if (source == button_eigth) {
            textField.setText(textField.getText() + "8");
        } else if (source == button_nine) {
            textField.setText(textField.getText() + "9");
        } else if (source == button_dot) {
            if (textField.getText().contains("."))
                return;
            else
                textField.setText(textField.getText() + ".");
        } else if (source == button_Addition) {
            String st = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 1;
            textField.setText("");
            label.setText(st + "+");
        } else if (source == button_subtraction) {
            String st = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 2;
            textField.setText("");
            label.setText(st + "-");
        } else if (source == button_Multiplication) {
            String st = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 3;
            textField.setText("");
            label.setText(st + "*");
        } else if (source == button_division) {
            String st = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 4;
            textField.setText("");
            label.setText(st + "/");
        } else if (source == button_Square) {
            num1 = Double.parseDouble(textField.getText());
            calculation = 5;
            double square = Math.pow(num1, 2);
            String st = Double.toString(square);
            if (st.endsWith(".0")) {
                textField.setText(st.replace(".0", ""));
            } else {
                textField.setText(st);
            }
        } else if (source == button_SquareRoot) {
            num1 = Double.parseDouble(textField.getText());
            Double sqrt = Math.sqrt(num1);
            textField.setText(Double.toString(sqrt));
        } else if (source == button_Reciprocal) {
            num1 = Double.parseDouble(textField.getText());
            Double reci = 1 / num1;
            String st = Double.toString(reci);
            if (st.endsWith(".0")) {
                textField.setText(st.replace(".0", ""));
            } else {
                textField.setText(st);
            }
        } else if (source == button_Equal) {
            num2 = Double.parseDouble(textField.getText());
            switch (calculation) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    result = num1 / num2;
                    break;
            }
            if (Double.toString(result).endsWith(".0")) {
                textField.setText(Double.toString(result).replace(".0", ""));
            } else {
                textField.setText(Double.toString(result));
            }
            label.setText("");
            num1 = result;
        }

    }

    public static void main(String[] args) {
        Calculater_Application calculator = new Calculater_Application();
    }

}