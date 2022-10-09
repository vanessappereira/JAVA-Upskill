package ClassExercises.classroom12.Exercicio1;

import java.util.ArrayList;

public class Main {
        public static void main(String[] args) {

            ArrayList<contacto> listaTelefonica = new ArrayList<>();

        contacto um = new contacto("João Silva", "joao.silva@gmail.com", "910000000");
        contacto dois = new contacto("Pedro Fernandes", "pedro.fernandes@gmail.com", "910000001");
        contacto tres = new contacto("Maria Rita", "maria.ritinha@gmail.com", "910000002");

            listaTelefonica.add(um);
            listaTelefonica.add(dois);
            listaTelefonica.add(tres);
            System.out.println("Antes de remover: " + listaTelefonica.size());
            listaTelefonica.remove(dois);
            System.out.println("Depois de remover: " + listaTelefonica.size());

            for (contacto contactos: listaTelefonica){
                System.out.println(contactos);
            }
            for (int i = 0; i < listaTelefonica.size(); i++) {
                System.out.println(listaTelefonica.get(i));

            }
    }
}
