package com.youcai.day01._04practic;

public class Cell {
    int row;
    int col;

    public Cell() {
    }

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }
    public void left(){
        this.col--;
    }
    public void right(){
        this.col++;
    }
    public void drop(){
        this.row++;
    }

    public void set(int row, int col){
        this.row = row;
        this.col = col;
    }

    public boolean equalls(Object obj) {
        if(obj == null){
            return false;
        }
        if (obj == this){
            return true;
        }
        if(this.getClass() != obj.getClass()){
            return false;
        }
        Cell other = (Cell)obj;
        return this.row == other.row && this.col == other.col;
    }
}
