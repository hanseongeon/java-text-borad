//package org.example;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Scanner;
//
////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        // 반복 횟수 정할 수 없음 -> 무한 반복 구조
//        ArrayList<text> arr = new ArrayList<>();
//        int Textnumber =0;
//        while(true){ // 반복 조건이 true이기 떄문에 무한 반복
//            System.out.printf("명령어 : ");
//            String cmd = sc.nextLine();
//
//            if(cmd.equals("exit")) { // 숫자가 아닌 경우 닽다라는 표현을 할 때 == 이 아닌 .equals()를 사용해야 한다.
//                System.out.println("프로그램을 종료합니다.");
//                break;
//            }else if(cmd.equals("add")){
//                text t1 = new text();
//                System.out.printf("게시물 제목을 입력해주세요 : ");
//                String title = sc.nextLine();
//                t1.title = title;
//                System.out.printf("게시물 내용을 입력해주세요 : ");
//                String content = sc.nextLine();
//                t1.content = content;
//                Textnumber++;
//                t1.num = Textnumber;
//                arr.add(t1);
//                System.out.println("게시물이 저장 되었습니다.");
//            }else if(cmd.equals("list")){
//                for(text t1 : arr){
//                    System.out.println("===========");
//                    System.out.println("번호 : "+t1.num);
//                    System.out.println("제목 : "+t1.title);
//                    System.out.println("===========");
//                }
//            }else if(cmd.equals("update")){
//                System.out.printf("수정할 게시물 번호 : ");
//                String num = sc.nextLine();
//                int num1 = Integer.parseInt(num);
//                num1-=1;
//                if(num1 >= arr.size()){
//                    System.out.println("없는 게시물 번호입니다.");
//                    continue;
//                }
//                System.out.printf("변경할 제목 : ");
//                String upTitle = sc.nextLine();
//                System.out.printf("변경할 내용 : ");
//                String upContent = sc.nextLine();
//                text t = new text();
//                t.title = upTitle;
//                t.content = upContent;
//                t.num = num1+1;
//                arr.set(num1,t);
//                System.out.println("수정이 완료 되었습니다.");
//            }else if(cmd.equals("delete")){
//                System.out.printf("삭제할 게시물 번호 : ");
//                String num = sc.nextLine();
//                int num1 = Integer.parseInt(num);
//                num1-=1;
//                if(num1 >= arr.size()){
//                    System.out.println("없는 게시물 번호입니다.");
//                    continue;
//                }
//                arr.remove(num1);
//                System.out.println("삭제가 완료 되었습니다.");
//                for(text t : arr){
//                    if(t.num > num1+1){
//                        t.num-=1;
//                    }
//                }
//            }else if(cmd.equals("detail")){
//                System.out.printf("상세보기 할 게시물 번호를 입력해주세요 :");
//                String num = sc.nextLine();
//                int num1 = Integer.parseInt(num);
//                num1-=1;
//                if(num1 >= arr.size()){
//                    System.out.println("없는 게시물 번호입니다.");
//                    continue;
//                }
//                text t = new text();
//                t = arr.get(num1);
//                System.out.println("===========");
//                System.out.println("번호 : "+t.num);
//                System.out.println("제목 : "+t.title);
//                System.out.println("내용 : "+t.content);
//            }
//
//
//        }
//
//        // 1. 반복문 제어 하던 방법 : 반복 횟수 세서 특정 횟수 지나면 탈출
//        // 2. break문을 사용하여 강제 탈출 가능
//    }
//}
//class text{
//    String title;
//    String content;
//
//    int num;
//}