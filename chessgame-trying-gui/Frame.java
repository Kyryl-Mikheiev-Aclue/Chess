import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import java.awt.*;

public class Frame {
    
    //rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1

    JFrame frame;
    JPanel board;
    JPanel[] boardPanels;
    Boolean isWhite;
    Color beige = new Color(255, 233, 197);
    Color brown = new Color(150, 77, 34);
    Font font = new Font("Arial", Font.BOLD, 18);

    public Frame() {
        
        isWhite = Input.getColor();

        boardPanels = new JPanel[64];
        board = new JPanel();
        board.setBackground(Color.PINK);
        board.setBounds(0, 0, 500, 500);
        board.setLayout(new GridLayout(8, 8));
        
        createTiles();
        writeCharsAndNumbersOnTiles();

        // JMenuBar menubar = new JMenuBar();
        // menubar.setBackground(beige);
        // JMenu file = new JMenu("File");
        // JMenuItem save = new JMenuItem("Save");
        // file.add(save);
        // menubar.add(file);

        frame = new JFrame("Chessgame");
        frame.setSize(600, 600);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setAlwaysOnTop(true);
        frame.add(board); 
        // frame.setJMenuBar(menubar);
        frame.setVisible(true);
        
        CoordinateToImagePiece iii = new CoordinateToImagePiece();
        System.out.println(iii.getCoordinateWithImageHashMap());

    }

    private void createTiles() {

        for(int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                JPanel panel = new JPanel();
                panel.setLayout(new BorderLayout());
                boolean isWhite = (i + j) % 2 == 0;
                panel.setBackground(isWhite ? beige : brown);
                board.add(panel);
                boardPanels[i*8 + j] = panel;
            }
        }
    }

    private void writeCharsAndNumbersOnTiles() {
        for (int i = 0; i < 8; i++) {
            JLabel labelRank = new JLabel();
            labelRank.setFont(font);
            labelRank.setVerticalAlignment(JLabel.TOP);

            JLabel labelFile = new JLabel();
            labelFile.setFont(font);
            labelFile.setVerticalAlignment(JLabel.BOTTOM);

            if (isWhite) {
                labelRank.setText(String.valueOf(8 - i));
                labelRank.setForeground(i % 2 == 0 ? brown : beige);
                
                labelFile.setText(String.valueOf((char) (97 + i)));
                labelFile.setForeground(i % 2 == 0 ? beige : brown);
            } else {
                labelRank.setText(String.valueOf(i + 1));
                labelRank.setForeground(i % 2 == 0 ? brown : beige);

                labelFile.setText(String.valueOf((char) (104 - i)));
                labelFile.setForeground(i % 2 == 0 ? beige : brown);
            }

            boardPanels[i * 8].add(labelRank, BorderLayout.WEST);
            boardPanels[56 + i].add(labelFile, BorderLayout.EAST);
        }
    }
}
