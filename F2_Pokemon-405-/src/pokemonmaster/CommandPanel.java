package pokemonmaster;

import java.util.Random;
import java.util.*;
import java.io.*;

class CommandPanel{
	private Farm farm;
	private Scanner commandScanner;
	private boolean isRunning;

	public CommandPanel(Farm farm){
		this.farm = farm;
		commandScanner = new Scanner(System.in);
	}

	public void run(){
		isRunning = true;
		String command;

		System.out.println("Hello Pokemon Game");
		while(isRunning){
			System.out.print("\nWhat do you want?  ");
                        System.out.print("(add, feed, exercise, list, quit, catch) Type:");
			command = commandScanner.next();
                        System.out.println("==========================================");
			
			if(command.equals("quit")){
				isRunning = false;
				System.out.println("Good bye, See you next time.");
                                System.out.println("==========================================");
			}
			else if(command.equals("add"))
				this.addPokemon();
			else if(command.equals("list"))
				this.listPokemons();
			else if(command.equals("feed"))
				this.feedPokemons();
                        else if(command.equals("exercise"))
				this.exercisePokemons();
                        else if(command.equals("catch"))
                                this.catchPokemons();
                        else{
                            System.out.println("I don't understand Please try again");
                            System.out.println("==========================================");
                        }
		}

	}

	private void addPokemon(){
          
                System.out.print("Enter (Pikachu,Golbat,Diglett) Type:");
                String pokemonType;
                pokemonType = commandScanner.next();
		String name;
                System.out.println("Enter Name");
                name = commandScanner.next();
                
		float weight = 10f;
		float stepLength = 5f;

		if(pokemonType.equals("Pikachu")){
			Pikachu pika = new Pikachu(name, weight, stepLength);
			farm.addPokemon(pika);
		}
                
                else if(pokemonType.equals("Zubat")){
			Zubat bat = new Zubat(name, weight, stepLength);
			farm.addPokemon(bat);
		}
                
                else if(pokemonType.equals("Diglett")){
			Diglett dig = new Diglett(name, weight, stepLength);
			farm.addPokemon(dig);
		}
                else{
                        System.out.println("I don't understand Please try again");
                        System.out.println("==========================================");  
                }
                
                
	}

	private void listPokemons(){
		System.out.println("==========================================");
		System.out.println("Pokemon List");
		System.out.println("==========================================");
		this.farm.list();
		System.out.println("==========================================");
	}

	private void feedPokemons(){
		System.out.print("Which pokemon do you want to feed? ");
		String name = this.commandScanner.next();
		this.farm.feed(name);
		
	}
        
        private void exercisePokemons(){
                System.out.print("Which pokemon do you want to exercise? ");
		String name = this.commandScanner.next();
		this.farm.exercise(name);
		
                
        }
        
        private void catchPokemons(){
            
                double oppo = 0;
                System.out.println("Choose your Pokemon. (PokeBall | GreatBall | UltraBall) ");
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
                
                double c = oppo;
                Ball ball = new Ball(oppo);
                
                System.out.println("We found Pokemon !!  'CATCH IT !' ");
                Random random = new Random();
                int randomInt = random.nextInt(3);
                
                    if(randomInt == 0){
                        System.out.println("found Zubat ");
                        System.out.println("catch or ignore");
                        String ans = commandScanner.next();
                            if(ans.equals("catch")){
                                double mood = (double)Math.random();
                                double chance = mood*ball.ForCompare();
                                if(chance>=0.5)
                                
                            }
                    }
                    else if(randomInt == 1){
                        System.out.println("found Pikachu ");
                    }
                    else if(randomInt == 2){
                        System.out.println("found Diglett ");
                    }
                
                
		
                
        }

}

