package TA6.Exercicio3;

public class car {
    private final String matricula;
    private final String marca;
    private final String modelo;
    private final int anoRegisto;
    private final int mesRegisto;
    private int nrLugares;
    private double consumo;
    private int capacidadeMax;
    private int capacidadeAtual;
    private double consumoMedio;
    private boolean isLigado=false;

    public car
            (String marca,String modelo,int nrLugares,String matricula,
            int mesRegisto,int anoRegisto,double consumo){
                this.marca=marca;
                this.modelo=modelo;
                this.nrLugares=nrLugares;
                this.matricula=matricula;
                this.mesRegisto=mesRegisto;
                this.anoRegisto=anoRegisto;
                this.consumo=consumo;
                }

    public String getMatricula() {
        return matricula;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public double getConsumo() {
        return consumo;
    }
    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public void setNrLugares(int nrLugares) {
        this.nrLugares = nrLugares;
    }

    public void encherDeposito(){
       // capacidadeAtual=capacidadeMax-capacidadeAtual+capacidadeAtual;
        //     35        =   40L       -      5L        +   5L

        capacidadeAtual=capacidadeMax;
        /*
         public void encherDeposito(int litros){
            if(capacidadeAtual+litros <= capacidadeMax){
                capacidadeAtual = capacidadeAtual + litros;
            }else{
                capacidadeAtual=capacidadeMax
        }
         */
    }
    public void run(){
            consumoMedio=consumo/100;
            capacidadeAtual-=consumoMedio;
    }

    public boolean setLigado() {
        isLigado = !isLigado;
        return isLigado;
    }

    @Override
    public String toString() {
        return "Carro: " +
                "Marca: " + getMarca() + "\n" +
                "Modelo: " + getModelo() + "\n" +
                "Matricula: " + getMatricula() + "\n";
    }
}
