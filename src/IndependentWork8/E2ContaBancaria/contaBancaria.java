package IndependentWork8.E2ContaBancaria;

public abstract class contaBancaria {
    private int numero;
    private String password="bananas";
    public contaBancaria(int numero,String password ){
        this.numero=numero;
    }

    public String getPassword() {
        System.out.println("A sua password de acesso é: "+ getPassword());
        return password;
    }
    public void setSenha(String password){
        this.password = password;
    }

    public abstract double levanta();
    public abstract double deposita();
    public double tiraExtrato() {
        System.out.println("Total conta poupaça e rendimento: ")   ;
        return tiraExtrato();
    }

}
