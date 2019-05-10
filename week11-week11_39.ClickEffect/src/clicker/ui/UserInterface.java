package clicker.ui;

import clicker.applicationlogic.Calculator;
import clicker.applicationlogic.PersonalCalculator;

import java.awt.*;
import javax.swing.*;

public class UserInterface implements Runnable {
    private JFrame frame;
    private Calculator calculator;

    public UserInterface(Calculator calculator) {
       this.calculator = calculator;
    }

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout gridLayout = new GridLayout(2, 1);
        container.setLayout(gridLayout);
        JLabel label = new JLabel("0");
        JButton button = new JButton("click!");
        ClickListener listener = new ClickListener(calculator, label);
        button.addActionListener(listener);
        container.add(label);
        container.add(button);
    }

    public JFrame getFrame() {
        return frame;
    }
}
