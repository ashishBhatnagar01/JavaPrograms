import java.util.*;
import java.io.*;
public class LeapYear{
    static boolean isLeapYear (int year){
        if(year%400==0){
            return true;
        }
        else if(year%4==0 && year%100!=0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) throws IOException {
        try {

            InputStreamReader obj= new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(obj);
            System.out.print("Please enter a year: ");
            int year = Integer.parseInt(br.readLine());
            System.out.println(isLeapYear(year));

        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
