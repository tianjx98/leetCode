package util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        dfs(0, 0);
        System.out.println(total);
    }

    private static int total = 0;

    private static void dfs(int type, int count) {
        if (count > 13) return;
        if (type == 13) {
            if (count == 13)
                total++;
            return;
        }
        for (int i = 0; i < 5; i++) {
            dfs(type + 1, count + i);
        }
    }

}
