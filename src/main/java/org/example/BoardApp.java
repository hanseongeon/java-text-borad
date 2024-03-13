package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Calendar;

public class BoardApp {
    ArrayList<text> arr = new ArrayList<>();
    ArrayList<Comments> com = new ArrayList<>();

    public void run() {
        Scanner sc = new Scanner(System.in);
        ArrayList<PersonId> id = new ArrayList<>();
        ArrayList<Calendar> cal = new ArrayList<>();
        // 반복 횟수 정할 수 없음 -> 무한 반복 구조

        ArrayList<Comments> com = new ArrayList<>();
        int Textnumber = 4;
        int indexNum = 4;
        int login = 0;
        String globalNickName = "";
        text a = new text( 1,"안녕하세요 반갑습니다","자바 공부중이에요");
        text a2 = new text(2,"자바 질문 할게요","자바 공부중이에요");
        text a3 = new text(3,"안녕하세요 ","자바 공부중이에요");
        Calendar cal10 = Calendar.getInstance();
        Calendar cal11 = Calendar.getInstance();
        Calendar cal12 = Calendar.getInstance();
        arr.add(a);
        cal.add(cal10);
        arr.add(a2);
        cal.add(cal11);
        arr.add(a3);
        cal.add(cal12);

        while (true) { // 반복 조건이 true이기 떄문에 무한 반복


            if (login == 0) {
                System.out.printf("명령어 : ");
            } else if (login == 1) {
                for (PersonId pid : id) {
                    if (pid.getNickName().equals(globalNickName)) {
                        System.out.printf("명령어를 입력해주세요[" + pid.id + "(" + pid.nickName + ")] :");
                    }
                }
            }
            String cmd = sc.nextLine();
            if (cmd.equals("exit")) { // 숫자가 아닌 경우 닽다라는 표현을 할 때 == 이 아닌 .equals()를 사용해야 한다.
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (cmd.equals("add")) {
                if (login == 0) {
                    System.out.println("로그인 해주세요.");
                    continue;
                } else {
                    text t1 = new text();
                    Calendar cal1 = Calendar.getInstance();
                    System.out.printf("게시물 제목을 입력해주세요 : ");
                    String title = sc.nextLine();
                    if (title.trim().isEmpty()) {
                        System.out.println("잘못된 입력 방법입니다. 다시 시도해주세요.");
                        continue;
                    }
                    t1.setTitle(title);
                    System.out.printf("게시물 내용을 입력해주세요 : ");
                    String content = sc.nextLine();
                    t1.setContent(content);
                    t1.setNum(Textnumber);
                    Textnumber++;
                    t1.setNickName(globalNickName);
                    arr.add(t1);
                    cal.add(cal1);
                    System.out.println("게시물이 저장 되었습니다.");
                }
            } else if (cmd.equals("list")) {

                for (text t1 : arr) {
                    System.out.println("===========");
                    System.out.println("번호 : " + t1.getNum());
                    System.out.println("제목 : " + t1.getTitle());
                    System.out.println("===========");
                }
            } else if (cmd.equals("update")) {
                if (login == 0) {
                    System.out.println("로그인 해주세요.");
                    continue;
                } else {
                    System.out.printf("수정할 게시물 번호 : ");
                    int num1 = Integer.parseInt(sc.nextLine());
                    int index = findIndexById(num1);
                    if (index == -1) {
                        System.out.println("없는게시물 입니다.");
                        continue;
                    }
                    if (arr.get(index).getNickName().equals(globalNickName)) {
                        System.out.printf("변경할 제목 : ");
                        String upTitle = sc.nextLine();
                        System.out.printf("변경할 내용 : ");
                        String upContent = sc.nextLine();
                        arr.get(index).setTitle(upTitle);
                        arr.get(index).setContent(upContent);
                        System.out.println("수정이 완료 되었습니다.");
                        Calendar cal1 = Calendar.getInstance();
                        cal.set(index, cal1);
                    } else {
                        System.out.println("자신의 게시물만 수정 할 수 있습니다.");
                        continue;
                    }
                }
            } else if (cmd.equals("delete")) {
                if (login == 0) {
                    System.out.println("로그인 해주세요.");
                    continue;
                } else {

                    System.out.printf("삭제할 게시물 번호 : ");
                    int num1 = Integer.parseInt(sc.nextLine());
                    int index = findIndexById(num1);
                    if (index == -1) {
                        System.out.println("없는게시물 입니다.");
                        continue;
                    }
                    if (arr.get(index).getNickName().equals(globalNickName)) {
                        arr.remove(index);
                        System.out.println("삭제가 완료 되었습니다.");
                    } else {
                        System.out.println("자신의 게시물만 삭제 할 수 있습니다.");
                        continue;
                    }
                }
            } else if (cmd.equals("detail")) {
                System.out.printf("상세보기 할 게시물 번호를 입력해주세요 :");
                int num1 = Integer.parseInt(sc.nextLine());
                int index = findIndexById(num1);
                if (index == -1) {
                    System.out.println("없는게시물 입니다.");
                    continue;
                }
                text t = new text();
                t = arr.get(index);
                Calendar cal1 = Calendar.getInstance();
                cal1 = cal.get(index);
                int view = arr.get(index).getViews();
                view++;
                arr.get(index).setViews(view);
                t.setViews(view);
                System.out.printf("=====%d번 게시물=====\n", t.getNum());
                System.out.println("번호 : " + t.getNum());
                System.out.println("제목 : " + t.getTitle());
                System.out.println("내용 : " + t.getContent());
                System.out.println("등록 날짜 : " + cal1.get(Calendar.YEAR) + "." + (cal1.get(Calendar.MONTH) + 1) + "." + cal1.get(Calendar.DAY_OF_MONTH) + " " + cal1.get(Calendar.HOUR) + ":" + cal1.get(Calendar.MINUTE) + ":" + cal1.get(Calendar.SECOND));
                System.out.println("작성자 : " + t.getNickName());
                System.out.println("조회수 :" + t.getViews());
                System.out.println("====================");
                System.out.printf("상세보기 기능을 선택해주세요(1. 댓글 등록, 2. 추천, 3. 수정, 4. 삭제, 5. 목록으로) :");
                int choice = Integer.parseInt(sc.nextLine());
                if (choice == 1) {
                    System.out.printf("댓글 내용 :");
                    String comments = sc.nextLine();
                    for (text t1 : arr) {
                        if (index == t1.getNum()) {
                            com.get(index).setComments(comments);
                        }
                    }
                } else if (choice == 2) {

                } else if (choice == 3) {
                    if (arr.get(index).getNickName().equals(globalNickName)) {
                        System.out.printf("변경할 제목 : ");
                        String upTitle = sc.nextLine();
                        System.out.printf("변경할 내용 : ");
                        String upContent = sc.nextLine();
                        arr.get(index).setTitle(upTitle);
                        arr.get(index).setContent(upContent);
                        System.out.println("수정이 완료 되었습니다.");
                        Calendar cal2 = Calendar.getInstance();
                        cal.set(index, cal2);
                    } else {
                        System.out.println("자신의 게시물만 수정 할 수 있습니다.");
                        continue;
                    }
                } else if (choice == 4) {
                    if (arr.get(index).getNickName().equals(globalNickName)) {
                        System.out.printf("게시물을 삭제하시겠습니까? :");
                        String choose = sc.nextLine();
                        if (choose.equals("예") || choose.equals("yes")) {
                            arr.remove(index);
                            System.out.println("게시물이 삭제되었습니다.");
                        } else if (choose.equals("아니오") || choose.equals("no")) {
                            System.out.println("게시물 삭제가 취소되었습니다.");
                            continue;
                        }
                    } else {
                        System.out.println("자신의 게시물만 삭제 할 수 있습니다.");
                        continue;
                    }

                } else if (choice == 5) {
                    continue;
                }
            } else if (cmd.equals("search")) {
                System.out.printf("검색 키워드를 입력해주세요 :");
                String keyWord = sc.nextLine();
                boolean contains = false;
                for (text t : arr) {
                    if (t.getTitle().contains(keyWord)) {
                        contains = true;
                        System.out.println("번호 : " + t.getNum());
                        System.out.println("제목 : " + t.getTitle());
                    }
                }
                if (!contains) {
                    System.out.println("검색 결과가 없습니다.");
                }

            } else if (cmd.equals("singup")) {
                System.out.println("==== 회원가입을 진행합니다. ====");
                System.out.printf("아이디를 입력해주세요 :");
                String Id = sc.nextLine();
                System.out.printf("비밀번호를 입력해주세요 :");
                String pw = sc.nextLine();
                System.out.printf("닉네임을 입력해주세요 :");
                String nickName = sc.nextLine();
                System.out.println("==== 회원가입이 완료되었습니다. ====");
                PersonId person = new PersonId(Id, pw, nickName);
                int memberShip = person.memberNumber;
                memberShip++;
                person.setMemberNumber(memberShip);
                id.add(person);
            } else if (cmd.equals("login")) {
                if (login == 1) {
                    System.out.println("이미 로그인 되어있습니다.");
                    continue;
                }
                System.out.printf("아이디 :");
                String idin = sc.nextLine();
                System.out.printf("비밀번호 :");
                String pwin = sc.nextLine();
                for (PersonId p1 : id) {
                    if (login == 0) {
                        if (p1.id.equals(idin)) {
                            if (p1.pw.equals(pwin)) {
                                System.out.println(p1.nickName + "님 환영합니다!.");
                                login = 1;
                                globalNickName = p1.getNickName();
                            } else {
                                System.out.println("비밀번호가 틀렸습니다.");
                                continue;
                            }
                        }
                    }
                }
                if (id.size() == 0) {
                    System.out.println("회원정보가 없습니다.\n회원가입을 해주세요.");
                    continue;
                }
            } else if (cmd.equals("logout")) {
                if (login == 0) {
                    System.out.println("로그인이 되어있지 않습니다.");
                    continue;
                } else if (login == 1) {
                    System.out.printf("로그아웃 하시겠습니까? (예 or yes , 아니오 or no) :");
                    String logout = sc.nextLine();
                    if (logout.equals("예") || logout.equals("yes")) {
                        login = 0;
                        System.out.println("로그아웃이 완료되었습니다.");
                    } else if (logout.equals("아니오") || logout.equals("no")) {
                        System.out.println("로그아웃을 취소합니다.");
                        continue;
                    } else {
                        System.out.println("잘못 입력 하셨습니다.");
                        continue;
                    }
                }
            }

        }


    }

    public int findIndexById(int id) {

        for (int i = 0; i < arr.size(); i++) {
            text t1 = arr.get(i);

            if (t1.getNum() == id) {
                return i; // 원하는 것은 찾은 즉시 종료.
            }
        }

        return -1;
    }
}


// 수정사항
// 1. PRIVATE 이용하여 캡슐화 O
//2. Interger.parseInt 할때 문자들어갈경우 예외처리;
//3. 저장되어있는 텍스트 가져와서 직접수정하기.O
//4. 없는번호 예외처리 O