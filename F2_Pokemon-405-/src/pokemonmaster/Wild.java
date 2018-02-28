package pokemonmaster;

import java.util.Random;
import java.util.Scanner;


public class Wild {
    private Scanner commandScanner;
    private static double oppo;
    private Inventory inventory;
    
    public Wild(Inventory inventory){
                this.inventory = inventory;
		commandScanner = new Scanner(System.in);
	}
    
    public void catchPokemon (){
        System.out.print("BUT FRIST !  Choose your Pokemon. (PokeBall | GreatBall | UltraBall) : ");
                String type = commandScanner.next();
                
                    if(type.equals("PokeBall")){
                        oppo=0.8;              
                    }
                    else if(type.equals("GreatBall")){
                        oppo=0.9;
                    }
                    else if(type.equals("UltraBall")){
                        oppo=1.0;                
                    }
                
                Ball ball = new Ball(oppo);
                System.out.println("          -          ");
                System.out.println("          -          ");
                System.out.println("          -          ");
                System.out.println("          -          ");
                System.out.println("==========================================");
                System.out.println("We found Pokemon !!  'CATCH IT !' ");
                System.out.println("==========================================");
                System.out.print("\n");
                Random random = new Random();
                int randomInt = random.nextInt(3);
                
                    if(randomInt == 0){
                        System.out.println("------- Found Zubat -------");
                        System.out.print("Catch or Ignore : ");
                        String ans = commandScanner.next();
                            if(ans.equals("Catch")){
                                double mood = (double)Math.random();
                                double chance = mood*ball.ForCompare();
                                
                                float weight = 10f;
                                float stepLength = 5f;
                                
                                if(chance>=0.5){
                                    System.out.println("Congratulations ! You caught the wind Zubat.");
                                    System.out.print("Enter Name : ");
                                    String name = commandScanner.next();
                                    Zubat bat = new Zubat(name, weight, stepLength);
                                    inventory.addWindPokemon(bat);
                                    System.out.print("Pokemon has been added to inventory.");
                                }
                                else{
                                    System.out.println("-- IT ESCAPED ! try again --");
                                    System.out.println("==========================================");
                                }   
                            }
                            else{
                                System.out.println("-- IT ESCAPED ! try again --");
                                System.out.println("==========================================");
                            }
                    }
                    else if(randomInt == 1){
                        System.out.println("------- Found Pikachu ------- ");
                        System.out.print("Catch or Ignore : ");
                        String ans1 = commandScanner.next();
                            if(ans1.equals("Catch")){
                                double mood = (double)Math.random();
                                double chance = mood*ball.ForCompare();
                                
                                float weight = 10f;
                                float stepLength = 5f;
                                
                                if(chance>=0.5){
                                    System.out.println("Congratulations ! You caught the wind Pikachu.");
                                    System.out.print("Enter Name : ");
                                    String name = commandScanner.next();
                                    Pikachu pika = new Pikachu(name, weight, stepLength);
                                    inventory.addWindPokemon(pika);
                                    System.out.print("Pokemon has been added to inventory.");
                                }
                                else{
                                    System.out.println("-- IT ESCAPED ! try again --");
                                    System.out.println("==========================================");
                                }
                            }
                            else{
                                System.out.println("-- IT ESCAPED ! try again --");
                                System.out.println("==========================================");
                            }
                    }        
                    else if(randomInt == 2){
                        System.out.println("------- Found Diglett -------");
                        System.out.print("Catch or Ignore : ");
                        String ans2 = commandScanner.next();
                            if(ans2.equals("Catch")){
                                double mood = (double)Math.random();
                                double chance = mood*ball.ForCompare();
                                
                                float weight = 10f;
                                float stepLength = 5f;
                                
                                if(chance>=0.5){
                                    System.out.println("Congratulations ! You caught the wind Diglett.");
                                    System.out.print("Enter Name : ");
                                    String name = commandScanner.next();
                                    Diglett dig = new Diglett(name, weight, stepLength);
                                    inventory.addWindPokemon(dig);
                                    System.out.print("Pokemon has been added to inventory.");
                                }
                                else{
                                    System.out.println("-- IT ESCAPED ! try again --");
                                    System.out.println("==========================================");
                                }
                            }
                            else{
                                System.out.println("-- IT ESCAPED ! try again --");
                                System.out.println("==========================================");
                            }
                    }        
                
        
    }
    
}
