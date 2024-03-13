package org.example;

import java.time.LocalDateTime;

class text {
    Comments com = new Comments();
    private String title;
    private String content;

    private int num;

    private int views;
    private String nickName;
    text (){

    }

     text(int num , String title, String content) {
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

    void test() {
        this.num = 1;
        this.title = "안녕하세요.";
        this.content = "안녕하세여.";
    }

    void test2() {
        this.num = 2;
        this.title = "반갑습니다.";
        this.content = "반갑습니다.";
    }

    void test3() {
        this.num = 3;
        this.title = "다음에봐요.";
        this.content = "다음에봐요.";
    }

}