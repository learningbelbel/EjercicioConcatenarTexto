public class Main {
    public static void main(String[] args) {

        String fulltexto = " ";
        String [] textos = { "Hola!","Este","es","el","ejercicio","del","modulo","3"};

        for(String texto : textos){
            fulltexto += texto + " ";
        }
        System.out.println(fulltexto);
    }
}