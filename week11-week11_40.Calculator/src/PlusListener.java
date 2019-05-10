import javax.swing.*;
import java.awt.event.ActionEvent;

public class PlusListener extends CalculatorListener {

    private GraphicCalculator graphicCalculatorT;
    public PlusListener(GraphicCalculator graphicCalculator) {
        super(graphicCalculator);
        graphicCalculatorT = graphicCalculator;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Calculator calculator = getCalculator();
        JTextField input = graphicCalculatorT.getInput();
        JTextField output = graphicCalculatorT.getOutput();
        System.out.println(input.getText());
        int toAdd = Integer.parseInt(input.getText());
        System.out.println(toAdd);
        calculator.add(toAdd);
        input.setText("");
        output.setText(calculator.reading());
    }
}
