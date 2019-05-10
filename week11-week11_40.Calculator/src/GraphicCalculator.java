
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

    public Calculator getCalculator() { return calculator; }

    public JTextField getInput() { return input; }

    public JTextField getOutput() { return output; }

    public JButton getZeroButton() {
        return zero;
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
        container.add(createPanel(), BorderLayout.SOUTH);
    }

    private JPanel createPanel() {
        JPanel panel = new JPanel(new GridLayout(1,3));
        plus = new JButton("+");
        plus.addActionListener(new PlusListener(this));

        minus = new JButton("-");
        plus.addActionListener(new MinusListener(this));

        zero = new JButton("Z");
        zero.addActionListener(new ZListener(this));
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
