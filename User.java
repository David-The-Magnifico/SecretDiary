package src;

import java.util.ArrayList;
import java.util.List;

public class User {

    private final List<Diary> mySecretDiaries = new ArrayList<>();

    public void createDiary(String username, String password) {
        Diary mySoMuchLovedDiary = new Diary(username, password);
        mySecretDiaries.add(mySoMuchLovedDiary);
    }
}
