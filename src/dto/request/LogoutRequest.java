package dto.request;

public class LogoutRequest {
    private String userName;
    public void LogOutRequest(String userName){this.userName = userName;}
    public String getUserName(){return userName;}
}

