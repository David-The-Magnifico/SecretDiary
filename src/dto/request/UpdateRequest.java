package dto.request;

public class UpdateRequest {
    private int entryId;
    private String newBody;

    public UpdateRequest(int entryId, String newContent) {
        this.entryId = entryId;
        this.newBody = newBody;
    }

    public int getEntryId() {
        return entryId;
    }

    public String getNewContent() {
        return newBody;
    }
}
