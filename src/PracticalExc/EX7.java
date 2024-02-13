package PracticalExc;

public class EX7 {
    int [][] points;

    public EX7(int[][] points) {
        this.points = points;
    }
    public int getWidth(){
        int[] minAndMax=minAndMax(getColumm(0));
        return minAndMax[1]-minAndMax[0];
    }
    public int getHeight(){
        int[] minAndMax=minAndMax(getColumm(1));
        return minAndMax[1]-minAndMax[0];
    }
    public String getBorders(){
        int[] minAndMaxY=minAndMax(getColumm(1));
        int[] minAndMaxX=minAndMax(getColumm(0));
        return minAndMaxY[0]+", "+minAndMaxY[1]+", "+minAndMaxX[0]+", "+minAndMaxX[1];
    }

    private int [] minAndMax(int[] array){
        int min=array[0],max=array[0];
        for (int i=0;i<points.length;i++){
            if (min>array[i])
                min=array[i];
            if (max<array[i])
                max=array[i];
        }
        return new int []{min,max};
    }
    private int[] getColumm(int colummNumber){
        int[] columm=new int[points.length];
        for (int i=0;i< columm.length;i++){
            columm[i]=points[i][colummNumber];
        }
        return columm;
    }


}
