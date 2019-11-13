/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gatoCalculadora;

/**
 *
 * @author usuario
 */
public class Gato {
    private
    String[][] tablero_gato;
    private String player1;
    private String player2;
    private int turno;
    private int ganador;
    private int posX;
    private int posY;

    
    //Methods
    public Gato(){
        this.tablero_gato = new String[3][3];
        this.player1 = "X";
        this.player2 = "O";
        this.turno = 1;
        this.ganador = 0;
        this.posX = 0;
        this.posY = 0;
    }
    
    
    public String[][] getTablero_gato() {
        return tablero;
    }

    public String getPlayer1() {
        return player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public int getTurno() {
        return turno;
    }

    public int getGanador() {
        return ganador;
    }

    public void setTablero(String[][] tablero) {
        this.tablero = tablero;
    }

//    public void setPlayer1(String player1) {
//        this.player1 = player1;
//    }
//
//    public void setPlayer2(String player2) {
//        this.player2 = player2;
//    }

    public void setTurno(int turno) {
        if(turno == 1){
            this.turno = 1;
        }
        else if(turno == 2){
            this.turno = 2;
        }
    }

    public void setGanador(int ganador) {
        this.ganador = ganador;
    }
    
    
    
    public int game(){
        //for(int i = 0; i<9; i++){
            if((getTurno()==1)){
                tablero[posX][posY] = getPlayer1();
            }else if(getTurno()==2){
                tablero[posX][posY] = getPlayer2();
            }
       
            for(int x = 0; x<3; x++){
                for(int y = 0; y<3; y++){
                    if(tablero[0][y] == "X" 
                    || tablero[1][y] == "X" 
                    || tablero[2][y] == "X" 
                    || tablero[x][0] == "X"
                    || tablero[x][1] == "X"
                    || tablero[x][2] == "X"
                            ){
                        
                    }
                }
            }
    
        return 0;
    }
    
    public int ganar(int winner){
        
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
    
    
}
