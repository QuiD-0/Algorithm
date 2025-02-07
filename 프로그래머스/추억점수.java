import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            map.putIfAbsent(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            String[] score = photo[i];
            int sum = 0;
            for (String s : score) {
                sum += map.getOrDefault(s, 0);
            }
            answer[i] = sum;
        }

        return answer;
    }
}