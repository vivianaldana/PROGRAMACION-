package programacion;

import application.Board;
import application.Move;

public class rockie  implements PLAYER {
	
	 // Este método no debe ser modificado. Al implementar los dos métodos
	
         // solicitados, este
	
         // método genera un movimiento válido de manera automática.
	
	 public Move move(Board board) {
	
		int[] pos_pieza = pos_pieza_mas_adelantada(board);
		
		int[] nueva_pos = posicion_vecina_libre(pos_pieza[0], pos_pieza[1], board);
		
		if (nueva_pos == null){ // RENUNCIÓ!
		
		system.out.println("no se puede mover");	

			return null;
	
	}
	

		return new Move(pos_pieza[0], pos_pieza[1], nueva_pos[0], nueva_pos[1]);
	}


		// Retorna un arreglo de dos valores: la fila y la columna (en ese orden) de la
	
		// pieza del
		
		// jugador 1 que más lejos se encuentre de su casa. En caso de empate,
	
		// cualquiera de estas
	
		// es aceptada.

	static int[] pos_pieza_mas_adelantada(Board board) {

		
			
			// Home
		
			//int home_i = 0;
	
			//int home_j = 4;
	
			//double distancia;

		

			int counter = 0;
		
			while (counter < 10) {
		
				counter = counter + 1;
		
				System.out.println(counter);

		

				// Se crea el arreglo para devolver las dos posiciones (fila y columna)
		
				int pos[] = new int[2];

	

				// Se realiza el recorrido de las posiciones del tablero empezando por las filas
	
					for (int i = 0; i < 17; i++) {
		
					// Se realiza el recorrido de las posiciones del tablero por las columnas

					for (int j = 0; j < 17; j++) {
		
						// Se obitiene el color de la celda del tablero
		
						int color = board.get_cell_color(i, j);
			
						// Se valida que el color sea 1
			
						if (color == 1) {
	
							// Se guarda la posicion de la fila
	
							pos[0] = i;
	
							// Se guarda la posicion de la columna
	
							pos[1] = j;

			

							// Distancia
		
							//distancia = Math.sqrt(Math.pow(home_i - i, 2) + Math.pow(home_j - j, 2));

							// Se realiza la validacion de la cantidad de fichas que sean < 10



					}
	

				}
	
			}
	
			// Se valida que haya encontrado una posiciÃ³n y se devulve de lo contratrio se
	
			// devuelve null
			
			return pos;
		
		}
		
		return null;

	
}

	

// Retorna una arreglo de dos valores: la fila y la columna (en ese orden) de
	
// una casilla
	
// adyacente a la casilla (f, c) que no se encuentre ocupada por otra pieza ni

// pertenezca a

// una casa distinta a su destino. En caso de existir más de una casilla libre,

// cualquiera

// de estas casillas es aceptada. En caso de no existir ninguna casilla libre,
	
// debe retornar null.
	

static int[] posicion_vecina_libre(int f, int c, Board board) {

	

	//Se crea arreglo para conocer las posiciones vecinas
		
	int[] rt = new int[2];
	
	//Una vez identificada la ficha correspondiente al jugardor Roockie y su posición entre fila y columnas. 
	
	//Se verifica la primera posición habilitada sumando en filas y columnas confirmando que se encuentre libre (0) 
	
		if(f-1>=0 && c-1>=0){
		
		if (board.get_cell_color(f -1 , c -1) == 0) {
	
			rt[0] = f - 1;
		
			rt[1] = c - 1;
			
			return rt;
		
	
		}

	
	

		if(f-1>=0 && c+1<=17){
	
		if (board.get_cell_color(f -1 , c +1) == 0) {
	
			rt[0] = f - 1;
	
			rt[1] = c + 1;
		
			return rt;
		
	
		}

	
	
		if(f+1<=17 && c+1<=17){
	
		if (board.get_cell_color(f +1 , c +1) == 0) {
		
			rt[0] = f + 1;
				
			rt[1] = c + 1;
	
			return rt;
	
	
		}
		
	

		if(f+1<=17 && c-1>=0){
			
		if (board.get_cell_color(f +1 , c -1) == 0) {
		
		rt[0] = f + 1;
			
		rt[1] = c - 1;
		
		return rt;
		
		
		}		

		}		
			
	return null;
		}		
		}		
		}		
		
		
}		

}

	

	

