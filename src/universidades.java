public class universidades {


    int aulas ;
    String color ;
    int anio ;
    int n_estudiantes ;

    public universidades(){
         aulas=100  ;
         color = "ROJO";
         anio = 1978;
         n_estudiantes = 1000;
    }

    public int getAulas() {
        return aulas;
    }

    public void setAulas(int aulas) {
        this.aulas = aulas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getN_estudiantes() {
        return n_estudiantes;
    }

    public void setN_estudiantes(int n_estudiantes) {
        this.n_estudiantes = n_estudiantes;
    }
}
