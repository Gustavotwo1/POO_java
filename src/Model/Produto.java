package Model;

class Produto{
    private int idPro;
    private String namePro;
    private String descriptionPro;
    private double pricePro;
    private int stockPro;

    /*construtor padrão*/
    public Produto(){ };

    /*Construtor completo*/
    public Produto(int idPro, String namePro, String descriptionPro, double pricePro, int stockPro){
        this.idPro = idPro;
        this.namePro = namePro;
        this.descriptionPro = descriptionPro;
        this.pricePro = pricePro;
        this.stockPro = stockPro;

    }; 
    
    /*getters*/
    public int GetidPr(){
        return idPro;

    };
    public String GetnamePr(){
        return namePro;

    };
    public String GetdescriptionPr(){
        return descriptionPro;

    };
    public double GetpricePr(){
        return pricePro;

    };
    public int GetstockPr(){
        return stockPro;

    };

    /*setters */
    public void SetidPr(int NewIdPr){
        this.idPro = NewIdPr;

    };
    public void SetnamePr(String newNamePr){
        this.namePro = newNamePr;

    };
    public void SetdescriptionPr(String newDescriptionPr){
        this.descriptionPro = newDescriptionPr;

    };
    public void SetpricePr(double newPricePr){
        if(newPricePr < 0){//valor passado não valido
            throw new IllegalArgumentException("Preço não pode ser negativo.");

        }
        this.pricePro = newPricePr;

    };
    public void SetstockPr(int newStockPr){
        if (stockPro < 0){
            throw new IllegalArgumentException("Estoque não pode ser negativo.");

        }
        this.stockPro = newStockPr;

    };
};

