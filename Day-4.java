import java.util.Scanner;
public class Findquadrant{
 public static void main(String[] args){
 Scanner get = new Scanner(System.in);
 System.out.println("Enter the value of a");
 int a = get.nextInt();

 System.out.println("Enter the value of b");
 int b = get.nextInt();

 if(a>0 && b>0){
     System.out.println("this point is first qudrant");
}

else if(a<0 && b>0){
     System.out.println("this point is second qudrant");

}

else if(a<0 && b<0){
     System.out.println("this point is third qudrant");

}
else if(a>0 && b<0){
     System.out.println("this point is fourth qudrant");

}

else{
System.out.println("This points lies in origin");
}


 
 
}
}