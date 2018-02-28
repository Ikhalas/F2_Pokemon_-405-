package pokemonmaster;

import java.util.*;

class Farm {
	private ArrayList<Pokemon> pokemons;
	public Farm(){
		pokemons = new ArrayList<Pokemon>();
	}

	public void addPokemon(Pokemon pokemon){
		pokemons.add(pokemon);
	}

	public void list(){
		for(Pokemon pokemon: pokemons){
			pokemon.print();
		}
	}
        
	public void feed(String pokemonName){
		if(pokemonName.equals("all")){
			for(Pokemon pokemon: pokemons){
				pokemon.eat();
			}
		}
                else{
                        for(Pokemon pokemon: pokemons){
                                if(pokemon.getName().equals(pokemonName))
                                    pokemon.eat();
                        }
                }
                    
	}
        
        public void exercise (String pokemonName){
            if(pokemonName.equals("all")){
			for(Pokemon pokemon: pokemons){
				pokemon.exercise();
			}
		}
                else{
                        for(Pokemon pokemon: pokemons){
                                if(pokemon.getName().equals(pokemonName))
                                    pokemon.exercise();
                        }
                }
        }
        
}

