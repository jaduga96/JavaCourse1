package PracticalExc.EX9;

public class ToTable {
    int [] data;
    int x,y;

    public ToTable(int[] data, int x, int y) {
        this.data = data;
        this.x = x;
        this.y = y;
    }
    public int[][] resize(){
        int count=0;
        int [][]doubleArray=new int[x][y];
        for (int i=0;i<x;i++)
            for (int j=0;j<y;j++) {
                doubleArray[i][j] = data[count];
                count++;
            }
        return doubleArray;
    }
}
