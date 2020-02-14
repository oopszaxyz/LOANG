import java.io.*;
import java.util.*;




public class Pokemon{
    public static void main(final String[] args) {
        YourPoke UrPoke = new YourPoke(null, 0, 0, 0, 0, 0, 0);
        String Name = "";
        int ChoosePoke;
        Name = GameStart();
        ChoosePoke = SelectPoke(Name);
        UrPoke = setYourPoke(ChoosePoke);
        ShowDetail(UrPoke);
        
    }

    public static String GameStart() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your name : ");
        String Name = sc.next();
        System.out.println("-------------------------------");
        System.out.println("  Hi "+Name+" , Welcome Newble!!");
        System.out.println("-------------------------------");
        return Name;
    }

    public static int SelectPoke (String Name){
        while(true){
        Scanner pick = new Scanner(System.in);
        System.out.println(Name+" , Please select your basic POKEMON");
        System.out.println("Enter 1 ,if you want to select Pickachu");
        System.out.println("Enter 2 ,if you want to select Turtle");
        System.out.println("Enter 3 ,if you want to select Bird");
        System.out.print("You Choose : ");
        int ChoosePoke = pick.nextInt();
        
        if(ChoosePoke >= 1 && ChoosePoke <= 3)
            return ChoosePoke;
        else{
            System.out.println("Please Enter Only Number 1 2 3 !!");
            continue;
        }
        }
    }

    public static YourPoke setYourPoke(int ChoosePoke){
        YourPoke Poke = new YourPoke(null, 0, 0, 0, 0, 0, 0);
        if(ChoosePoke == 1){
            Poke.PokeName = "Pickachu" ;
            Poke.Level = 1;
            Poke.HP = 50;
            Poke.SP = 20;
            Poke.Atk = 7;
            Poke.Def = 3;
            Poke.Skill = 10;
        }
        else if(ChoosePoke == 2){
            Poke.PokeName = "Turtle" ;
            Poke.Level = 1;
            Poke.HP = 70;
            Poke.SP = 20;
            Poke.Atk = 5;
            Poke.Def = 5;
            Poke.Skill = 8;
        }
        else if(ChoosePoke == 3){
            Poke.PokeName = "Bird" ;
            Poke.Level = 1;
            Poke.HP = 60;
            Poke.SP = 30;
            Poke.Atk = 6;
            Poke.Def = 3;
            Poke.Skill = 9;
        }
        return Poke;
    }

    public static void ShowDetail(YourPoke urPoke){
        
        System.out.printf("You Pick a POKEMON Name : %s\n",urPoke.PokeName);
        System.out.println("----- POKEMON Detail -----");
        System.out.printf("HP : %d          SP : %d\n",urPoke.HP,urPoke.SP);
        System.out.printf("ATK : %d         DEF : %d\n ",urPoke.Atk,urPoke.Def);
         
    }


}

