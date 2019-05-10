package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(3);
        frame.setPreferredSize(new Dimension(400, 200));
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);
        JTextField textField = new JTextField();
        JButton buton = new JButton("Copy!");
        JLabel label = new JLabel();
        container.add(textField);
        container.add(buton);
        container.add(label);
        ActionEventListener listener = new ActionEventListener(textField, label);
        buton.addActionListener(listener);
    }
}
