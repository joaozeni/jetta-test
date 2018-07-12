package com.jetta;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

final class Box{
    public int qtd;
    public double width;
    public double lenght;
    public double height;

    public Box(int p_qtd, double p_width, double p_lenght, double p_height) {
        qtd = p_qtd;
        width = p_width;
        lenght = p_lenght;
        height = p_height;
    }
}

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

    public static int [][] getBoxMax(Box[] boxData, Box containerData){
        int[] boxMaxsWidth = new int[boxData.length];
        int[] boxMaxsLenght = new int[boxData.length];
        int arrayLength = boxData.length;
        for(int i=0; i<arrayLength; i++){
            boxMaxsWidth[i] = (int) (containerData.width/boxData[i].width);
            boxMaxsLenght[i] = (int) (containerData.lenght/boxData[i].lenght);
        }
        int[][] returnData = new int[][] {boxMaxsWidth, boxMaxsLenght};
        System.out.println("Widths: "+Arrays.toString(boxMaxsWidth)+" Lenght: "+Arrays.toString(boxMaxsLenght));
        return returnData;
    }
}
