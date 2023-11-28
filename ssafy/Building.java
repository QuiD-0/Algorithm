package com.array;

import java.util.Scanner;

public class Building {
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
            System.out.println("#" + (i + 1) + " " + ans);
        }

    }

    private static int find(String[][] mat) {
        int n = mat.length;
        int[][] d = {{0, 1}, {0, -1}, {1, 0}, {1, 1}, {1, -1}, {-1, 1}, {-1, 0}, {-1, -1}};
        int max = 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(mat[i][j].equals("B")){
                    boolean flag=true;
                    for(int k=0;k<8;k++){
                        int dx = i+d[k][0];
                        int dy = j+d[k][1];
                        if(dx>=0 && dx<n && dy>=0 && dy<n && mat[dx][dy].equals("G")){
                            flag=false;
                            break;
                        }
                    }
                    if(flag){
                        int building = 0;
                        for(int k=0;k<n;k++){
                            if(mat[i][k].equals("B")){
                                building++;
                            }
                            if(mat[k][j].equals("B")){
                                building++;
                            }
                        }
                        if(max<building){
                            max=building-1;
                        }
                    }
                }

            }
        }

        return max;
    }
}
