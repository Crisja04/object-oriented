
package protiempo;

public class Tiempo {
    private int h,m,s;

    public Tiempo() {
        this.h = 12;
        this.m = 00;
        this.s = 00;
    }

    public Tiempo(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "Tiempo{" + "h=" + h + ", m=" + m + ", s=" + s + '}';
    }
    
    public String tEstandar() {
        if(h<=12)
            return "son las " + h + ":" + m + "am";
        else
            return "son las " + (h-12) + ":" + m + "pm";
        
    }
    
}
