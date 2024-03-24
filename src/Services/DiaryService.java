package Services;

import Data.Model.Diary;

public interface DiaryService {

    Diary createDiary(String username, String password);

    void registerDiaryUser(String username, String password);

    Diary logIn(String username, String password);

    void logOut(Diary diary);

    void deleteDiary(String userName);

    long getDiariesSize();
}