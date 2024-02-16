//import java.util.Scanner;

public class PrimeNum{
     public static void main(String []args){
       // Scanner input = new Scanner(System.in);
        //System.out.println("Please enter n for  prime number <=n  ");

       // int n = input.nextInt();
       int n = 1000000;


        java.util.List<Integer> TheList = new java.util.ArrayList<>();
        int count = 0 ; 
        final  int NumberLine= 10 ;
        int SquareRoot=1;
        int number= 2;


        while(number<= n){

            if(SquareRoot * SquareRoot  < number){SquareRoot++;}
             boolean ThePrime = true;

            for(int i = 0 ;i < TheList.size() && TheList.get(i) <= SquareRoot;i++
            ){
                if(  number % TheList.get(i)== 0){
                    ThePrime = false;
                    break;
                }
            }
            if(ThePrime){
                count++;

              TheList.add(number);

              if (count % NumberLine ==0) 
              {System.out.print(number);

              }else{
                System.out.print( number + " ");
              }
            }
           number++;
        }

        System.out.println(count);
     }
}