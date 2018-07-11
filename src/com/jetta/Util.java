package com.jetta;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Util {

    public static void fibonacci(int n){
        int f[] = new int[n+1];
        int i;
        f[0] = 0;
        f[1] = 1;
        for (i = 2; i <= n; i++){
            f[i] = f[i-1] + f[i-2];
        }
        Path file = Paths.get("fibonacci.txt");
        List<String> lines = Arrays.asList(Arrays.toString(f));
        try {
            Files.write(file, lines, Charset.forName("UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(f));
    }
}
