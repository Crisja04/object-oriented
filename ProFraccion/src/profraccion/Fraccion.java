package profraccion;
public class Fraccion {
    private double n,d;

    public Fraccion() {
        this.n = 1;
        this.d = 1;
    }

    public Fraccion(int n, int d) {
        this.n = n;
        this.d = d;
    }

    public double getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }
    public double mostrarDecimal(){
        return n/d;
    }
    public String mostrarFraccion(){
        
        return n + "/" + d;
    }
   
    
    
}
