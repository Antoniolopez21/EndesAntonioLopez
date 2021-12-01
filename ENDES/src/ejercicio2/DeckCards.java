package ejercicio2;

import java.util.ArrayList;

public class DeckCards {

	public static void main(String[] args) {

		String[] suits = { "Spades", "Diamonds", "Club", "Heart" };
		String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
// Con la  siguiente lista de  vectores estamos creando la baraja
		ArrayList<Card> deck = new ArrayList<Card>();
//Con estos dos bucles creamos las cartas  y las almacenamos en la baraja de forma ordenada
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < values.length; j++) {
				Card card = new Card(suits[i], values[j]);
				deck.add(card);
			}
		}
// Aquí tenemos otro bucle que recorre desde cero hasta el tamaño de la baraja y su función es barajar las cartas y ofrecer cartas aleatorias.
		for (int i = 0; i < deck.size(); i++) {
			int j = (int) Math.floor(Math.random() * i);
			Card tmp = deck.get(i);
			deck.set(i, deck.get(j));
			deck.set(j, tmp);
		}
//Bucle que recorre  de 0 a 5 en el que pedimos que se nos  devuelvan las 5 primeras cartas
		for (int i = 0; i < 5; i++) {
			System.out.println(deck.get(i));
		}

	}

}
