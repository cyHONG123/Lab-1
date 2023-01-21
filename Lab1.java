import java.util.Arrays;
import java.util.Scanner;
public class Lab1 {
    public boolean isAnagram(String x, String y) {
        String[] xsplit = x.split("");
        String[] ysplit = y.split("");
        if(x.length()!=y.length()){
            return false;
        }
        else{
            Arrays.sort(xsplit);
            Arrays.sort(ysplit);
            boolean key=Arrays.equals(xsplit,ysplit);
            if(key){
                return true;
            }
            return false;

        }
    }


    public boolean isRotation(String x,String y){
        if(x.length()!=y.length()){
            return false;
        }
        else{
            String temp=x+x;
            if(!temp.contains(y)){
                return false;
            }
            else {
                return true;
            }
        }

    }



    public static void main(String[]args){
          Scanner abc = new Scanner(System.in);
          System.out.println("Check Anagram? Enter 1   Check Rotation? Enter 2");
          int which = abc.nextInt();

          if (which == 1) {
              System.out.println("You choose Anagram classification program, enter two Strings");
              String k = abc.next();
              String h = abc.next();
              Lab1 test = new Lab1();
              if (test.isAnagram(k, h)){
                  System.out.println("true");
              }
              else{
                    System.out.println("false");
              }
          }
          else if (which == 2) {
              System.out.println("You choose rotation classification program, enter two Strings");
              String k = abc.next();
              String h = abc.next();
              Lab1 test2=new Lab1();
              if (test2.isRotation(k, h)){
                  System.out.println("true");
              }
              else{
                  System.out.println("false");
              }
          }
          else {
              System.out.println("Unknown input");
          }
    }

}
