import javax.swing.*;
import java.awt.event.ActionEvent;

public class ZListener extends CalculatorListener {

    public ZListener(GraphicCalculator graphicCalculator) {
        super(graphicCalculator);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Calculator calculator = getCalculator();
        JTextField output = getOutput();
        JTextField input = getInput();
        calculator.zero();
        input.setText("");
        output.setText(calculator.reading());
    }
}
