import javax.swing.*;

public class GUIExample {
    private JPanel panel1;
    private JButton button1;

    private JLabel label1;

    public GUIExample() {
        button1.addActionListener(e -> label1.setText("Nama saya Jarvis"));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Java Desktop");
        frame.setContentPane(new GUIExample().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
