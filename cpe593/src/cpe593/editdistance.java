package cpe593;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class editdistance {
	public static String loadFile(String name) {
		Scanner s = null;
		String a;
		try {
			s = new Scanner(new FileReader(name));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		s.useDelimiter("\\Z");
		a = s.next();
		s.close();
		return a;
	}
	public static int editdis(String a, String b) {
		int x = a.length();
        int y = b.length();
        int[][]  num = new int[x + 1][y + 1];
        for(int i = 0; i <= x; i++) 
            num[i][0] = i;
        for(int i = 0; i <= y; i++) 
            num[0][i] = i;
        for(int i = 1; i <= x; i++) { 
            for(int j = 1; j <= y; j++) {
                if(a.charAt(i - 1) == b.charAt(j - 1))
                    num[i][j] = num[i - 1][j - 1];
                else num[i][j] = Math.min(num[i - 1][j - 1], Math.min(num[i - 1][j],num[i][j - 1])) + 1;
            }
        }
        
     return num[x][y];
        
    }
	public static void main(String[] args) {
		String a = loadFile(args[0]);
		String b = loadFile(args[1]);
		System.out.println(editdis(a, b)); 
	}
}
