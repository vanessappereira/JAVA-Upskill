package ClassExercises.classroom7.Exercicio2Ingressos;
/*
Crie uma classe CamaroteInferior (que possui a localização do ingresso e
métodos para obter e imprimir esta localização)
 */
public class CamaroteInf extends VIP{
        private String local;

        public CamaroteInf(int valor, int valorAdicionalVIP, String local) {
            super(valor, valorAdicionalVIP);
            this.local = local;
        }
        public String getLocal() {
            System.out.println(local);
            return local;
        }
}