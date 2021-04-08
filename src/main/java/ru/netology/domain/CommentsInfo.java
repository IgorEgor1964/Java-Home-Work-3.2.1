package ru.netology.domain;

public class CommentsInfo {
    private String UserId;
    private String Text;
    private String DateComment;
    private String TimeComment;

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public String getDateComment() {
        return DateComment;
    }

    public void setDateComment(String dateComment) {
        DateComment = dateComment;
    }

    public String getTimeComment() {
        return TimeComment;
    }

    public void setTimeComment(String timeComment) {
        TimeComment = timeComment;
    }
}