import java.awt.*;
import javax.swing.*;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class OutputWindow {

    private StyledDocument doc;
    private Style style;
    private JTextPane textPane;
    private JFrame frame;
    private JPanel panel;
    private JButton buttonMap1;
    private JButton buttonMap2;

    public OutputWindow() {
        frame = new JFrame("A-maze-ing Adventures");
        buttonMap1 = new JButton("Map 1");
        buttonMap2 = new JButton("Map 2");
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(100,100,100,100));
        panel.setLayout(new GridLayout(0, 1));

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.pack();
        frame.setVisible(true);
    }

}

//MAZE
//PLAYERS WILL ENTER THEIR NAME
//PRINTS OUT RULES
//AND THEN W A S D CONTROLS
//MENU IF YOU WANT TO DO MAP 1 OR MAP 2
//OUTPUT WINDOW (CONTROL WHERE THEY WANT TO GO YES)
//BOUNDARIES IF THEY GO OUT OF BOUND IT STOPS
//IF THEY GET TO THE EXIT THEY WIN YAY
