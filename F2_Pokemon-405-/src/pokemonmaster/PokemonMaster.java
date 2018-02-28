package pokemonmaster;

public class PokemonMaster {

    public static void main(String[] args) {
		Farm farm = new Farm();
		CommandPanel commandPanel = new CommandPanel(farm);

		commandPanel.run();
	}

}

    
    

