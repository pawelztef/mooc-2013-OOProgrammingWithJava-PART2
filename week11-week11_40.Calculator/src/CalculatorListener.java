import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorListener implements ActionListener {

    private JTextField input, output;
    private Calculator calculator;
    private JButton plusButton, minusButton, zButton;

    public CalculatorListener(Calculator calculator,
                              JTextField input,
                              JTextField output,
                              JButton plusButton,
                              JButton minusButton,
                              JButton zButton) {
        this.calculator = calculator;
        this.input = input;
        this.output = output;
        this.plusButton = plusButton;
        this.minusButton = minusButton;
        this.zButton = zButton;
    }


    public JTextField getInput() {
        return input;
    }

    public JTextField getOutput() {
        return output;
    }

    public Calculator getCalculator() {
        return calculator;
    }

    public JButton getZButton() {
        return zButton;
    }

    public JButton getMinusButton() {
        return minusButton;
    }

    public JButton getPlusButton() {
        return plusButton;
    }

    public boolean checkInput(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException exception) {
            return false;
        }
        return true;
    }

    public void setzButtonState() {
        if (calculator.getSum() != 0) {
            getZButton().setEnabled(true);
        } else {
            getZButton().setEnabled(false);
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
