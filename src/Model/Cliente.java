package Model;

public class Cliente {
    private int idCli;
    private String nameCli;
    private String emailCli;
    private String addressCli;

    /*construtor padrão*/
    public Cliente(){ };

    /*construtor completo*/
    public Cliente(int idCli, String nameCli, String emailCli, String addressCli){ 
        this.idCli = idCli;
        this.nameCli = nameCli;
        this.emailCli = emailCli;
        this.addressCli = addressCli;

    };

    /*getter*/
    public int GetidCl(){
        return idCli;

    }; 
    public String GetnameCl(){
        return nameCli;

    }; 
    public String GetemailCl(){
        return emailCli;

    }; 
    public String GetaddressCl(){
        return addressCli;

    }; 

    /*setter*/
    public void SetidCl(int newidCl){
        this.idCli = newidCl;

    };
    public void SetnameCl(String newnameCl){
        this.nameCli = newnameCl;

    };
    public void SetemailCl(String newemailCl){
        this.emailCli = newemailCl;

    };
    public void SetaddressCl(String newaddressCl){
        this.addressCli = newaddressCl;

    };
    
}
