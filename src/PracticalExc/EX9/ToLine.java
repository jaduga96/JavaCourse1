package PracticalExc.EX9;

public class ToLine {
    int [][] data;

    public ToLine(int[][] data) {
        this.data = data;
    }
    public int[] resize(){
        int count=0;
        int [] array=new int[data.length*data[0].length];
        for (int i=0;i<data.length;i++)
            for (int j=0;j<data[0].length;j++) {
                array[count]=data[i][j];
                count++;
            }
        return array;
    }
}
