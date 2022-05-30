import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{10, 40, 30, 20}, 20));
    }

    public static int solution(int[] numbers, int K) {
        int[] check = numbers.clone();
        Arrays.sort(check);
        for (int i = 0; i < check.length - 1; i++) {
            if (Math.abs(check[i] - check[i + 1]) >= K) {
                return -1;
            }
        }
        return minSwaps(numbers, K);
    }


    public static int minSwaps(int[] arr, int N) {
        int ans = 0;
        int[] temp = Arrays.copyOfRange(arr, 0, N);
        Arrays.sort(temp);
        for (int i = 0; i < N; i++) {

            // This is checking whether
            // the current element is
            // at the right place or not
            if (arr[i] != temp[i]) {
                ans++;

                // Swap the current element
                // with the right index
                // so that arr[0] to arr[i] is sorted
                swap(arr, i, indexOf(arr, temp[i]));
            }
        }
        return ans;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int indexOf(int[] arr, int ele) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                return i;
            }
        }
        return -1;
    }

//    private static int findMin(int[] arr, int k) {
//        int count = 0;
//        int n = arr.length;
//        for (int i = 0; i < n; ++i)
//            if (arr[i] <= k)
//                ++count;
//
//        int bad = 0;
//        for (int i = 0; i < count; ++i)
//            if (arr[i] > k)
//                ++bad;
//
//        int ans = bad;
//        for (int i = 0, j = count; j < n; ++i, ++j) {
//
//            if (arr[i] > k)
//                --bad;
//
//            if (arr[j] > k)
//                ++bad;
//            ans = Math.min(ans, bad);
//        }
//        return ans;
//    }
//
//    private static int[] find_min_max(int[] numbers, int K) {
//        int min = Integer.MAX_VALUE;
//        int min_idx = 0;
//        int max = Integer.MIN_VALUE;
//        int max_idx = 0;
//        for (int i = 0; i < numbers.length - 1; i++) {
//            int delta = Math.abs(numbers[i] - numbers[i + 1]);
//            if (delta > max) {
//                max = delta;
//                max_idx = i;
//            } else if (delta < min) {
//                min = delta;
//                min_idx = i;
//            }
//        }
//        if (max > K) {
//            return new int[]{min_idx + 1, max_idx + 1};
//        }
//        return new int[]{-1, -1};
//    }
//
//    static String[] new_s;
//
//    public static int solution(String s) {
//        new_s = s.split("");
//        int value = find(s);
//        String found = "";
//        switch (value) {
//            case 0:
//                found = ")";
//                break;
//            case 1:
//                found = "]";
//                break;
//            case 2:
//                found = "}";
//                break;
//            case 3:
//                found = "(";
//                break;
//            case 4:
//                found = "[";
//                break;
//            case 5:
//                found = "{";
//                break;
//        }
//        int answer = 0;
//        for (int i = 0; i < new_s.length + 1; i++) {
//            StringBuffer sb = new StringBuffer();
//            sb.append(s);
//            sb.insert(i, found);
//            answer += check(sb.toString());
//        }
//        return answer;
//    }
//
//    private static int check(String sb) {
//        Stack<Character> stack = new Stack();
//        for (char str : sb.toCharArray()) {
//            switch (str) {
//                case '(':
//                case '{':
//                case '[':
//                    stack.push(str);
//                    break;
//                case ')':
//                    if (stack.isEmpty() || stack.pop() != '(') {
//                        return 0;
//                    }
//                    break;
//                case '}':
//                    if (stack.isEmpty() || stack.pop() != '{') {
//                        return 0;
//                    }
//                    break;
//                case ']':
//                    if (stack.isEmpty() || stack.pop() != '[') {
//                        return 0;
//                    }
//                    break;
//            }
//        }
//        return 1;
//    }
//
//    private static int find(String s) {
//        int small = 0;
//        int middle = 0;
//        int big = 0;
//        for (int i = 0; i < new_s.length; i++) {
//            switch (new_s[i]) {
//                case "{":
//                    big++;
//                    break;
//                case "[":
//                    middle++;
//                    break;
//                case "(":
//                    small++;
//                    break;
//                case "}":
//                    big--;
//                    break;
//                case "]":
//                    middle--;
//                    break;
//                case ")":
//                    small--;
//                    break;
//            }
//        }
//        if (small != 0) {
//            return s.chars().filter(c -> c == '(').count() > s.chars().filter(c -> c == ')').count() ? 0 : 3;
//        } else if (middle != 0) {
//            return s.chars().filter(c -> c == '[').count() > s.chars().filter(c -> c == ']').count() ? 1 : 4;
//        } else {
//            return s.chars().filter(c -> c == '{').count() > s.chars().filter(c -> c == '}').count() ? 2 : 5;
//        }
//    }
}