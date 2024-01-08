import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.*;

import javax.swing.ImageIcon;

public class CoordinateToImagePiece {

    private HashMap<Integer, Character> coordinateWithChar;    
    private HashMap<Integer, ImageIcon> coordinateWithImage;

    public CoordinateToImagePiece() {
        CoordinateToCharPiece coordinateToChar = new CoordinateToCharPiece();
        coordinateWithChar = coordinateToChar.getCoordinateWithCharHashMap();        
        transfer();
    }

    public void transfer() {
        for (int i = 0; i < 64; i++) {
            if (coordinateWithChar.containsKey(i)) {
                char letter = coordinateWithChar.get(i);
                switch (letter) {
                    case 'r':
                        ImageIcon r = new ImageIcon("r.png");
                        coordinateWithImage.put(i, r);
                        
                    case 'n':
                        ImageIcon n = new ImageIcon("n.png");
                        coordinateWithImage.put(i, n);
                        continue;
                    case 'b':
                        ImageIcon b = new ImageIcon("b.png");
                        coordinateWithImage.put(i, b);
                        continue;
                    case 'q':
                        ImageIcon q = new ImageIcon("q.png");
                        coordinateWithImage.put(i, q);
                        continue;
                    case 'k':
                        ImageIcon k = new ImageIcon("k.png");
                        coordinateWithImage.put(i, k);
                        continue;
                    case 'p':
                        ImageIcon p = new ImageIcon("p.png");
                        coordinateWithImage.put(i, p);
                        continue;
                    case 'P':
                        ImageIcon P = new ImageIcon("P.png");
                        coordinateWithImage.put(i, P);
                        continue;
                    case 'R':
                        ImageIcon R = new ImageIcon("R.png");
                        coordinateWithImage.put(i, R);
                        continue;
                    case 'N':
                        ImageIcon N = new ImageIcon("N.png");
                        coordinateWithImage.put(i, N);
                        continue;
                    case 'B':
                        ImageIcon B = new ImageIcon("B.png");
                        coordinateWithImage.put(i, B);
                        continue;
                    case 'Q':
                        ImageIcon Q = new ImageIcon("Q.png");
                        coordinateWithImage.put(i, Q);
                        continue;
                    case 'K':
                        ImageIcon K = new ImageIcon("K.png");
                        coordinateWithImage.put(i, K);
                        continue;           
                }   
            }
        }
    }

    public HashMap<Integer, ImageIcon> getCoordinateWithImageHashMap() {
        return coordinateWithImage;
    }
}
