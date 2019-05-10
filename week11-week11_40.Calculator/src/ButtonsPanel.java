import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.EventListener;

public class ButtonsPanel extends JPanel {

    private ActionListener plusListener, minusListener, zListener;
    private JButton buttonPlus, buttonMinus, buttonZ;

    public ButtonsPanel(CalculatorListener plusListener, CalculatorListener minusListener, CalculatorListener zListener) {
        super(new GridLayout(1,3));
        this.plusListener = plusListener;
        this.minusListener = minusListener;
        this.zListener = zListener;

        buttonPlus = new JButton("+");
        buttonMinus = new JButton("-");
        buttonZ = new JButton("Z");
        buttonZ.setEnabled(false);
        createCompontents();
    }

    public JButton getZButton() {
        return this.buttonZ;
    }

    private void createCompontents() {
        addListenersToButtons();
        add(buttonPlus);
        add(buttonMinus);
        add(buttonZ);
    }

    private void addListenersToButtons() {
        buttonPlus.addActionListener(plusListener);
        buttonMinus.addActionListener(minusListener);
        buttonZ.addActionListener(zListener);
        buttonZ.addActionListener(zListener);
    }



}
