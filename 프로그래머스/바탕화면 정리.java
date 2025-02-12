static class Solution {
    public int[] solution(String[] wallpaper) {
        int lx = Integer.MAX_VALUE;
        int ly = Integer.MAX_VALUE;
        int rx = Integer.MIN_VALUE;
        int ry = Integer.MIN_VALUE;
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[0].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    lx = Integer.min(lx, i);
                    ly = Integer.min(ly, j);
                    rx = Integer.max(rx, i + 1);
                    ry = Integer.max(ry, j + 1);
                }
            }
        }
        int[] answer = {lx, ly, rx, ry};
        return answer;
    }
}
