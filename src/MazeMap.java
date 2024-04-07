import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class Board implements ActionListener {

    private StyledDocument doc;
    private Style style;
    private JTextPane textPane;
    private JFrame frame;
    private JPanel panel;
    private JButton buttonMap1;
    private JButton buttonMap2;
    private Board map;

    public MazeMap() {
        frame = new JFrame("A-maze-ing Adventures");
        buttonMap1 = new JButton("Map 1");
        buttonMap2 = new JButton("Map 2");
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(100,100,100,100));
        panel.setLayout(new GridLayout(0, 1));

        buttonMap1.addActionListener(this);
        buttonMap2.addActionListener(this);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Map 1")){
            map = new Map1();
        }else if (e.getActionCommand().equals("Map 2")) {
            map = new Map2();
        }
    }
}

