import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;

public class NewCalculator extends JFrame {

    private final ButtonGroup buttonGroup = new ButtonGroup();

    private JPanel contentPane;
    private JTextField textField;

    private JButton Button_0;
    private JButton Button_1;
    private JButton Button_2;
    private JButton Button_3;
    private JButton Button_4;
    private JButton Button_5;
    private JButton Button_6;
    private JButton Button_7;
    private JButton Button_8;
    private JButton Button_9;

    private JButton Button_dot;
    private JButton Button_Addition;
    private JButton Button_Subtraction;
    private JButton Button_Mutiplication;
    private JButton Button_Division;
    private JButton Button_Equal;

    private JButton Button_Sin;
    private JButton Button_Cos;
    private JButton Button_Tan;

    private JButton Button_Factorial;
    private JButton Button_Log;
    private JButton Button_Power;
    private JButton Button_Square;
    private JButton Button_Sqrt;

    private JButton Button_Delete;
    private JButton Button_Clear;
    private JButton Button_Exit;

    private JButton Button_SBracket;
    private JButton Button_EBracket;

    JRadioButton rdbtn_OFF;
    JRadioButton rdbtn_ON;

    double num1, num2, result;
    double num, ans;
    char operator;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    NewCalculator frame = new NewCalculator();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public NewCalculator() {
        setVisible(true);
        setResizable(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\HP\\Downloads\\Capture.PNG"));
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 100, 384, 487);
        contentPane = new JPanel();
        contentPane.setToolTipText("\"Developed by: ABDUL WAHAB");
        contentPane.setBackground(new Color(172, 170, 255));
        contentPane.setBorder(new EmptyBorder(6, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel ButtonsPanel = new JPanel();
        ButtonsPanel.setBounds(25, 115, 315, 303);
        ButtonsPanel.setBackground(SystemColor.inactiveCaptionBorder);

        contentPane.add(ButtonsPanel);
        ButtonsPanel.setLayout(null);

        textField = new JTextField();
        textField.setEditable(false);
        textField.setBounds(10, 25, 350, 68);
        contentPane.add(textField);
        textField.setToolTipText("Always SMILE because SMILE is the beauty of Face");
        textField.setBackground(SystemColor.control);
        textField.setForeground(Color.black);
        textField.setFont(new Font("Times New Roman", Font.PLAIN, 38));
        textField.setColumns(10);

        Button_0 = new JButton("0");
        Button_0.setBackground(new Color(220, 220, 220));
        Button_0.setToolTipText("ZERO");
        Button_0.setFocusable(false);
        Button_0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "0");
            }
        });
        Button_0.setFont(new Font("Verdana", Font.PLAIN, 17));
        Button_0.setBounds(126, 251, 62, 49);
        ButtonsPanel.add(Button_0);

        Button_1 = new JButton("1");
        Button_1.setBackground(new Color(220, 220, 220));
        Button_1.setToolTipText("Developed by: ABDUL WAHAB & HASSAN AKBAR");
        Button_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                textField.setText(textField.getText() + "1");

            }
        });

        Button_1.setFont(new Font("Verdana", Font.PLAIN, 17));
        Button_1.setBounds(63, 201, 62, 49);
        ButtonsPanel.add(Button_1);

        Button_2 = new JButton("2");
        Button_2.setBackground(new Color(220, 220, 220));
        Button_2.setToolTipText("Developed by: ABDUL WAHAB & HASSAN AKBAR");
        Button_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "2");
            }
        });
        Button_2.setFont(new Font("Verdana", Font.PLAIN, 17));
        Button_2.setBounds(126, 201, 62, 49);
        ButtonsPanel.add(Button_2);

        Button_3 = new JButton("3");
        Button_3.setBackground(new Color(220, 220, 220));
        Button_3.setToolTipText("Developed by: ABDUL WAHAB & HASSAN AKBAR"); // Button_Addition
        Button_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "3");
            }
        });
        Button_3.setFont(new Font("Verdana", Font.PLAIN, 17));
        Button_3.setBounds(189, 201, 62, 49);
        ButtonsPanel.add(Button_3);

        Button_4 = new JButton("4");
        Button_4.setBackground(new Color(220, 220, 220));
        Button_4.setToolTipText("Developed by: ABDUL WAHAB & HASSAN AKBAR");
        Button_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "4");
            }
        });
        Button_4.setFont(new Font("Verdana", Font.PLAIN, 17));
        Button_4.setBounds(63, 151, 62, 49);
        ButtonsPanel.add(Button_4);

        Button_5 = new JButton("5");
        Button_5.setBackground(new Color(220, 220, 220));
        Button_5.setToolTipText("Developed by: ABDUL WAHAB & HASSAN AKBAR");
        Button_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "5");
            }
        });
        Button_5.setFont(new Font("Verdana", Font.PLAIN, 17));
        Button_5.setBounds(126, 151, 62, 49);
        ButtonsPanel.add(Button_5);

        Button_6 = new JButton("6");
        Button_6.setBackground(new Color(220, 220, 220)); // Button_Subtraction
        Button_6.setToolTipText("Developed by: ABDUL WAHAB & HASSAN AKBAR");
        Button_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "6");
            }
        });
        Button_6.setFont(new Font("Verdana", Font.PLAIN, 17));
        Button_6.setBounds(189, 151, 62, 49);
        ButtonsPanel.add(Button_6);

        Button_7 = new JButton("7");
        Button_7.setToolTipText("Developed by: ABDUL WAHAB & HASSAN AKBAR");
        Button_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "7");
            }
        });
        Button_7.setFont(new Font("Verdana", Font.PLAIN, 17));
        Button_7.setBounds(63, 101, 62, 49);
        Button_7.setBackground(new Color(220, 220, 220));
        ButtonsPanel.add(Button_7);

        Button_8 = new JButton("8");
        Button_8.setBackground(new Color(220, 220, 220));
        Button_8.setToolTipText("Developed by: ABDUL WAHAB & HASSAN AKBAR");
        Button_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "8");
            }
        });
        Button_8.setFont(new Font("Verdana", Font.PLAIN, 17));
        Button_8.setBounds(126, 101, 62, 49);
        ButtonsPanel.add(Button_8);

        Button_9 = new JButton("9");
        Button_9.setBackground(new Color(220, 220, 220));
        Button_9.setToolTipText("Developed by: ABDUL WAHAB & HASSAN AKBAR"); // Button_Mutiplication
        Button_9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "9");
            }
        });
        Button_9.setFont(new Font("Verdana", Font.PLAIN, 17));
        Button_9.setBounds(189, 101, 62, 49);
        ButtonsPanel.add(Button_9);

        Button_dot = new JButton(".");
        Button_dot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + ".");
            }
        });
        Button_dot.setFocusable(true);
        Button_dot.setToolTipText("Decimal Point");
        Button_dot.setFont(new Font("Verdana", Font.PLAIN, 17));
        Button_dot.setBounds(189, 251, 62, 49);
        ButtonsPanel.add(Button_dot);

        Button_Addition = new JButton("+");
        Button_Addition.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "+");
            }
        });
        Button_Addition.setToolTipText("Addition Operation");
        Button_Addition.setFont(new Font("Verdana", Font.PLAIN, 17));
        Button_Addition.setBounds(252, 201, 62, 49);
        ButtonsPanel.add(Button_Addition);

        Button_Subtraction = new JButton("-");
        Button_Subtraction.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "-");
            }
        });
        Button_Subtraction.setToolTipText("Subtraction Operation");
        Button_Subtraction.setFont(new Font("Verdana", Font.PLAIN, 20));
        Button_Subtraction.setBounds(252, 151, 62, 49);
        ButtonsPanel.add(Button_Subtraction);

        Button_Mutiplication = new JButton("x");
        Button_Mutiplication.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "*");
            }
        });
        Button_Mutiplication.setToolTipText("Multiplication Operation");
        Button_Mutiplication.setFont(new Font("Verdana", Font.PLAIN, 17));
        Button_Mutiplication.setBounds(252, 101, 62, 49);
        ButtonsPanel.add(Button_Mutiplication);

        Button_Division = new JButton("<html><body><span>÷</span></body></html>");
        Button_Division.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "/");
            }
        });
        Button_Division.setToolTipText("Division Operation");
        Button_Division.setFont(new Font("Verdana", Font.PLAIN, 17));
        Button_Division.setBounds(252, 51, 62, 49);
        ButtonsPanel.add(Button_Division);

        Button_Equal = new JButton("=");
        Button_Equal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();
                String output = evaluate(input);
                textField.setText(output);
            }
        });
        Button_Equal.setToolTipText("Equal To");
        Button_Equal.setFont(new Font("Verdana", Font.PLAIN, 18));
        Button_Equal.setFocusable(true);
        Button_Equal.setBounds(252, 251, 62, 49);
        ButtonsPanel.add(Button_Equal);

        Button_Factorial = new JButton("!");
        Button_Factorial.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "!");
            }
        });
        Button_Factorial.setToolTipText("Factorial of Number");

        Button_Factorial.setFont(new Font("Verdana", Font.PLAIN, 17));
        Button_Factorial.setBounds(189, 51, 62, 49);
        ButtonsPanel.add(Button_Factorial);

        Button_Sin = new JButton("Sin");
        Button_Sin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "sin");
            }
        });
        Button_Sin.setToolTipText("Sin Function");
        Button_Sin.setFont(new Font("Verdana", Font.PLAIN, 15));
        Button_Sin.setBounds(1, 101, 62, 49);
        ButtonsPanel.add(Button_Sin);

        Button_Cos = new JButton("Cos");
        Button_Cos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "cos");
            }
        });
        Button_Cos.setToolTipText("Cos Function");
        Button_Cos.setFont(new Font("Verdana", Font.PLAIN, 15));
        Button_Cos.setBounds(1, 151, 62, 49);
        ButtonsPanel.add(Button_Cos);

        Button_Tan = new JButton("Tan");
        Button_Tan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "tan");
            }
        });
        Button_Tan.setToolTipText("Tan Function");
        Button_Tan.setFont(new Font("Verdana", Font.PLAIN, 14));
        Button_Tan.setBounds(1, 201, 62, 49);
        ButtonsPanel.add(Button_Tan);

        Button_Log = new JButton("log");
        Button_Log.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "log");
            }
        });
        Button_Log.setToolTipText("Log Function");
        Button_Log.setFont(new Font("Verdana", Font.PLAIN, 17));
        Button_Log.setBounds(1, 51, 62, 49);
        ButtonsPanel.add(Button_Log);

        Button_Power = new JButton("^");
        Button_Power.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "^");
            }
        });
        Button_Power.setToolTipText("Power Function");
        Button_Power.setFont(new Font("Verdana", Font.PLAIN, 15));
        Button_Power.setBounds(63, 251, 62, 49);
        ButtonsPanel.add(Button_Power);

        Button_Square = new JButton("<html><body><span>X<sup>2</sup></span></body></html>");
        Button_Square.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "^2");
            }
        });
        Button_Square.setToolTipText("Square of Number");
        Button_Square.setFont(new Font("Verdana", Font.PLAIN, 15));
        Button_Square.setBounds(1, 251, 62, 49);
        ButtonsPanel.add(Button_Square);

        Button_Sqrt = new JButton("<html><body><span>√</span></body></html>");
        Button_Sqrt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "√");
            }
        });
        Button_Sqrt.setToolTipText("SquareRoot of Number");
        Button_Sqrt.setFont(new Font("Verdana", Font.PLAIN, 15));
        Button_Sqrt.setBounds(126, 1, 62, 49);
        ButtonsPanel.add(Button_Sqrt);

        // DEL BUTTON WORKING STARTS HERE............

        Button_Delete = new JButton("DEL");
        Button_Delete.setToolTipText("Delete the digit");
        Button_Delete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int length = textField.getText().length();
                int number = textField.getText().length() - 1;
                String store;

                if (length > 0) {
                    StringBuilder back = new StringBuilder(textField.getText());
                    back.deleteCharAt(number);
                    store = back.toString();
                    textField.setText(store);
                }
            }
        });
        Button_Delete.setFont(new Font("Verdana", Font.PLAIN, 14));
        Button_Delete.setBounds(189, 1, 62, 49);
        ButtonsPanel.add(Button_Delete);

        // DEL BUTTON WORKING ENDS HERE............

        Button_Clear = new JButton("AC"); // CLear button working
        Button_Clear.setToolTipText("Clear the Calculator");
        Button_Clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(null);
            }
        });

        Button_Clear.setFont(new Font("Verdana", Font.PLAIN, 15));
        Button_Clear.setBounds(252, 1, 62, 49);
        ButtonsPanel.add(Button_Clear);

        Button_Exit = new JButton("EXIT"); // Exit button
        Button_Exit.setToolTipText("Exit the Calculator");
        Button_Exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        Button_Exit.setFont(new Font("Verdana", Font.PLAIN, 12));
        Button_Exit.setBounds(63, 1, 62, 49);
        ButtonsPanel.add(Button_Exit);

        Button_SBracket = new JButton("(");
        Button_SBracket.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "(");
            }
        });
        Button_SBracket.setToolTipText("Left Parenthesis ");
        Button_SBracket.setFont(new Font("Verdana", Font.PLAIN, 17));
        Button_SBracket.setBounds(63, 51, 62, 49);
        ButtonsPanel.add(Button_SBracket);

        Button_EBracket = new JButton(")");
        Button_EBracket.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + ")");
            }
        });
        Button_EBracket.setToolTipText("Right Parenthesis");
        Button_EBracket.setFont(new Font("Verdana", Font.PLAIN, 17));
        Button_EBracket.setBounds(126, 51, 62, 49);
        ButtonsPanel.add(Button_EBracket);

        rdbtn_ON = new JRadioButton("ON");
        rdbtn_ON.setBackground(new Color(255, 255, 0));
        rdbtn_ON.setToolTipText("Turn ON the Calculator");
        rdbtn_ON.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                enable1();
            }
        });
        buttonGroup.add(rdbtn_ON);
        rdbtn_ON.setSelected(true);
        rdbtn_ON.setForeground(UIManager.getColor("Button.foreground"));
        rdbtn_ON.setFont(new Font("Times New Roman", Font.BOLD, 15));
        rdbtn_ON.setBounds(1, 26, 62, 24);
        ButtonsPanel.add(rdbtn_ON);

        rdbtn_OFF = new JRadioButton("OFF");
        rdbtn_OFF.setToolTipText("Turn OFF the Calculator");
        rdbtn_OFF.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                disabl();
                textField.setText(null);
            }
        });
        buttonGroup.add(rdbtn_OFF);
        rdbtn_OFF.setBackground(new Color(255, 255, 0));
        rdbtn_OFF.setFont(new Font("Times New Roman", Font.BOLD, 15));
        rdbtn_OFF.setBounds(1, 1, 62, 24);
        ButtonsPanel.add(rdbtn_OFF);

    }

    // OFF BUTTON WORKING STARTS HERE..........<<<

    private void disabl() {

        textField.setEnabled(false);

        Button_0.setEnabled(false);
        Button_1.setEnabled(false);
        Button_2.setEnabled(false);
        Button_3.setEnabled(false);
        Button_4.setEnabled(false);
        Button_5.setEnabled(false);
        Button_6.setEnabled(false);
        Button_7.setEnabled(false);
        Button_8.setEnabled(false);
        Button_9.setEnabled(false);

        Button_dot.setEnabled(false);
        Button_Addition.setEnabled(false);
        Button_Subtraction.setEnabled(false);
        Button_Mutiplication.setEnabled(false);
        Button_Division.setEnabled(false);
        Button_Equal.setEnabled(false);

        Button_Sin.setEnabled(false);
        Button_Cos.setEnabled(false);
        Button_Tan.setEnabled(false);

        Button_Factorial.setEnabled(false);
        Button_Log.setEnabled(false);
        Button_Power.setEnabled(false);
        Button_Square.setEnabled(false);
        Button_Sqrt.setEnabled(false);

        Button_Delete.setEnabled(false);
        Button_Clear.setEnabled(false);

        Button_SBracket.setEnabled(false);
        Button_EBracket.setEnabled(false);
    }

    // ON BUTTON WORKING STARTS HERE....<<<
    private void enable1() {

        textField.setEnabled(true);

        Button_0.setEnabled(true);
        Button_1.setEnabled(true);
        Button_2.setEnabled(true);
        Button_3.setEnabled(true);
        Button_4.setEnabled(true);
        Button_5.setEnabled(true);
        Button_6.setEnabled(true);
        Button_7.setEnabled(true);
        Button_8.setEnabled(true);
        Button_9.setEnabled(true);

        Button_dot.setEnabled(true);
        Button_Addition.setEnabled(true);
        Button_Subtraction.setEnabled(true);
        Button_Mutiplication.setEnabled(true);
        Button_Division.setEnabled(true);
        Button_Equal.setEnabled(true);

        Button_Sin.setEnabled(true);
        Button_Cos.setEnabled(true);
        Button_Tan.setEnabled(true);

        Button_Factorial.setEnabled(true);
        Button_Log.setEnabled(true);
        Button_Power.setEnabled(true);
        Button_Square.setEnabled(true);
        Button_Sqrt.setEnabled(true);

        Button_Delete.setEnabled(true);
        Button_Clear.setEnabled(true);

        Button_SBracket.setEnabled(true);
        Button_EBracket.setEnabled(true);
    }

    private static final String divideZero = " Can't divided by Zero"; // Constant Defined

    // To Check Precedence
    static int prec(char ch) {
        if (ch == '!') {
            return 5;
        } else if (ch == '(' || ch == ')') {
            return 4;
        } else if (ch == '^') {
            return 3;
        } else if (ch == '/' || ch == '*') {
            return 2;
        } else if (ch == '+' || ch == '-') {
            return 1;
        } else
            return -1;

    }

    // Calculation method
    static Object calculate(double num1, double num2, char op) {
        switch (op) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    return divideZero;
                } else {
                    return num1 / num2;
                }
            case '^':
                return Math.pow(num1, num2);
            default:
                return 0;

        }
    }

    // factorial method
    private static double factorial(double y) {
        double fact = 1;
        if (y == 0 || y == 1) {
            fact = 1;
        } else {
            for (int i = 2; i <= y; i++) {
                fact *= i;
            }
        }
        return fact;
    }

    // INFIX to POSTFIX and POSTFIX Evaluation
    static String evaluate(String str) {

        Stack operand = new Stack();
        CharStack operator = new CharStack();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                String value = "";
                while (i < str.length()) {
                    if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.') {
                        value += str.charAt(i);
                        i++;
                    } else {
                        break;
                    }

                }
                i--;
                operand.push(Double.parseDouble(value));
            }

            else if (ch == '!') {
                double facValue = factorial(operand.peek());
                operand.pop();
                operand.push(facValue);

            }
            // For COS Function
            else if (ch == 'c') {
                String Cvalue = "";
                i = i + 3;
                while (i < str.length()) {
                    if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.') {
                        Cvalue += str.charAt(i);
                        i++;
                    } else {
                        break;
                    }

                }
                i--;

                double CosValue = Math.cos(Double.parseDouble(Cvalue));
                operand.push(CosValue);

            }
            // For SIN Function
            else if (ch == 's') {
                String Svalue = "";
                i = i + 3;
                while (i < str.length()) {
                    if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.') {
                        Svalue += str.charAt(i);
                        i++;
                    } else {
                        break;
                    }

                }
                i--;

                double SinValue = Math.sin(Double.parseDouble(Svalue));
                operand.push(SinValue);

            }
            // For TAN Function
            else if (ch == 't') {
                String Tvalue = "";
                i = i + 3;
                while (i < str.length()) {
                    if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.') {
                        Tvalue += str.charAt(i);
                        i++;
                    } else {
                        break;
                    }

                }
                i--;

                double TanValue = Math.tan(Double.parseDouble(Tvalue));
                operand.push(TanValue);

            }
            // For LOG Function
            else if (ch == 'l') {
                String Lvalue = "";
                i = i + 3;
                while (i < str.length()) {
                    if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.') {
                        Lvalue += str.charAt(i);
                        i++;
                    } else {
                        break;
                    }

                }
                i--;

                double LogValue = Math.log10(Double.parseDouble(Lvalue));
                operand.push(LogValue);

            }
            // For Square Root
            else if (ch == '√') {
                String SRvalue = "";
                i = i + 1;
                while (i < str.length()) {
                    if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.') {
                        SRvalue += str.charAt(i);
                        i++;
                    } else {
                        break;
                    }

                }
                i--;

                double SqrtValue = Math.sqrt(Double.parseDouble(SRvalue));
                operand.push(SqrtValue);

            }

            else if (ch == '(') {
                operator.push(ch);
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^') { // When operator comes then
                                                                                        // check for
                if (operator.isEmpty()) {
                    operator.push(ch);
                } else if (operator.peek() == '(') {
                    operator.push(ch);
                } else if (prec(operator.peek()) >= prec(ch)) {
                    char op = operator.pop();
                    double num2 = operand.pop();
                    double num1 = operand.pop();
                    Object value = calculate(num1, num2, op);
                    if (value instanceof String)
                        return divideZero;
                    operand.push((double) value);
                    operator.push(ch);
                } else {
                    operator.push(ch);
                }
            } else if (ch == ')') {
                while (operator.peek() != '(') {
                    char op = operator.pop();
                    double num2 = operand.pop();
                    double num1 = operand.pop();
                    Object value = calculate(num1, num2, op);
                    if (value instanceof String)
                        return divideZero;
                    operand.push((double) value);
                }
                operator.pop();
            }
        }
        // Ending of expression
        while (operator.size() != 0) {
            char op = operator.pop();
            double num2 = operand.pop();
            double num1 = operand.pop();
            Object value = calculate(num1, num2, op);
            if (value instanceof String)
                return divideZero;
            operand.push((double) value);
        }
        return String.valueOf(operand.pop());

    }
}
