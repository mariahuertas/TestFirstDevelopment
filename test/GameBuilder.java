import java.util.ArrayList;
import java.util.List;

public class GameBuilder {

	private Stock stock;
	private Game game;

	public GameBuilder() {
		this.game = new Game();
	}

	public GameBuilder stock (StockBuilder stockBuilder) {
		this.stock = this.game.getStock();
		return this;
	}
	

	public Game game() {
		return this.game;
	}
}
