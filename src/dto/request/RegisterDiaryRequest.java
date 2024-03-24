package dto.request;

public class RegisterDiaryRequest {
    public void setUserName(String userName){
        this.username = userName;
    }
    public void setPassword(String password){
        this.password= password;
    }
    private String username;
    private String password;

    public String getUserName(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }
}
