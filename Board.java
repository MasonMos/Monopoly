import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Board {
    ArrayList<Property> board;
    public Board(String filename) {
        board = new ArrayList<>();
        try {
            File boardFile = new File(filename);
            Scanner readBoard = new Scanner(boardFile);
            while (readBoard.hasNextLine()) {
                String[] info = readBoard.nextLine().split(",");
                Property property = new Property(info[0], Integer.parseInt(info[1]));
                board.add(property);
            }
            readBoard.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    public ArrayList<Property> getProperties() {
        return board;
    }
    public void printProperties() {
        for (Property property : board) {
            System.out.println(property.getName() + ", " + property.getvalue());
        }
    }
    
    public Property playerAt(Integer playerLocation) {
        return board.get(playerLocation % board.size());
    }
}