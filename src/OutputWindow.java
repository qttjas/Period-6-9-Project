import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class OutputWindow {

    private StyledDocument doc;
    private Style style;
    private JTextPane textPane;

    public OutputWindow() {
        JFrame frame = new JFrame("A-maze-ing Adventures");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null); // Center the window
        textPane = new JTextPane();
        textPane.setEditable(false);
        doc = textPane.getStyledDocument();
        style = doc.addStyle("my style", null);
        StyleConstants.setFontSize(style, 25);
        frame.add(textPane);
        frame.setVisible(true);
    }

    public void addTextToWindow(String text, Color color) {
        StyleConstants.setForeground(style, color);
        try {
            doc.insertString(doc.getLength(), text, style);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clear() {
        textPane.setText("");
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
