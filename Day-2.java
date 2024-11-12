import java.util.Scanner;
 public class CheckVowel{
 
 public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
  System.out.println("enter a character");
  char val = scan.next().charAt(0);

 if(val =='a' || val =='e' || val =='i' || val =='o' || val =='u' || val =='A' || val =='E' || val =='I' || val =='O' || val =='U' ){
  System.out.println( val + " is vowel");
}
 else if((val>= 'a' && val>='z') || (val>= 'A' && val>='Z')){
 
 System.out.println( val + " is consonant");
}

else{
  System.out.println( val + " is invalid");

}

}
}