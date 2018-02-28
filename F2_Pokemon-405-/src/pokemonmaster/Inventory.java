package pokemonmaster;

import java.util.ArrayList;


public class Inventory {
    private ArrayList<Pokemon> windpokemons;
    
    public Inventory(){
		windpokemons = new ArrayList<Pokemon>();
	}
    
   public void addWindPokemon(Pokemon pokemon){
		windpokemons.add(pokemon);
	}
   
   public void windList(){
		for(Pokemon pokemon: windpokemons){
			pokemon.print();
		}
	}

    
   
}
