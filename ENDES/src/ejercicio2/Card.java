package ejercicio2;

public class Card {
//Se nos dice que la carta estará formada por  un palo (suit) y un valor(value)
	public String suit;
	public String value;
	// A continuación, tenemos el constructor de las cartas
	public Card (String suit, String value) {
		this.suit = suit;
		this.value = value;
	}
	//En este punto tenemos un string que nos  devolvería una carta con un palo(suit) y un valor(value)
	public String toString () {
		return (this.suit+"-"+this.value);
	}
}
