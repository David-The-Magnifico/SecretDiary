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

}
