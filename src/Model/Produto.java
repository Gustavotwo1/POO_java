package Model;

public class Produto{
    private int idPro;
    private String namePro;
    private String descriptionPro;
    private double pricePro;
    private int stockPro;

    /*construtor padrão*/
    public Produto(){ };

    /*construtor completo*/
    public Produto(int idPro, String namePro, String descriptionPro, double pricePro, int stockPro){
        this.idPro = idPro;
        this.namePro = namePro;
        this.descriptionPro = descriptionPro;
        this.pricePro = pricePro;
        this.stockPro = stockPro;

    }; 
    
    /*getters*/
    public int getIdPr(){
        return idPro;

    }
    public String getNamePr(){
        return namePro;

    }
    public String getDescriptionPr(){
        return descriptionPro;

    }
    public double getPricePr(){
        return pricePro;

    }
    public int getStockPr(){
        return stockPro;

    }

    /*setters */
    public void setidPr(int NewIdPr){
        this.idPro = NewIdPr;

    }
    public void setnamePr(String newNamePr){
        this.namePro = newNamePr;

    }
    public void setdescriptionPr(String newDescriptionPr){
        this.descriptionPro = newDescriptionPr;

    }
    public void setpricePr(double newPricePr){
        if(newPricePr < 0){//valor passado não valido
            throw new IllegalArgumentException("Preço não pode ser negativo.");

        }
        this.pricePro = newPricePr;

    }
    public void setstockPr(int newStockPr){
        if (stockPro < 0){
            throw new IllegalArgumentException("Estoque não pode ser negativo.");

        }
        this.stockPro = newStockPr;

    }
}

