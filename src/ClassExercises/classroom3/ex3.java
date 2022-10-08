package Aula3Scanner.aulas;

public class ex3 {
    public static void printnumber  (int numb){
        switch (numb) {
            case (1):
                System.out.println("um");
                break;
            case (2):
                System.out.println("dois");
                break;
            case (3):
                System.out.println("tres");
                break;
            default:
                System.out.println("Nao consigo Identificar");
                    }
    }
    public static void main(String[] args) {
        printnumber(1);
    }
}


