import java.util.ArrayList;
import java.util.List;

public class Stock extends CardStack {
	public Stock() {}

	public List<Card> takeTop(int quantity){
		List<Card> temp = new ArrayList<Card>();
		if (quantity > cards_.size()) {
			return null;
		}
		if (!cards_.empty() ) {
			for (int i = 0; i<quantity; i++) {
				temp.add(cards_.pop());
			}
			return temp;
		}

		else {
			return null;
		}
	}
}