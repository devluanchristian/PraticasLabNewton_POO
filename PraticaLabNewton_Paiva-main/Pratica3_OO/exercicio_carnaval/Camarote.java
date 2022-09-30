package exercicio_carnaval;
public class Camarote extends Ingresso {

    private double valorAdicional;
    private String localCamarote;


    public Camarote(double valorIngresso, double valorAdicional, String localCamarote) {
        super(valorIngresso);
        this.valorAdicional = valorAdicional;
        this.localCamarote = localCamarote;
    }


    public double getValorAdicional() {
        return valorAdicional;
    }


    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }


    public String getLocalCamarote() {
        return localCamarote;
    }


    public void setLocalCamarote(String localCamarote) {
        this.localCamarote = localCamarote;
    }

    public String imprimeIngresso(){
        
        return "Ingresso Camarote " + (getValorIngresso()+ getValorAdicional()+ getLocalCamarote());
    }


   

}
