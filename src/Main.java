public class Main {
    public static void main(String[] args) {
        Texto mostrar = new Texto("Me gusta comer hamburguesas.");

        mostrar.MostrarTexto();
    }
}

class Texto{
    String textoUso;

    public Texto(String textoUso){
        this.textoUso = textoUso;
    }

    public String getTextoUso() {
        return textoUso;
    }

    public void setTextoUso(String textoUso) {
        this.textoUso = textoUso;
    }

    public void MostrarTexto(){
        System.out.println(textoUso);
    }
}