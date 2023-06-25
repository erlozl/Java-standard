package javaStandard;

class Po {
    int x;
    int y;

    public Po(int x, int y) {
        this.x = x;
        this.y = y;
    }

    String getLocation() {
        return "x +" + x + "y +" + y;
    }
}

class Po3 extends Po {

    public Po3(int x, int y, int z) {
        super(x, y);
    }

    String getLocation() {
        return "x +" + x + "y +" + y + "z + ";
    }
}

public class SuperEx02 {
    public static void main(String[] args) {
        Po3 po = new Po3(1, 2, 3);
        System.out.println(po);
    }
}
