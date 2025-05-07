import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Database {
    private ArrayList<HashMap<String, String>> database = new ArrayList<>();

    public void newDataBaseInput(String firstName, String lastName,String age, String gender){
        HashMap<String, String> data = new HashMap<>();

        data.put("firstName", firstName);
        data.put("lastName", lastName);
        data.put("age", age);
        data.put("gender", gender);

        database.add(data);
    }

    public ArrayList<HashMap<String, String>> getData(String searchInput){
        ArrayList<HashMap<String, String>> matchingData = new ArrayList<>();
        ArrayList<String> columns = new ArrayList<>(Arrays.asList("firstName", "lastName", "age", "gender"));
        String[] keySearchWords = searchInput.split(" ");

        for (HashMap<String, String> row : database) {
            Boolean keyWordIsFound = false;
            for(String columnName : columns){
                String columnValue = row.get(columnName);

                for(String keyWord : keySearchWords){
                    if(keyWord.equalsIgnoreCase(columnValue) && keyWordIsFound == false){
                        matchingData.add(row);
                        keyWordIsFound = true;
                    }
                }
            }
        }

        return matchingData;
    }

    public void searchData(String searchInput){
        for(HashMap<String, String> row : getData(searchInput)){
            System.out.println(row);
        }
    }

    public ArrayList<HashMap<String, String>> getDatabaseData(){
        return database;
    }
}
