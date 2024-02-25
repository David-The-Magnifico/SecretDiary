package src;

import java.util.ArrayList;
import java.util.List;

public class User {

	private Diary secretDiary;

	public void createDiary() {
        	secretDiary = new Diary();
        	secretDiary.lock();
    	}

	public void lockDiary() {
        secretDiary.lock();
    }