import java.awt.*;
import javax.swing.*;
    public class BoxDemo extends JFrame {
        void boxDemo() {
            setTitle("BoxLayout");
            Container content = getContentPane();
            setSize(200,150);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        BoxLayout box = new BoxLayout(content, BoxLayout.X_AXIS);
        setLayout(box);
            add(new JButton("Button 1"));
            add(new JButton("Button 2"));
            add(new JButton("Button 3"));
                 setVisible(true);
        }
        public static void main(String[] args) {
            BoxDemo demo = new BoxDemo();
            demo.boxDemo();
        }
    }        