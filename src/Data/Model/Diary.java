package Data.Model;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private String username;
    private String password;
    private boolean isLocked = false;
    private List<Entry> entries = new ArrayList<Entry>();

    public Diary(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Diary(Diary username) {
    }

    public String getUsername() {
        return username;
    }

}