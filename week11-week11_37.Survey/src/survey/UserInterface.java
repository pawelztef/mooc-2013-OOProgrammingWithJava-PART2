package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Survey");
        frame.setPreferredSize(new Dimension(200, 300));
        frame.setDefaultCloseOperation(3);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);

        container.add(new JLabel("Are you?"));
        container.add(new JCheckBox("Yes!"));
        container.add(new JCheckBox("No!"));

        container.add(new JLabel("Why?"));

        JRadioButton one = new JRadioButton("No reason.");
        JRadioButton two = new JRadioButton("Because it is fun!");
        ButtonGroup group = new ButtonGroup();
        group.add(one);
        group.add(two);
        container.add(one);
        container.add(one);
        container.add(two);

        container.add(new JButton("Done!"));

    }


    public JFrame getFrame() {
        return frame;
    }
}
