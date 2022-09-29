import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class GUI {

    public static void main (String[] args)
    {
        JFrame frame= new JFrame("Ultimate Beginner Project");
        

        //creating and setting up new Frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        //frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
        

        //Define new buttons
        JButton jb1 =new JButton("Word Reversal");
        JButton jb2 =new JButton("Anagram");
        JButton jb3 =new JButton("Word Finder");

        //Define Panel to hold Buttons
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(jb1);
        panel.add(jb2);
        panel.add(jb3);

        //Set frame to visible
        frame.add(panel);
        frame.pack(); //Passt die Größe des Fensters auf die Inhalte an
        frame.setVisible(true);

        



    }
    
}
