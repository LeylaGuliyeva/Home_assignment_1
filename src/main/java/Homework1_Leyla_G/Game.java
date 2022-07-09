package Homework1_Leyla_G;
import java.util.Random;
import java.util.Scanner;

public class Game {
    static void game_with_random(){
        while(true){
        int counter=0;
        System.out.println("Let the game begin!");
        String name;
        Scanner sn=new Scanner(System.in);
        System.out.print("Please enter your name : ");
        name=sn.nextLine();
        Random rndm_num=new Random();
        int target_number=rndm_num.nextInt(101);
        int array[];
        array=new int[1000];
        while(true){
            int guess;
            while(true){
                System.out.print("Please enter your guess : ");
                Scanner sn_n=new Scanner(System.in);
                if(sn_n.hasNextInt()){
                    guess=sn_n.nextInt();
                    array[counter]=guess;
                    counter+=1;
                    break;
                }
                else{
                    System.out.println("Please enter a valid number!");}
            }
            if(guess==target_number){
                System.out.println("Congratulations, "+name+"!");
                int arraycopied[];
                arraycopied=new int[counter];
                for(int i=0;i<counter;i++){
                    arraycopied[i]=array[i];}
                int temp = 0;
                for(int k=0;k<counter;k++){
                    for(int j=1;j<(counter-k); j++){
                        if(arraycopied[j-1]>arraycopied[j]){
                            temp=arraycopied[j-1];
                            arraycopied[j-1]=arraycopied[j];
                            arraycopied[j]=temp;
                        }}}
                System.out.print("Your nums : ");
                for(int i=0;i<counter;i++){
                    System.out.print(arraycopied[i]+" ");}
                System.out.println("\n");
                break;
            }
            else if(guess>target_number){
                System.out.println("Your number is too big. Please, try again.");

            }
            else if(guess<target_number) {
                System.out.println("Your number is too small. Please, try again.");
            }
        }}}
    static void game_with_wk_days(){
        while(true){
            String arr[][]={{"1945","1957","1896"},{"What is the year of dropping of Atom Bombs on Hiroshima and Nagasaki","What is the year of launch of Sputnik 1","What is the year of first modern Olympic Games held at Athens"}};
            int counter=0;
            System.out.println("Let the game begin!");
            String name;
            Scanner sn=new Scanner(System.in);
            System.out.print("Please enter your name : ");
            name=sn.nextLine();
            Random rndm_num=new Random();
            int target_number=Integer.parseInt(arr[0][rndm_num.nextInt(3)]);
            int array[];
            array=new int[1000];
            System.out.println(arr[1][rndm_num.nextInt(3)]);
            while(true){
                int guess;
                while(true){
                    System.out.print("Please enter your guess : ");
                    Scanner sn_n=new Scanner(System.in);
                    if(sn_n.hasNextInt()){
                        guess=sn_n.nextInt();
                        array[counter]=guess;
                        counter+=1;
                        break;
                    }
                    else{
                        System.out.println("Please enter a valid number!");}
                }
                if(guess==target_number){
                    System.out.println("Congratulations, "+name+"!");
                    int arraycopied[];
                    arraycopied=new int[counter];
                    for(int i=0;i<counter;i++){
                        arraycopied[i]=array[i];}
                    int temp = 0;
                    for(int k=0;k<counter;k++){
                        for(int j=1;j<(counter-k); j++){
                            if(arraycopied[j-1]>arraycopied[j]){
                                temp=arraycopied[j-1];
                                arraycopied[j-1]=arraycopied[j];
                                arraycopied[j]=temp;
                            }}}
                    System.out.print("Your nums : ");
                    for(int i=0;i<counter;i++){
                        System.out.print(arraycopied[i]+" ");}
                    System.out.println("\n");
                    break;
                }
                else if(guess>target_number){
                    System.out.println("Your number is too big. Please, try again.");

                }
                else if(guess<target_number) {
                    System.out.println("Your number is too small. Please, try again.");
                }
            }}

    }
    public static void main(String[] arg){
        //game_with_random();
        game_with_wk_days();

}}
