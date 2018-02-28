package pokemonmaster;

import java.util.Random;
import java.util.*;
import java.io.*;

class CommandPanel{
	private Farm farm;
        private Inventory inventory;
        private Wild wild;
	private Scanner commandScanner;
	private boolean isRunning;
        

	public CommandPanel(Farm farm,Inventory inventory, Wild wild){
		this.farm = farm;
                this.inventory = inventory;
                this.wild = wild;
		commandScanner = new Scanner(System.in);
	}
       

 

	public void run(){
		isRunning = true;
		String command;
                System.out.println("=======================================");
		System.out.println("||   Hello Welcome To Pokemon Game   ||");
                System.out.println("=======================================");
		while(isRunning){
                        System.out.println("======================================================================================");
			System.out.print("\nWhat do you want?  ");
                        System.out.print("(add | feed | exercise | list | quit | catch) Enter HEAR -> : ");
			command = commandScanner.next();
                        System.out.println("======================================================================================");
                        System.out.println("                    ");
			
			if(command.equals("quit")){
				isRunning = false;
				System.out.println("Good bye, See you next time.");
                                System.out.println("==========================================");
			}
			else if(command.equals("add"))
				this.addPokemon();
			else if(command.equals("list")){
                                this.listPokemons();
                                System.out.print("\n");
                                this.listWindPokemon();
                        }
				
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
    
                System.out.print("Enter (Pikachu,Zubat,Diglett) Type: ");
                String pokemonType = commandScanner.next();
                
            if(pokemonType.equals("Zubat")||pokemonType.equals("Pikachu")||pokemonType.equals("Diglett")){
                   
                System.out.print("Enter Name : ");
                String name = commandScanner.next();     
		float weight = 10f;
		float stepLength = 5f;

		if(pokemonType.equals("Pikachu")){
			Pikachu pika = new Pikachu(name, weight, stepLength);
			farm.addPokemon(pika);
                        System.out.println("Success !!");
                        System.out.println("==========================================");
		}
                
                else if(pokemonType.equals("Zubat")){
			Zubat bat = new Zubat(name, weight, stepLength);
			farm.addPokemon(bat);
                        System.out.println("Success !!");
                        System.out.println("==========================================");
		}
                
                else if(pokemonType.equals("Diglett")){
			Diglett dig = new Diglett(name, weight, stepLength);
			farm.addPokemon(dig);
                        System.out.println("Success !!");
                        System.out.println("==========================================");
		}
                else{
                        System.out.println("I don't understand Please try again");
                        System.out.println("==========================================");  
                }
            }
            
            else{
                System.out.println("No Pokemon Type  TRY AGAIN");
                System.out.print("\n");
                this.addPokemon();
            }
            
          
	}

	private void listPokemons(){
		System.out.println("==========================================");
		System.out.println("Farm Pokemon List");
		System.out.println("==========================================");
		this.farm.list();
		System.out.println("==========================================");
	}
        
        private void listWindPokemon(){
                System.out.println("==========================================");
		System.out.println("Wind Pokemon List");
		System.out.println("==========================================");
		this.inventory.windList();
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
                this.wild.catchPokemon();
       
        }
}


