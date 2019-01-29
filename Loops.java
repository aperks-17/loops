import java.util.Scanner;
/**
 * Write a description of class Loops here.
 *
 * @author (Alex Perkins)
 * @version (a version number or a date)
 */
public class Loops
{
    public static void rootbeer(){
        for(int i=99; i>0; i--){
            System.out.println(i+"bottles of rootbeer on the wall!");
            System.out.println(i+"bottles of rootbeer!");
            System.out.println("Take one down, pass it around");
            System.out.println((i-1)+"bottles of rootbeer on the wall!");
            System.out.println();
        }
    }

    public static void removeVowels(){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a String");
        String word=input.nextLine();
        String noVowels="";
        for(int i=0; i<word.length(); i++){
            char c=word.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            }
            else{
                noVowels+=c;
            }
        }
        System.out.println("The string with novowels is "+noVowels);
    } 

    public static void printAdditionTables(){
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                System.out.print(i+j+"\t");
            }
            System.out.println();
        }
    } 

    public static void factorial(){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number");
        int n=input.nextInt();
        int a=1;
        for(int i=n; i>0; i--){
            a*=i;
        }
        System.out.println(n+"! is "+a);
    } 

    public static void printMenu(){
        int x=-1;
        do{
            System.out.println("0. Quit");
            System.out.println("1. Rootbeer");
            System.out.println("2. Remove Vowels");
            System.out.println("3. Print Addition Tables");
            System.out.println("4. Factorial");
            Scanner input= new Scanner(System.in);
            x=input.nextInt();
            switch(x){
                case 1:
                rootbeer();
                break;
                case 2:
                removeVowels();
                break;
                case 3:
                printAdditionTables();
                break;
                case 4:
                factorial();
                break;
            }
        }while(x!=0);
    }
}

