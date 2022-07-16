import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int mat, che, bio, eng, hist, phy;
         Scanner input = new Scanner(System.in);
         System.out.println("enter the course grade:");
         mat = input.nextInt();
         System.out.println(mat);
         che = input.nextInt();
         System.out.println(che);
         bio = input.nextInt();
         System.out.println(bio);
         eng = input.nextInt();
         System.out.println(eng);
         hist = input.nextInt();
         System.out.println(hist);
         phy = input.nextInt();
         System.out.println(phy);

         double average = ((mat+che+bio+eng+hist+phy)/6.0);
         System.out.println("average grade is " + average);



    }

}