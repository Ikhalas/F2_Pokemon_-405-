package pokemonmaster;

public class PokemonMaster {

    public static void main(String[] args) {
		Farm farm = new Farm();
                Inventory inventory = new Inventory();
                Wild wild = new Wild(inventory);
		CommandPanel commandPanel = new CommandPanel(farm,inventory,wild);
                
		commandPanel.run();
	}

}

    
    

