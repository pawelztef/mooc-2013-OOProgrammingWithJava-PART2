import javax.swing.*;
import java.awt.event.ActionEvent;

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
    }
}
