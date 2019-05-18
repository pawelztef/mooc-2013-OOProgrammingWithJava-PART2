import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlusListener extends CalculatorListener {


    public PlusListener(Calculator calculator,
                        JTextField input,
                        JTextField output,
                        JButton plusButton,
                        JButton minusButton,
                        JButton zButton) {
        super(calculator, input, output, plusButton, minusButton, zButton);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Calculator calculator = this.getCalculator();
        JTextField input = this.getInput();
        JTextField output = this.getOutput();
        JButton plusButton = this.getPlusButton();
        String inputText = input.getText();
        if(checkInput(inputText)) {
            int x = Integer.parseInt(inputText);
            calculator.add(x);
        }
        output.setText(calculator.reading());
        input.setText("");
        setzButtonState();
    }
}
