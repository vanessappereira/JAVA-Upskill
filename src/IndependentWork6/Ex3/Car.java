package IndependentWork6.Ex3;

public class Car {
    private String matricula;
    private String marca, modelo;
    private int nrLugares, mesRegisto, anoRegisto;
    private double consumo, capacidadeAtual, combustivelMaximo;
    private boolean isLigado = false;
    private Person proprietario;

    public Car(String matricula, String marca, String modelo, int nrLugares, int mesRegisto,
               int anoRegisto, double consumo, double combustivelMaximo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.nrLugares = nrLugares;
        this.mesRegisto = mesRegisto;
        this.anoRegisto = anoRegisto;
        this.consumo = consumo;
        this.capacidadeAtual = capacidadeAtual;
        this.combustivelMaximo = combustivelMaximo;
    }

    public void encherDeposito() {
        setCapacidadeAtual(getCombustivelMaximo());
    }

    public void run(int kms) {
        double consumoPorKm = getConsumo() / 100.0;
        double consumoTotal = consumoPorKm * kms;

        this.capacidadeAtual = getCapacidadeAtual() - consumoTotal;

    }

    public boolean setLigado() {
        //Se forem valores diferentes, retorna falso
        isLigado = !isLigado;
        return isLigado;
    }

    public void registoProprietario(Person person) {
        setProprietario(person);
        setMesRegisto(mesRegisto);
        setAnoRegisto(anoRegisto);
        setMatricula(matricula);
    }

    @Override
    public String toString() {
        return "Info: " +
                "Proprietario: " + proprietario + " da matricula:" + matricula + " marca " + marca + " modelo: "
                + modelo + " mesRegisto " + mesRegisto + " anoRegisto " + anoRegisto;
    }

    ////////////////////////////    SETS    ////////////////////////////
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setNrLugares(int nrLugares) {
        this.nrLugares = nrLugares;
    }

    public void setMesRegisto(int mesRegisto) {
        this.mesRegisto = mesRegisto;
    }

    public void setAnoRegisto(int anoRegisto) {
        this.anoRegisto = anoRegisto;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public void setCapacidadeAtual(double capacidadeAtual) {
        this.capacidadeAtual = capacidadeAtual;
    }

    public void setCombustivelMaximo(double combustivelMaximo) {
        this.combustivelMaximo = combustivelMaximo;
    }

    public void setProprietario(Person proprietario) {
        this.proprietario = proprietario;
    }

////////////////////////////    GETS    ////////////////////////////

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getNrLugares() {
        return nrLugares;
    }

    public int getMesRegisto() {
        return mesRegisto;
    }

    public int getAnoRegisto() {
        return anoRegisto;
    }

    public double getConsumo() {
        return consumo;
    }

    public double getCapacidadeAtual() {
        return capacidadeAtual;
    }

    public double getCombustivelMaximo() {
        return combustivelMaximo;
    }

    public Person getProprietario() {
        return proprietario;
    }
}