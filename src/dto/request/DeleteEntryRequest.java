package dto.request;

public class DeleteEntryRequest {
    private String author;
    private String password;
    private String title;

    public DeleteEntryRequest(String author, String password, String title){
        this.author = author;
        this.password = password;
        this.title = title;
    }
    public String getAuthor(){
        return author;
    }
    public void setUsername(String username){
        this.author = username;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String Title){
        this.title = title;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
}
