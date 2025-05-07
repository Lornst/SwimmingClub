import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();

        database.newDataBaseInput("Benjamin", "Bruel","24","Male");
        database.newDataBaseInput("Benjamin", "Larsen","22","Male");
        database.newDataBaseInput("August", "Gosden","12","Male");
        database.newDataBaseInput("Christoffer", "Liber","53","Male");
        database.newDataBaseInput("Albert", "Dam","84","Male");
        database.newDataBaseInput("Felix", "Nielsen","32","Male");

        database.searchData("12 53");
    }
}
