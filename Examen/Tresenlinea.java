//Fernandez Casas Carlos Axel 
//Examen tresenlinea
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Tresenlinea{
    final static int FILAS = 3;
    final static int COLUMNAS = 3;
    final static char JUGADOR_X = 'X';
    final static char JUGADOR_O = 'O';
    final static char JUGADOR_CPU_O = JUGADOR_O;
    final static char ESPACIO_VACIO = ' ';
    final static int CONTEO_PARA_GANAR = 3;
    final static char letra = 0;
    static char caracter = 'S';
    final static int JUGADOR_JUGADOR = 1;
    final static int JUGADOR_CPU = 2;
    final static Scanner sc = new Scanner(System.in);
    final static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
         int modo;
     do{ 
        String menu = "1. Jugador1 vs jugador2\n2. jugador contra CPU (El CPU juega como " + JUGADOR_CPU_O + ")\nElige: ";
        modo = solicitarNumeroValido(menu, 1, 3);
        iniciarJuego(modo);
        
        System.out.println("¿Desea repetir el juego? \n escriba S para repetir ");
        caracter = entrada.next().charAt(0);
     }while(caracter == 's' || caracter == 'S');
     
    }
    static char[][] clonarMatriz(char[][] tableroOriginal) {
        char[][] copia = new char[FILAS][COLUMNAS];
        for (int y = 0; y < FILAS; y++) {
            for (int x = 0; x < COLUMNAS; x++) {
                copia[y][x] = tableroOriginal[y][x];
            }
        }
        return copia;
    }
    static void limpiarTablero(char[][] tablero) {
        int y;
        for (y = 0; y < FILAS; y++) {
            int x;
            for (x = 0; x < COLUMNAS; x++) {
                tablero[y][x] = ESPACIO_VACIO;
            }
        }
    }
    static void imprimirTablero(char[][] tablero) {
        System.out.print("\n");
        int y;
        int x;
        System.out.print("| ");
        for (x = 0; x < COLUMNAS; x++) {
            System.out.printf("|%d", x + 1);
        }
        System.out.print("|\n");
        for (y = 0; y < FILAS; y++) {
            System.out.printf("|%d", y + 1);
            for (x = 0; x < COLUMNAS; x++) {
                System.out.printf("|%c", tablero[y][x]);
            }
            System.out.print("|\n");
        }
    }

 
    static boolean coordenadasVacias(int y, int x, char[][] tablero) {
        return tablero[y][x] == ESPACIO_VACIO;
    }
    static void colocarPieza(int y, int x, char pieza, char[][] tablero) {
        if (y < 0 || y >= FILAS) {
            System.out.print("Fila incorrecta");
            return;
        }

        if (x < 0 || x >= COLUMNAS) {
            System.out.print("Columna incorrecta");
            return;
        }
        if (pieza != JUGADOR_O && pieza != JUGADOR_X) {
            System.out.printf("La pieza debe ser %c o %c", JUGADOR_O, JUGADOR_X);
            return;
        }
        if (!coordenadasVacias(y, x, tablero)) {
            System.out.print("Coordenadas ya ocupadas");
            return;
        }
        tablero[y][x] = pieza;
    }
  

    static int contarHaciaArriba(int x, int y, char jugador, char[][] tablero) {
        int yInicio = (y - CONTEO_PARA_GANAR >= 0) ? y - CONTEO_PARA_GANAR + 1 : 0;
        int contador = 0;
        for (; yInicio <= y; yInicio++) {
            if (tablero[yInicio][x] == jugador) {
                contador++;
            } else {
                contador = 0;
            }
        }
        return contador;
    }

    static int contarHaciaDerecha(int x, int y, char jugador, char[][] tablero) {
        int xFin = (x + CONTEO_PARA_GANAR < COLUMNAS) ? x + CONTEO_PARA_GANAR - 1 : COLUMNAS - 1;
        int contador = 0;
        for (; x <= xFin; x++) {
            if (tablero[y][x] == jugador) {
                contador++;
            } else {
                contador = 0;
            }
        }
        return contador;
    }

    static int contarHaciaArribaDerecha(int x, int y, char jugador, char[][] tablero) {
        int xFin = (x + CONTEO_PARA_GANAR < COLUMNAS) ? x + CONTEO_PARA_GANAR - 1 : COLUMNAS - 1;
        int yInicio = (y - CONTEO_PARA_GANAR >= 0) ? y - CONTEO_PARA_GANAR + 1 : 0;
        int contador = 0;
        while (x <= xFin && yInicio <= y) {
            if (tablero[y][x] == jugador) {
                contador++;
            } else {
                contador = 0;
            }
            x++;
            y--;
        }
        return contador;
    }

    static int contarHaciaAbajoDerecha(int x, int y, char jugador, char[][] tablero) {
        int xFin = (x + CONTEO_PARA_GANAR < COLUMNAS) ? x + CONTEO_PARA_GANAR - 1 : COLUMNAS - 1;
        int yFin = (y + CONTEO_PARA_GANAR < FILAS) ? y + CONTEO_PARA_GANAR - 1 : FILAS - 1;
        int contador = 0;
        while (x <= xFin && y <= yFin) {
            if (tablero[y][x] == jugador) {
                contador++;
            } else {
                contador = 0;
            }
            x++;
            y++;
        }
        return contador;
    }

    
    static boolean comprobarSiGana(char jugador, char[][] tablero) {
        int y;
        
        for (y = 0; y < FILAS; y++) {
            int x;
            for (x = 0; x < COLUMNAS; x++) {
                if (
                        contarHaciaArriba(x, y, jugador, tablero) >= CONTEO_PARA_GANAR ||
                                contarHaciaDerecha(x, y, jugador, tablero) >= CONTEO_PARA_GANAR ||
                                contarHaciaArribaDerecha(x, y, jugador, tablero) >= CONTEO_PARA_GANAR ||
                                contarHaciaAbajoDerecha(x, y, jugador, tablero) >= CONTEO_PARA_GANAR) {
                                    
                    return true;
                    
                     
                }
               
            }
            
        }
        return false;
    }

    static char oponenteDe(char jugador) {
        if (jugador == JUGADOR_O) {
            return JUGADOR_X;
        } else {
            return JUGADOR_O;
        }
    }

   
    static void hablar(String mensaje, char jugador) {
        System.out.printf("\nCPU (%c) dice: %s\n\n", jugador, mensaje);
    }

    
    static boolean empate(char[][] tableroOriginal) {
        int y;
        for (y = 0; y < FILAS; y++) {
            int x;
            for (x = 0; x < COLUMNAS; x++) {
     
                if (tableroOriginal[y][x] == ESPACIO_VACIO) {
                    return false;
                    
                }
            }
        }
        return true;
    }
    public static int aleatorioEnRango(int minimo, int maximo) {
        
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }

    
    static int[] obtenerCoordenadasAleatorias(char jugador, char[][] tableroOriginal) {
        int x, y;
        do {
            x = aleatorioEnRango(0, COLUMNAS - 1);
            y = aleatorioEnRango(0, FILAS - 1);
        } while (!coordenadasVacias(y, x, tableroOriginal));
        return new int[]{x, y};
    }

  
    static int[] coordenadasParaGanar(char jugador, char[][] tableroOriginal) {
        int y, x;
        for (y = 0; y < FILAS; y++) {
            for (x = 0; x < COLUMNAS; x++) {
                char[][] copiaTablero = clonarMatriz(tableroOriginal);
                if (coordenadasVacias(y, x, copiaTablero)) {
                    colocarPieza(y, x, jugador, copiaTablero);
                    if (comprobarSiGana(jugador, copiaTablero)) {
                        return new int[]{x, y};
                    }
                }
            }
        }
        return new int[]{-1, -1};
    }
    static int contarSinSaberCoordenadas(char jugador, char[][] copiaTablero) {
        int conteoMayor = 0;
        int x, y;
        for (y = 0; y < FILAS; y++) {
            for (x = 0; x < COLUMNAS; x++) {
                int conteoTemporal;
                conteoTemporal = contarHaciaArriba(x, y, jugador, copiaTablero);
                if (conteoTemporal > conteoMayor) {
                    conteoMayor = conteoTemporal;
                }
                conteoTemporal = contarHaciaArribaDerecha(x, y, jugador, copiaTablero);
                if (conteoTemporal > conteoMayor) {
                    conteoMayor = conteoTemporal;
                }

                conteoTemporal = contarHaciaDerecha(x, y, jugador, copiaTablero);
                if (conteoTemporal > conteoMayor) {
                    conteoMayor = conteoTemporal;
                }

                conteoTemporal = contarHaciaAbajoDerecha(x, y, jugador, copiaTablero);
                if (conteoTemporal > conteoMayor) {
                    conteoMayor = conteoTemporal;
                }
            }
        }
        return conteoMayor;
    }

   
    static int[] coordenadasParaMayorPuntaje(char jugador, char[][] tableroOriginal) {
        int y, x;
        int conteoMayor = 0,
                xConteoMayor = -1,
                yConteoMayor = -1;
        for (y = 0; y < FILAS; y++) {
            for (x = 0; x < COLUMNAS; x++) {
                char[][] copiaTablero = clonarMatriz(tableroOriginal);
                if (!coordenadasVacias(y, x, copiaTablero)) {
                    continue;
                }
             
                colocarPieza(y, x, jugador, copiaTablero);
                int conteoTemporal = contarSinSaberCoordenadas(jugador, copiaTablero);
                if (conteoTemporal > conteoMayor) {
                    conteoMayor = conteoTemporal;
                    yConteoMayor = y;
                    xConteoMayor = x;
                }
            }
        }
        return new int[]{conteoMayor, xConteoMayor, yConteoMayor};
    }
    static int[] elegirCoordenadasCpu(char jugador, char[][] tablero) {
        hablar("Estoy pensando...", jugador);
   
    
        int y, x, conteoJugador, conteoOponente;
        int yOponente, xOponente;
        int[] coordenadas = new int[2];
        char oponente = oponenteDe(jugador);
        // 1
        coordenadas = coordenadasParaGanar(jugador, tablero);
        x = coordenadas[0];
        y = coordenadas[1];
        if (y != -1 && x != -1) {
            hablar("Ganar", jugador);
            return new int[]{x, y};
        }
        
        coordenadas = coordenadasParaGanar(oponente, tablero);
        x = coordenadas[0];
        y = coordenadas[1];
        if (y != -1 && x != -1) {
            hablar("Tomar victoria de oponente", jugador);
            return new int[]{x, y};
        }
        int[] coordenadasJugador = coordenadasParaMayorPuntaje(jugador, tablero);
        int[] coordenadasOponente = coordenadasParaMayorPuntaje(oponente, tablero);
        conteoJugador = coordenadasJugador[0];
        x = coordenadasJugador[1];
        y = coordenadasJugador[2];
        conteoOponente = coordenadasOponente[0];
        xOponente = coordenadasOponente[1];
        yOponente = coordenadasOponente[2];
        if (conteoOponente > conteoJugador) {
            hablar("Tomar puntaje mayor del oponente", jugador);
            return new int[]{xOponente, yOponente};
        } else if (conteoJugador > 0) {
            hablar("Tomar mi mayor puntaje", jugador);
            return new int[]{x, y};
        }
        
        if (coordenadasVacias(0, 0, tablero)) {
            hablar("Tomar columna superior izquierda", jugador);
            return new int[]{0, 0};
        }
       
        hablar("Coordenadas aleatorias", jugador);
        coordenadas = obtenerCoordenadasAleatorias(jugador, tablero);
        return coordenadas;
    }

    
    static char jugadorAleatorio() {
        if (aleatorioEnRango(0, 1) == 0) {
            return JUGADOR_O;
        } else {
            return JUGADOR_X;
        }
    }
    

    static void iniciarJuego(int modo) {
       
      
        char[][] tablero = new char[FILAS][COLUMNAS];
       
        limpiarTablero(tablero);
       
        char jugadorActual = jugadorAleatorio();
        System.out.printf("El jugador que inicia es: %c\n", jugadorActual);
        int x = 0, y = 0;
      
        int[] coordenadas = new int[2];
        while (true) {
            imprimirTablero(tablero);
            if (modo == JUGADOR_JUGADOR || (modo == JUGADOR_CPU && jugadorActual == JUGADOR_X)) {
                System.out.printf("Jugador %c. Ingresa coordenadas (x,y) para colocar la pieza\n", jugadorActual);
                do {
                    x = solicitarNumeroValido("Ingresa X: ", 1, COLUMNAS);
                    y = solicitarNumeroValido("Ingresa Y: ", 1, FILAS);
                    if (!coordenadasVacias(y - 1, x - 1, tablero)) {
                        System.out.println("Coordenadas ya puestas. Intenta de nuevo");
                    }
                } while (!coordenadasVacias(y - 1, x - 1, tablero));
 
                x--;
                y--;
            } else if ( jugadorActual == JUGADOR_CPU_O) {
                coordenadas = elegirCoordenadasCpu(jugadorActual, tablero);
                x = coordenadas[0];
                y = coordenadas[1];
            }
           

            colocarPieza(y, x, jugadorActual, tablero);
            
            if (comprobarSiGana(jugadorActual, tablero)) {
                imprimirTablero(tablero);
                System.out.printf("El jugador %c gana la partida\n", jugadorActual);
                return;
            } else if (empate(tablero)) {
                imprimirTablero(tablero);
                System.out.print("Empate");
                return;
            }
            
            jugadorActual = oponenteDe(jugadorActual);
        }
    }

    public static int solicitarNumeroValido(String mensaje, int minimo, int maximo) {
        int numero;
        while (true) {
            System.out.println(mensaje);
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                if (numero >= minimo && numero <= maximo) {
                    return numero;
                } else {
                    System.out.println("Número fuera de    rango. Intente de nuevo");
                }
            } else {
                sc.next();
            }
        }
    }
}



