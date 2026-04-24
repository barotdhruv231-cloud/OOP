import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class Practical52 {
    private static void createAndShowUI() {
        JFrame frame = new JFrame("Practical 52");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 300);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridLayout(5, 1, 0, 12));

        Random random = new Random();
        Font font = new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22);

        for (int i = 1; i <= 5; i++) {
            JLabel label = new JLabel("Text " + i, SwingConstants.CENTER);
            label.setFont(font);
            label.setForeground(
                new Color(
                    random.nextInt(256),
                    random.nextInt(256),
                    random.nextInt(256),
                    80 + random.nextInt(176)
                )
            );
            frame.add(label);
        }

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        System.out.println("Dhruv Soni - 240390107005");
        SwingUtilities.invokeLater(Practical52::createAndShowUI);
    }
}