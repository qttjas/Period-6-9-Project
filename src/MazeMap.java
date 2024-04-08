import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public abstract class MazeMap extends JFrame implements ActionListener {

    private JTextPane textPane;
    private JFrame frame;
    private JPanel panel;
    private JButton buttonMap1;
    private JButton buttonMap2;
    private Board map;
    private static final int SIZE = 50;
    private Graphics g;

    public MazeMap() {
        setupGUI();
    }

    private void setupGUI() {
        frame = new JFrame("A-maze-ing Adventures");
        buttonMap1 = new JButton("Map 1");
        buttonMap2 = new JButton("Map 2");
        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponents(g);
                displayMaze(g);
            }
        };
        panel.setBorder(BorderFactory.createEmptyBorder(100,100,100,100));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(buttonMap1);
        panel.add(buttonMap2);

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
        }else {
            System.out.println("pick one plz");
        }
    }

    private void displayMaze(Graphics g) {
        for (int i = 0; i < map.getRows(); i++) {
            for (int j = 0; j < map.getCols(); j++) {
                if (map.isObstacle(i, j)) {
                    g.setColor(Color.BLACK);
                    g.fillRect(j * SIZE, i * SIZE, SIZE, SIZE);
                } else if (map.isGoalReached(i, j)) {
                    g.setColor(Color.GREEN);
                    g.fillRect(j * SIZE, i * SIZE, SIZE, SIZE);
                }
            }
        }
    }

    protected abstract void paintComponent(Graphics g);
}

