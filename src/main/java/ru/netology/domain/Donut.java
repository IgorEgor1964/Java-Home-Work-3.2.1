package ru.netology.domain;

public class Donut {
    private boolean is_donut;
    private int paid_duration;
    private int placeholder;
    private int can_publish_free_copy;
    private int edit_mode;

    public boolean isIs_donut() {
        return is_donut;
    }

    public void setIs_donut(boolean is_donut) {
        this.is_donut = is_donut;
    }

    public int getPaid_duration() {
        return paid_duration;
    }

    public void setPaid_duration(int paid_duration) {
        this.paid_duration = paid_duration;
    }

    public int getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(int placeholder) {
        this.placeholder = placeholder;
    }

    public int getCan_publish_free_copy() {
        return can_publish_free_copy;
    }

    public void setCan_publish_free_copy(int can_publish_free_copy) {
        this.can_publish_free_copy = can_publish_free_copy;
    }

    public int getEdit_mode() {
        return edit_mode;
    }

    public void setEdit_mode(int edit_mode) {
        this.edit_mode = edit_mode;
    }
}
