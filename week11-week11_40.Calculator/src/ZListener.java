import javax.swing.*;
import java.awt.event.ActionEvent;

public class ZListener extends CalculatorListener {

    public ZListener(Calculator calculator,
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
