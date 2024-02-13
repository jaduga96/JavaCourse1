package PracticalExc.EX10;

public class Mage {
    String name, type;
    int level, damage;

    public Mage(String name, int level, int damage, String type) {
        this.type = type;
        this.name = name;
        this.level = level;
        this.damage = damage;
    }
    public static boolean typeCheck(String type) {
        if (type=="fire"||type=="ice"||type=="earth")
            return true;
        return false;
    }
    public String getInfo(){
        return "{"+this.name+", "+this.level+", "+this.damage+", "+this.type+"}";
    }
    public String fight(Mage mage){
        String winner = null;
        if (mage.type==this.type){
            switch (Integer.compare(this.level,mage.level)){
                case -1:
                    winner=mage.name;
                    break;
                case 0:
                    switch (Integer.compare(this.damage,mage.damage)){
                        case -1:
                            winner=mage.name;
                            break;
                        case 0:
                            winner="draw";
                            break;
                        case 1:
                            winner=this.name;
                            break;
                    }
                    break;
                case 1:
                    winner= this.name;
                    break;
            }
            return winner;
        }
        if (this.type=="fire"){
            if (mage.type=="ice"){
                winner=this.name;
            } else winner=mage.name;
        }
        if (this.type=="ice"){
            if (mage.type=="earth"){
                winner=this.name;
            } else winner=mage.name;
        }
        if (this.type=="earth"){
            if (mage.type=="fire"){
                winner=this.name;
            } else winner=mage.name;
        }
        return winner;
    }
}

