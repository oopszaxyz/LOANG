import java.io.*;
import java.util.*;



public class Pokemon{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your name : ");
        String Name = sc.next();
        System.out.println("-------------------------------");
        System.out.println("  Hi "+Name+" , Welcome Newble!!");
        System.out.println("-------------------------------");
        System.out.println(Name+" , Please select your basic POKEMON");
        SelectedPoke pick;
        Pickachu Enter_1;
        Turtle Enter_2;
        Bird Enter_3;
        System.out.println("Enter 1 ,if you want to select Pickachu");
        System.out.println("Enter 2 ,if you want to select Turtle");
        System.out.println("Enter 3 ,if you want to select Bird");
        System.out.print("You Choose : ");
        int ChoosePoke = sc.nextInt();
        if(ChoosePoke == 1)
            pick = Enter_1;
        else if(ChoosePoke == 2)
            pick = Enter_2;
        else if(ChoosePoke == 3)
            pick = Enter_3;
        else
            System.out.println("Please Enter Only 1 2 3 !!");
        System.out.printf("You Choose : %s\n",pick.PokeName);
        System.out.println("----- POKEMON Detail -----");
        System.out.printf("HP : %d          SP : %d\n",pick.HP,pick.SP);
        System.out.printf("ATK : %d         DEF : %d\n ",pick.Atk,pick.Def);
    }
}