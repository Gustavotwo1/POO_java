package Model;

public class Cliente {
    private int idCli;
    private String nameCli;
    private String emailCli;
    private String addressCli;
    private String phoneCli;

    /*construtor padrão*/
    public Cliente(){ };

    /*construtor completo*/
    public Cliente(int idCli, String nameCli, String emailCli, String addressCli, String phoneCli){ 
        this.idCli = idCli;
        this.nameCli = nameCli;
        this.emailCli = emailCli;
        this.addressCli = addressCli;
        this.phoneCli = phoneCli;

    }

    /*getter*/
    public int GetidCl(){
        return idCli;

    }
    public String GetnameCl(){
        return nameCli;

    } 
    public String GetemailCl(){
        return emailCli;

    } 
    public String GetaddressCl(){
        return addressCli;

    }
    public String GetphoneCl(){
        return phoneCli;

    }

    /*setter*/
    public void SetidCl(int newidCl){
        this.idCli = newidCl;

    }
    public void SetnameCl(String newnameCl){
        this.nameCli = newnameCl;

    }
    public void SetemailCl(String newemailCl){
        this.emailCli = newemailCl;

    }
    public void SetaddressCl(String newaddressCl){
        this.addressCli = newaddressCl;

    }
    public void SetphoneCl(String newPhoneCl){
        this.phoneCli = newPhoneCl;

    }
    
}
