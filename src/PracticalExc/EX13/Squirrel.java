package PracticalExc.EX13;

public class Squirrel {
    int [] nuts;

    public Squirrel(int[] nuts) {
        this.nuts = nuts;
        System.out.printf("{");
        for (int i=0;i<nuts.length;i++){
            System.out.printf(nuts[i]+", ");
        }
        System.out.printf("}\n");
    }

    public int getNuts(int index) {
        System.out.println(nuts[index]);
        return nuts[index];
    }

    public int maxNuts(){
        if (nuts.length<2) return nuts[0] > 0 ? nuts[0] : 0;
        int [] maxNuts=new int[nuts.length];
        maxNuts[0]=nuts[0];
        if (nuts[1]>nuts[0]+nuts[1]){
            maxNuts[1]=nuts[1];
        } else maxNuts[1]=nuts[0]+nuts[1];

        for (int i=2;i<nuts.length;i++){
            if ((maxNuts[i-1]+nuts[i])>(maxNuts[i-2]+nuts[i])){
                maxNuts[i]=maxNuts[i-1]+nuts[i]>0?maxNuts[i-1]+nuts[i]:0;
            } else maxNuts[i]=maxNuts[i-2]+nuts[i]>0?maxNuts[i-2]+nuts[i]:0;
        }
        if (maxNuts[nuts.length-1]>maxNuts[nuts.length-2]){
            return maxNuts[nuts.length-1] > 0 ? maxNuts[nuts.length-1] : 0;
        } else return maxNuts[nuts.length-2] > 0 ? maxNuts[nuts.length-2] : 0;
    }
}
