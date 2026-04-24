import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Main {

    private static void createAndShowUI() {
        JFrame frame = new JFrame("Practical 54");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 260);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(5, 1, 10, 10));

        JTextField rollField = new JTextField();
        rollField.setToolTipText("Roll No");

        JTextField nameField = new JTextField();
        nameField.setToolTipText("Name");

        JTextField ageField = new JTextField();
        ageField.setToolTipText("Age");

        JTextField emailField = new JTextField();
        emailField.setToolTipText("Email");

        JButton submit = new JButton("Submit");

        panel.add(rollField);
        panel.add(nameField);
        panel.add(ageField);
        panel.add(emailField);
        panel.add(submit);

        submit.addActionListener(e -> {
            try {
                int rollNo = Integer.parseInt(rollField.getText().trim());
                int age = Integer.parseInt(ageField.getText().trim());
                String name = nameField.getText().trim();
                String email = emailField.getText().trim();

                if (name.isEmpty()) {
                    throw new IllegalArgumentException("Name cannot be empty");
                }

                if (!email.contains("@") || !email.contains(".")) {
                    throw new IllegalArgumentException("Email format is invalid");
                }

                String data = "RollNo: " + rollNo + ", Name: " + name +
                        ", Age: " + age + ", Email: " + email;

                JFileChooser fileChooser = new JFileChooser();
                int choice = fileChooser.showSaveDialog(frame);

                File file = (choice == JFileChooser.APPROVE_OPTION)
                        ? fileChooser.getSelectedFile()
                        : null;

                if (file != null) {
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
                        bw.write(data);
                        bw.newLine();
                    }
                }

                JOptionPane.showMessageDialog(
                        frame,
                        "Registration Successful\n" + data,
                        "Success",
                        JOptionPane.INFORMATION_MESSAGE
                );

            } catch (NumberFormatException ex) {
                showError("Roll No and Age must be integers.");
            } catch (IllegalArgumentException ex) {
                showError(ex.getMessage());
            } catch (IOException ex) {
                showError("Unable to write file: " + ex.getMessage());
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }

    private static void showError(String msg) {
        JOptionPane.showMessageDialog(null, msg, "Validation Error", JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String[] args) {
        System.out.println("Dhruv Barot - 250393107002");

        // FIXED
        SwingUtilities.invokeLater(Main::createAndShowUI);
    }
}