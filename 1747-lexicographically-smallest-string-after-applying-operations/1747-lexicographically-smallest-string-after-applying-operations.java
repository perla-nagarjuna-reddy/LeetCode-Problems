class Solution {
    public String findLexSmallestString(String s, int a, int b) {
        
        Set<String> seen = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        String smallest = s;

        queue.offer(s);
        seen.add(s);

        int n = s.length();

        while (!queue.isEmpty()) {
            String curr = queue.poll();

            if (curr.compareTo(smallest) < 0) {
                smallest = curr;
            }

            char[] arr = curr.toCharArray();
            for (int i = 1; i < n; i += 2) {
                int digit = arr[i] - '0';
                digit = (digit + a) % 10;
                arr[i] = (char) (digit + '0');
            }
            String addStr = new String(arr);

            if (seen.add(addStr)) {
                queue.offer(addStr);
            }

            String rotateStr = curr.substring(n - b) + curr.substring(0, n - b);
            if (seen.add(rotateStr)) {
                queue.offer(rotateStr);
            }
        }

        return smallest;
    }
}