import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class no7Glab4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);

        StringTokenizer st = new StringTokenizer(br.readLine());

        HashSet<String> set = new HashSet<>();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        ArrayList<String> list = new ArrayList<>();

        // READ INPUT POSITIONS
        for (int i = 0; i < k; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            String x = st2.nextToken();
            String y = st2.nextToken();

            String pos = x + " " + y;

            set.add(pos);      // HashSet
            list.add(pos);     // ArrayList for later use
        }

        boolean answerFound = false; // <-- will track if YES is printed

        // PROCESS EACH POSITION
        for (int i = 0; i < k && !answerFound; i++) {
            String[] parts = list.get(i).split(" ");
            int x = Integer.parseInt(parts[0]);
            int y = Integer.parseInt(parts[1]);

            // Knight moves
            int[] dx = { 2, 2, -2, -2, 1, 1, -1, -1 };
            int[] dy = { 1, -1, 1, -1, 2, -2, 2, -2 };

            // check all 8 moves
            for (int j = 0; j < 8; j++) {
                int nx = x + dx[j];
                int ny = y + dy[j];

                // boundary check
                if (nx > 0 && nx <= n && ny > 0 && ny <= n) {
                    String pos = nx + " " + ny;
                    if (set.contains(pos)) {
                        System.out.println("YES");
                        answerFound = true; // mark found to break both loops
                        break; // break inner loop
                    }
                }
            }
        }

        if (!answerFound) { // if never found
            System.out.println("NO");
        }
    }
}
