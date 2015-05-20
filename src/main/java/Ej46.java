import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ej46 {

	private class Card {
		public Card(Suit suit, Rank rank) {
			super();
			this.suit = suit;
			this.rank = rank;
		}

		private Suit suit;

		public Suit getSuit() {
			return suit;
		}

		public Rank getRank() {
			return rank;
		}

		private Rank rank;

		@Override
		public String toString() {
			String message = this.suit.toString() + "-" + this.rank.toString();
			return message;
		}
	}

	enum Suit {
		CLUB, DIAMOND, HEART, SPADE
	};

	enum Rank {
		ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
	};

	public void do1() {
		List<Suit> suits = Arrays.asList(Suit.values());
		List<Rank> ranks = Arrays.asList(Rank.values());

		List<Card> cards = new ArrayList<>();

		for (Iterator<Suit> ite1 = suits.iterator(); ite1.hasNext();) {
			Suit suit = ite1.next();
			for (Iterator<Rank> ite2 = ranks.iterator(); ite2.hasNext();) {
				cards.add(new Card(suit, ite2.next()));
			}
		}
	}

	public void do2() {
		List<Card> cards = new ArrayList<>();

		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				cards.add(new Card(suit, rank));
			}
		}

	}
}