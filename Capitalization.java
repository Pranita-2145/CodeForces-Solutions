
// Que 281A Capatalization

import java.util.*;



public class Main {


    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         StringBuilder sb = new StringBuilder();
         String input = sc.nextLine();
         char[] c = input.toCharArray();
         for(int i=0; i<c.length; i++){
            if(i==0){
                c[i]=Character.toUpperCase(c[i]);
                sb.append(c[i]);
            }
            else{
                sb.append(c[i]);
            }


    }
    System.out.println(sb);
    sc.close();
}
}
