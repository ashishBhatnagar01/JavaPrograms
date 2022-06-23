import java.io.*;
import java.util.Scanner;

public class Transpose{
    public static void InputMatrix(int r, int c){
        Scanner sc = new Scanner(System.in);
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        TransposeMat(arr,r,c);
    }
    public static void TransposeMat(int matrix[][],int r, int c){
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.print(matrix[j][i]+"  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int r= sc.nextInt();
        System.out.println("Enter no. of columns");
        int c =sc.nextInt();
        int matrix[][]=new int[r][c];
        InputMatrix(r,c);
    }
}