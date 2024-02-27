package revisao.java.aula.aula1.exercicioRevisao;

public class OlaMundo {
    public static void main(String[] args) {
        String argumento = args.length >= 1 ? args[0] : " ";

        switch (argumento.toLowerCase()){
            case "pt" :
            System.out.println("Olá Mundo");
                break;
            case "en" :
                System.out.println("Hello World");
                break;
            default:
                System.out.println("idioma Iválido");
                break;
        }
    }
}
