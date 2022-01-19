package com.array;

import java.util.*;

public class Robot {
    public static void main(String[] args) {
        //입력
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            sc.nextLine();
            String[][] mat = new String[n][n];
            for (int j = 0; j < n; j++) {
                mat[j] = sc.nextLine().split(" ");
            }
            //계산
            int ans = find(mat);
            System.out.println("#" + (i+1) + " " + ans);
        }

    }

    private static int find(String[][] arr) {
        int n = arr.length;
        int ans=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j].equals("A")) {
                    ans+=move(arr,1, i, j+1);
                } else if (arr[i][j].equals("B")) {
                    ans+=move(arr,1, i, j+1);
                    ans+=move(arr,2, i, j-1);
                } else if (arr[i][j].equals("C")) {
                    ans+=move(arr,1, i, j+1);
                    ans+=move(arr,2, i, j-1);
                    ans+=move(arr,3, i+1, j);
                    ans+=move(arr,4, i-1, j);
                }
            }
        }
        return ans;
    }

    private static int move(String[][] arr,int i, int x, int y) {
        if(i==1){
            if (x<arr.length && x>=0 && y>=0 && y<arr.length && arr[x][y].equals("S")){
                return move(arr,1,x,y+1)+1;
            }
        }else if(i==2){
            if (x<arr.length && x>=0 && y>=0 && y<arr.length && arr[x][y].equals("S")){
                return move(arr,2,x,y-1)+1;
            }
        }else if(i==3){
            if (x<arr.length && x>=0 && y>=0 && y<arr.length && arr[x][y].equals("S")){
                return move(arr,3,x+1,y)+1;
            }
        }else{
            if (x<arr.length && x>=0 && y>=0 && y<arr.length && arr[x][y].equals("S")){
                return move(arr,4,x-1,y)+1;
            }
        }
        return 0;
    }
}
