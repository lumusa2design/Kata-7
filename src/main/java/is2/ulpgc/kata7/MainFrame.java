package is2.ulpgc.kata7;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MainFrame extends JFrame {
    private JPanel jPanel;
    private JButton jButton;
    private Random rand = new Random();
    private Color[]colors = new Color[]{Color.BLACK, Color.BLUE, Color.cyan, Color.DARK_GRAY, Color.gray, Color.GREEN,
    Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.YELLOW};

    public MainFrame() throws HeadlessException {
        jPanel = new JPanel();
        jPanel.setBackground(Color.WHITE);
        jButton = new JButton("Random Color Background");
        jButton.setSize(200, 75);
        jButton.addActionListener(e -> jPanel.setBackground(colors[rand.nextInt(0, colors.length)]));

        this.setTitle("Color Changer");
        this.setSize(1080,1080);
        this.setLocationRelativeTo(null);
        this.add(jButton);
        this.add(jPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
