import com.fasterxml.jackson.annotation.JsonProperty;

public class Catfacts {

    private String id;
    private String text;
    private String type;
    private String user;
    private String upvotes;

    public Catfacts(
            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") String upvotes
    ) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;

    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public String getUpvotes() {
        return upvotes;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setUpvotes(String upvotes) {
        this.upvotes = upvotes;
    }

    @Override
    public String toString() {
        return "\n" + "Id : " + getId() + "\n"
                + "Text :" + getText() + "\n"
                + "Type :" + getType() + "\n"
                + "User :" + getUser() + "\n"
                + "upvotes :" + getUpvotes() + "\n";
    }
}
