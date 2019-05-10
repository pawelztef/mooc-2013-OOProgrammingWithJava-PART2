import javax.swing.*;
import java.awt.event.ActionEvent;

public class MinusListener extends CalculatorListener {

    public MinusListener(GraphicCalculator graphicCalculator) {
        super(graphicCalculator);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Calculator calculator = getCalculator();
        JTextField input = getInput();
        JTextField output = getOutput();
        int toTakeAway = Integer.parseInt(input.getText());
        calculator.takeAway(toTakeAway);
        input.setText("0");
        output.setText(calculator.reading());
    }
}
