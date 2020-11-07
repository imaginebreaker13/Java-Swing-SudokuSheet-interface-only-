import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class SudokuSheet extends JFrame{

    public SudokuSheet(){
        
        Border blackline = BorderFactory.createLineBorder(Color.black);
    
        JPanel pMenu = new JPanel(new BorderLayout());
            pMenu.setLayout(new GridLayout(5,1));
            
            pMenu.add(new JButton("Reset"));
            pMenu.add(new JButton("Solve"));
            pMenu.add(new JButton("Hint"));
            pMenu.add(new JButton("New Puzzle"));
            pMenu.add(new JLabel("Name: Imagine Breaker"));
        
        JPanel pSudoku = new JPanel(new BorderLayout());    
            pSudoku.setLayout(new GridLayout(3,3));
         
        
        for(int x = 1; x <= 9; x++){  
                JPanel p1 = new JPanel();  
                p1.setLayout(new GridLayout(3,3));
            for(int i = 1; i <=9; i++){
                p1.add(new JTextField(""));
            }  
            p1.setBorder(blackline);
            pSudoku.add(p1);
        }
        
        add(pSudoku,BorderLayout.CENTER);
        add(pMenu, BorderLayout.EAST);
    }
    
    public static void main(String[] args) {
        
        SudokuSheet frame = new SudokuSheet();
        frame.setTitle("Sudoku");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 600);
        frame.setVisible(true);
    }
    
}
