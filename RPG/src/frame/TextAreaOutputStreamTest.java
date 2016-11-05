package frame;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import javax.swing.*;

import Creature.Hero;
import Events.Creator;
import Events.Event;

@SuppressWarnings("serial")
public class TextAreaOutputStreamTest extends JPanel {
	Creator creator = new Creator();
	
	Event event = new Event();
	Hero hero = (Hero) creator.createHero();

   private JTextArea textArea = new JTextArea(15, 30);
   private TextAreaOutputStream taOutputStream = new TextAreaOutputStream(
         textArea, "aTest");

   public TextAreaOutputStreamTest() {
      setLayout(new BorderLayout());
      add(new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
            JScrollPane.HORIZONTAL_SCROLLBAR_NEVER));
      System.setOut(new PrintStream(taOutputStream));

      int timerDelay = 1000;
      new Timer(timerDelay , new ActionListener() {
         int count = 0;
         @Override
         public void actionPerformed(ActionEvent arg0) {
        	
        		event.round(hero);
        		
            // though this outputs via System.out.println, it actually displays
            // in the JTextArea:
            System.out.println("Count is now: " + count + " seconds");
            count++;
         }
      }).start();
   }

   private static void createAndShowGui() {
      JFrame frame = new JFrame("Test");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().add(new TextAreaOutputStreamTest());
      frame.pack();
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }

   public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            createAndShowGui();
         }
      });
   }
}