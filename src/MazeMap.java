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
    private boolean finished;

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
                    displayPlayer(g);
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
        if (e.getSource() == buttonMap2) {
            map = new Map2();
            mazePanel.repaint();
            mazePanel.remove(buttonMap1);
            mazePanel.remove(buttonMap2);
        } else if (e.getSource() == buttonMap1) {
            map = new Map1();
            mazePanel.repaint();
            mazePanel.remove(buttonMap2);
            mazePanel.remove(buttonMap1);
        }
        mazePanel.revalidate();
    }

    public static void main(String[] args) {
        new MazeMap();
    }

    private void movePts(String direction) {
        int newX = map.getXPt();
        int newY = map.getYPt();
        if (map.move(direction)) {
            if (map.isGoalReached(map.getXPt(), map.getYPt())) {
                finished = true;
                JOptionPane.showMessageDialog(this, "Congratulations! You reached the goal!");
            }
            mazePanel.repaint();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (map != null) {
            int keyCode = e.getKeyCode();
            switch (keyCode) {
                case KeyEvent.VK_W:
                    movePts("W");
                    break;
                case KeyEvent.VK_A:
                    movePts("A");
                    break;
                case KeyEvent.VK_S:
                    movePts("S");
                    break;
                case KeyEvent.VK_D:
                    movePts("D");
                    break;
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}

    private void displayMaze(Graphics g) {
        int size = 20;
        for (int i = 0; i < map.getRows(); i++) {
            for (int j = 0; j < map.getCols(); j++) {
                if (map.wall(j, i)) {
                    g.setColor(Color.BLACK);
                    g.fillRect(j * size, i * size, size, size);
                } else if (map.isGoalReached(i, j)) {
                    g.setColor(Color.GREEN);
                    g.fillRect(j * size, i * size, size, size);
                }
            }
        }
    }

    private void displayPlayer(Graphics g) {
        g.setColor(Color.RED);
        g.fillRoundRect(map.getXPt() * 20, map.getYPt() * 20, 20, 20, 15, 15);
    }
}

