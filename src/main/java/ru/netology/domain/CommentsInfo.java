package ru.netology.domain;

public class CommentsInfo {
    private String UserId;
    private String Text;
    private String DateComment;
    private String TimeComment;
    private int count;
    private int canPost;
    private int groupsCanPost;
    private boolean canClose;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCanPost() {
        return canPost;
    }

    public void setCanPost(int canPost) {
        this.canPost = canPost;
    }

    public int getGroupsCanPost() {
        return groupsCanPost;
    }

    public void setGroupsCanPost(int groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

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