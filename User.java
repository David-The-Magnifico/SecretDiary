package src;

import java.util.ArrayList;
import java.util.List;

public class User {

    private final List<Diary> mySecretDiary = new ArrayList<>();

    public void createDiary(String username, String password) {
        Diary mySoMuchLovedDiary = new Diary(username, password);
        mySecretDiary.add(mySecretDiary);
    }

    public void queryDiaries() {
        System.out.println("My secret diaries: " + mySecretDiary);
    }
}
