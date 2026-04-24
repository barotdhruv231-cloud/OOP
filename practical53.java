import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class Main {

    // Panel where ball moves
    private static class BallPanel extends JPanel {
        private static final int RADIUS = 20;
        private int x = RADIUS + 10;
        private int dx = 1;
        private final JSlider speedSlider;

        BallPanel(JSlider speedSlider) {
            this.speedSlider = speedSlider;
            setBackground(new Color(253, 253, 253));
            setPreferredSize(new Dimension(600, 300));
        }

        void moveBall() {
            int width = getWidth();
            int speed = speedSlider.getValue();

            // Bounce logic
            if (x + RADIUS >= width) {
                dx = -1;
            } else if (x - RADIUS <= 0) {
                dx = 1;
            }

            x += dx * speed;
            repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(new Color(153, 50, 204));
            int y = getHeight() / 2;
            g.fillOval(x - RADIUS, y - RADIUS, RADIUS * 2, RADIUS * 2);
        }
    }

    // UI creation
    private static void createAndShowUI() {
        JFrame frame = new JFrame("Practical 53: Bouncing Ball");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Speed slider
        JSlider speedSlider = new JSlider(1, 20, 5);
        speedSlider.setPaintTicks(true);
        speedSlider.setPaintLabels(true);
        speedSlider.setMajorTickSpacing(5);
        speedSlider.setMinorTickSpacing(1);
        speedSlider.setPreferredSize(new Dimension(200, 40));

        BallPanel canvas = new BallPanel(speedSlider);

        // Timer for animation
        Timer timer = new Timer(16, e -> canvas.moveBall());

        // Buttons
        JButton startBtn = new JButton("Start");
        JButton stopBtn = new JButton("Stop");

        startBtn.addActionListener(e -> {
            if (!timer.isRunning()) {
                timer.start();
            }
        });

        stopBtn.addActionListener(e -> {
            if (timer.isRunning()) {
                timer.stop();
            }
        });

        // Controls panel
        JPanel controls = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));
        controls.add(startBtn);
        controls.add(stopBtn);
        controls.add(new JLabel("Speed Control:"));
        controls.add(speedSlider);

        frame.setLayout(new BorderLayout());
        frame.add(canvas, BorderLayout.CENTER);
        frame.add(controls, BorderLayout.SOUTH);

        frame.setSize(700, 450);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // FIXED LINE (was causing error)
        SwingUtilities.invokeLater(Main::createAndShowUI);

        System.out.println("Dhruv Soni - 240390107005");
    }
}