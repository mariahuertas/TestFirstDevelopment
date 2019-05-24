import java.util.ArrayList;
import java.util.List;

public class EmptyGameBuilder {

	private Stock stock;
	private Game game;

	public EmptyGameBuilder() {
		this.game = new Game();
	}

	public EmptyGameBuilder stock (Stock stock) {
		this.stock = this.game.getStock();
		while(!this.stock.empty()) {
			this.stock.pop();
		}
		while(!stock.empty()) {
			this.stock.push(stock.pop());
		}
		return this;
	}
<<<<<<< HEAD
	public Game build() {
=======
	
	public Game game() {
>>>>>>> a5e94153dd729aacb29618651f6499bebb850390
		return this.game;
	}
}
