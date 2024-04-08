import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MazeMap extends JPanel implements ActionListener, KeyListener {

    private JButton buttonMap1;
    private JButton buttonMap2;
    private Board map;
    private JPanel mazePanel;


    public MazeMap() {
        setupGUI();
    }

    private void setupGUI() {
        JFrame frame = new JFrame("A-maze-ing Adventures");
        buttonMap1 = new JButton("Map 1");
        buttonMap2 = new JButton("Map 2");
        mazePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (map != null) {
                    displayMaze(g);
                }
            }
        };
        mazePanel.setPreferredSize(new Dimension(200, 300));
        mazePanel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
        mazePanel.setLayout(new GridLayout(1, 0));
        mazePanel.setFocusable(true);
        mazePanel.addKeyListener(this);

        mazePanel.add(buttonMap1);
        mazePanel.add(buttonMap2);

        buttonMap1.addActionListener(this);
        buttonMap2.addActionListener(this);

        frame.add(mazePanel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonMap1) {
            map = new Map1();
            mazePanel.repaint();
        } else if (e.getSource() == buttonMap2) {
            map = new Map2();
            mazePanel.repaint();
        }
        mazePanel.remove(buttonMap1);
        mazePanel.remove(buttonMap2);
        mazePanel.revalidate();
    }

    private void displayMaze(Graphics g) {
        int size = 20; // Adjust size according to your preference
        for (int i = 0; i < map.getRows(); i++) {
            for (int j = 0; j < map.getCols(); j++) {
                if (map.isObstacle(i, j)) {
                    g.setColor(Color.BLACK);
                    g.fillRect(j * size, i * size, size, size);
                } else if (map.isGoalReached(i, j)) {
                    g.setColor(Color.GREEN);
                    g.fillRect(j * size, i * size, size, size);
                }
            }
        }
    }

    //tester for display map
    public static void main(String[] args) {
        new MazeMap();
    }
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_W:
                //will add controls to some class
                break;
            case KeyEvent.VK_A:
                //will add controls to some class
                break;
            case KeyEvent.VK_S:
                //will add controls to some class
                break;
            case KeyEvent.VK_D:
                //will add controls to some class
                break;
        }
    }
    @Override
    public void keyTyped(KeyEvent e) {}
    @Override
    public void keyReleased(KeyEvent e) {}
}

