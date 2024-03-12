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
}
