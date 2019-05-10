import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorListener implements ActionListener {

    private GraphicCalculator graphicCalculatorcalculator;
    private JTextField input, output;
    private Calculator calculator;
    private JButton button;

    public CalculatorListener(GraphicCalculator graphicCalculator) {
        this.graphicCalculatorcalculator = graphicCalculator;
        this.input = graphicCalculator.getInput();
        this.output = graphicCalculator.getOutput();
        this.calculator = graphicCalculator.getCalculator();
        this.button = graphicCalculator.getZeroButton();
    }


    public JTextField getInput() {
        return input;
    }

    public JTextField getOutput() { return output; }

    public Calculator getCalculator() {
        return calculator;
    }

    public JButton getButton() { return button; }

    @Override
    public void actionPerformed(ActionEvent e) { }
}
