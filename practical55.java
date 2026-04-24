import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main {

    private static class BarChartPanel extends JPanel {
        private final String[] labels = {"Projects", "Quizzes", "Midterm Exams", "Final Exam"};
        private final int[] values = {20, 10, 30, 40};
        private final Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE};

        BarChartPanel() {
            setPreferredSize(new Dimension(760, 340));
            setBackground(Color.WHITE);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            int chartBottom = getHeight() - 50;
            int maxHeight = 220;
            int barWidth = 70;
            int gap = 90;
            int startX = 30;

            for (int i = 0; i < values.length; i++) {
                int barHeight = (int) ((values[i] / 100.0) * maxHeight);

                int x = startX + i * (barWidth + gap);
                int y = chartBottom - barHeight;

                g.setColor(colors[i]);
                g.fillRect(x, y, barWidth, barHeight);

                g.setColor(Color.BLACK);
                String label = labels[i] + " - " + values[i] + "%";

                int labelWidth = g.getFontMetrics().stringWidth(label);
                int labelX = x + (barWidth - labelWidth) / 2;

                g.drawString(label, labelX, chartBottom + 20);
            }
        }
    }

    private static void createAndShowUI() {
        JFrame frame = new JFrame("Practical 55");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new BarChartPanel());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        System.out.println("Dhruv Barot - 250393107002");

        // FIXED
        SwingUtilities.invokeLater(Main::createAndShowUI);
    }
}