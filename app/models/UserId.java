package models;


import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Created by keith parke on 2/13/2017.
 */public class UserId

{
    private int id;
    private String userId;
    private String title;
    private String body;

    public int getId()
    {
        return id;
    }

    @JsonSetter("id")
    public void setId(int id)
    {
        this.id = id;
    }

    public String getUserId()
    {
        return userId;
    }

    @JsonSetter("userId")
    public void setUserId(int id)
    {
        this.userId = userId;
    }

    public String getTitle()
    {
        return title;
    }

    @JsonSetter("title")
    public void setTitle(String title)
    {
      this.title = title;
    }


    public String getBody()

    {
        return body;
    }

    @JsonSetter("body")
    public void setBody(String body)
    {
        this.body = body;
    }

}