package Services;

import Data.Model.Diary;
import Data.Repositories.DiaryRepository;

public class DiaryAppService extends DiaryServices {
    private final DiaryRepository diaryRepository;

    public DiaryAppService(DiaryRepository diaryRepository) {
        this.diaryRepository = diaryRepository;
    }

    @Override
    public Diary createDiary(String userName, String password) {
        Diary username = new Diary(userName, password);
        Diary diary = new Diary(username);
        diaryRepository.save(diary);
        return diary;
    }

    @Override
    public void deleteDiary(String userName) {
        diaryRepository.deleteByUserName(userName);
    }

    @Override
    public long getDiariesSize() {
        return diaryRepository.count();
    }
}