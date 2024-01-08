import java.util.HashMap;

public class CoordinateToCharPiece {
    
    private HashMap<Integer, Character> coordinateWithChar = new HashMap<>(); //<Coordinate of the tile, Piece>> 

    public CoordinateToCharPiece() {

        String figuresPosition = Input.getFiguresPosition();
        char[] fenBoard = figuresPosition.toCharArray();
        int position = 0;
        
        for (char symbol : fenBoard) {
            if (symbol == '/') {
                position += 8;
            } else {
                if (Character.isDigit(symbol)) {
                    position += (int) Character.getNumericValue(symbol);
                } else {
                    coordinateWithChar.put(position, symbol);
                    position++;
                }
            }

        }
    }

    public HashMap<Integer, Character> getCoordinateWithCharHashMap() {
        return coordinateWithChar;
    }
}