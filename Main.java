import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Chat Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.add(new Panel());
        frame.setVisible(true);
    }
}

class Panel extends JPanel {

    public Panel() {
        setBorder(new EmptyBorder(0, 50, 50, 50));
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel label = new JLabel("IP : ");
        JTextField textField = new JTextField(12);
	
	JLabel label1 = new JLabel("Port : ");
        JTextField textField1 = new JTextField(5);


        JButton start = new JButton("Start");
        JButton stop = new JButton("Stop");
	JLabel label2 = new JLabel("Message : ");
	JTextArea textArea = new JTextArea(10, 40);
        JScrollPane scrollPane = new JScrollPane(textArea);
	
	start.setBackground(Color.GREEN);
	stop.setBackground(Color.RED);

	start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                System.out.println("Server Started in IP : "+ name);
            }
        });

        add(label, gbc);
        add(textField, gbc);
	add(label1,gbc);
	add(textField1,gbc);
	add(Box.createRigidArea(new Dimension(0, 10)));
	add(label2,gbc);
        add(scrollPane,gbc);
	add(start, gbc);
	add(stop,gbc);
    }
}

