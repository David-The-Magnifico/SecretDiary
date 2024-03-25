import src.Diary;

import javax.swing.JOptionPane;

public class MainApplication2 {

    public static void main(String[] args) {
        Diary diary = new Diary();
        int option = 0;
        String username = "", password = "";

        while (option != 4) {
            String content = "Choose an Option\n\n" +
                    "[1] Create a new diary\n" +
                    "[2] Select an existing diary\n" +
                    "[3] Delete a diary\n" +
                    "[4] Exit";
            option = Integer.parseInt(JOptionPane.showInputDialog(content));

            switch (option) {
                case 1:
                    username = JOptionPane.showInputDialog("Enter a username for your diary: ");
                    password = JOptionPane.showInputDialog("Enter a password for your diary: ");
                    diary = new Diary(username, password);
                    JOptionPane.showMessageDialog(null, "Your diary has been created successfully.");
                    operateOnDiary(diary);
                    break;
                case 2:
                    username = JOptionPane.showInputDialog("Enter the username of the diary you want to select: ");
                    diary = src.Diary.findDiaryByUsername(username);
                    if (diary != null) {
                        password = JOptionPane.showInputDialog("Enter the password of the diary: ");
                        diary.unlockDiary(password);
                        if (!diary.isLocked()) {
                            JOptionPane.showMessageDialog(null, "Your diary has been selected successfully.");
                            operateOnDiary(diary);
                        } else {
                            JOptionPane.showMessageDialog(null, "Incorrect password. Please try again.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No diary found with that username. Please try again.");
                    }
                    break;
                case 3:
                    username = JOptionPane.showInputDialog("Enter the username of the diary you want to delete: ");
                    Diary.deleteDiary(username);
                    JOptionPane.showMessageDialog(null, "Your diary has been deleted successfully.");
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice. Please try again.");
                    break;
            }
        }
    }

    public static void operateOnDiary(Diary diary) {
        int option = 0;
        String title = "", body = "";
        int id = 0;
        Entry entry = null;

        while (option != 6) {
            String content = "Choose an Option\n\n" +
                    "[1] Create a new entry\n" +
                    "[2] Add an entry\n" +
                    "[3] Update an entry\n" +
                    "[4] Delete an entry\n" +
                    "[5] View all entries\n" +
                    "[6] Back to main menu";
            option = Integer.parseInt(JOptionPane.showInputDialog(content));

            switch (option) {
                case 1:
                    title = JOptionPane.showInputDialog("Enter a title for your entry: ");
                    body = JOptionPane.showInputDialog("Enter a body for your entry: ");
                    entry = new Entry(title, body);
                    JOptionPane.showMessageDialog(null, "Your entry has been created successfully.");
                    break;
                case 2:
                    if (entry != null) {
                        diary.addEntry(entry);
                        JOptionPane.showMessageDialog(null, "Your entry has been added successfully.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Please create an entry first.");
                    }
                    break;
                case 3:
                    id = Integer.parseInt(JOptionPane.showInputDialog("Enter the id of the entry you want to update: "));
                    entry = diary.findEntryById(id);
                    if (entry != null) {
                        title = JOptionPane.showInputDialog("Enter a new title for your entry: ");
                        body = JOptionPane.showInputDialog("Enter a new body for your entry: ");
                        entry.setTitle(title);
                        entry.setBody(body);
                        JOptionPane.showMessageDialog(null, "Your entry has been updated successfully.");
                    } else {
                        JOptionPane.showMessageDialog(null, "No entry found with that id. Please try again.");
                    }
                    break;
                case 4:
                    id = Integer.parseInt(JOptionPane.showInputDialog("Enter the id of the entry you want to delete: "));
                    diary.deleteEntry(id);
                    JOptionPane.showMessageDialog(null, "Your entry has been deleted successfully.");
                    break;
                case 5:
                    for (Entry e : diary.getEntries()) {
                        System.out.println("Entry: " + e.getId() + ", Title: " + e.getTitle() + ", Body: " + e.getBody());
                    }
                    break;
                case 6:
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
