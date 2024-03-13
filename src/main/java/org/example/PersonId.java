package org.example;

public class PersonId {
    text t1 = new text();
    String id;
    String pw;
    String nickName;

    int memberNumber;

    PersonId(){

    }

    public int getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(int memberNumber) {
        this.memberNumber = memberNumber;
    }

    PersonId(String id, String pw, String nickName){
        this.id = id;
        this.pw = pw;
        this.nickName = nickName;
    }

    public text getT1() {
        return t1;
    }

    public String getId() {
        return id;
    }

    public String getPw() {
        return pw;
    }

    public String getNickName() {
        return nickName;
    }

    public void setT1(text t1) {
        this.t1 = t1;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
