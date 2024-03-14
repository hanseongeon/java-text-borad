package org.example;

import java.time.LocalDateTime;

class text {
    Comments com = new Comments();
    private String title;
    private String content;

    private int num;

    private int views;
    private String nickName;
    private int like;


    text() {

    }

    text(int num, String title, String content) {
        this.title = title;
        this.content = content;
        this.num = num;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }


    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }
}
