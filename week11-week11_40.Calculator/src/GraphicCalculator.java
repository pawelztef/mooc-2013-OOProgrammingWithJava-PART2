
import java.awt.*;
import javax.swing.*;

public class GraphicCalculator implements Runnable {
    private JFrame frame;
    private Calculator calculator;
    private JTextField input, output;
    private JButton plus, minus, zero;

    public GraphicCalculator() {
        this.calculator = new Calculator();
    }


    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(3);
        frame.setPreferredSize(new Dimension(300, 400));
        frame.setLayout(new GridLayout(3, 1));

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        input = new JTextField();
        output = new JTextField("0");
        output.setEnabled(false);


        container.add(output);
        container.add(input);
        container.add(createPanel(input, output), BorderLayout.SOUTH);
    }

    private JPanel createPanel(JTextField paramInput, JTextField paramOutput) {
        JPanel panel = new JPanel(new GridLayout(1,3));
        plus = new JButton("+");
        minus = new JButton("-");
        zero = new JButton("Z");
        plus.addActionListener(new PlusListener(calculator, paramInput, paramOutput, plus, minus, zero));
        plus.addActionListener(new MinusListener(calculator, paramInput, paramOutput, plus, minus, zero));
        zero.addActionListener(new ZListener(calculator, paramInput,  paramOutput, plus, minus, zero));
        zero.setEnabled(false);

        panel.add(plus);
        panel.add(minus);
        panel.add(zero);

        return panel;
    }

    public JFrame getFrame() {
        return frame;
    }
}
