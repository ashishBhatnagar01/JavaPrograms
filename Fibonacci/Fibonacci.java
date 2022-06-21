import java.io.*;

public class Fibonacci{
    static void seriesGenerator(int terms){
        int t1=0;
        int t2=1;
        int t3=t1+t2;
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        int count = 3;
        while(count<terms){
            t1=t2;
            t2=t3;
            t3=t1+t2;
            System.out.println(t3);
            count++;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("No. of terms in series: ");
        int num = Integer.parseInt(br.readLine());
        seriesGenerator(num);
    }
}