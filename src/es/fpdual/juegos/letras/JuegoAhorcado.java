package es.fpdual.juegos.letras;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

import es.fpdual.juegos.Juego;
import es.fpdual.utils.UtilidadesJuego;

public class JuegoAhorcado extends Juego {
	
	public void pintarAhorcado() {
		switch (this.getNumeroVidasRestantes()) {
		case 7:
			System.out.println(
					" ___\r\n" + 
					" |\r\n" + 
					" |\r\n" + 
					" |\r\n" + 
					" |");
			break;
		case 6:
			System.out.println(
					" ___\r\n" + 
					" |   |\r\n" + 
					" |   \r\n" + 
					" |\r\n" + 
					" |");
			break;
		case 5:
			System.out.println(
					" ___\r\n" + 
					" |   |\r\n" + 
					" |   O\r\n" + 
					" |\r\n" + 
					" |");
			break;
		case 4:
			System.out.println(
					" ___\r\n" + 
					" |   |\r\n" + 
					" |  \\O\r\n" + 
					" |\r\n" + 
					" |");
			break;
		case 3:
			System.out.println(
					" ___\r\n" + 
					" |   |\r\n" + 
					" |  \\O/\r\n" + 
					" |\r\n" + 
					" |");
			break;
		case 2:
			System.out.println(
					" ___\r\n" + 
					" |   |\r\n" + 
					" |  \\O/\r\n" + 
					" |   |\r\n" + 
					" |");
			break;
		case 1:
			System.out.println(
					" ___\r\n" + 
					" |   |\r\n" + 
					" |  \\O/\r\n" + 
					" |   |\r\n" + 
					" |  /");
			break;
		case 0:
			System.out.println(
					" ___\r\n" + 
					" |   |\r\n" + 
					" |  \\O/\r\n" + 
					" |   |\r\n" + 
					" |  / \\ ");
			break;

		}
	}
}
