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
    public int getIdCl(){
        return idCli;

    }
    public String getNameCl(){
        return nameCli;

    } 
    public String getEmailCl(){
        return emailCli;

    } 
    public String getAddressCl(){
        return addressCli;

    }
    public String getPhoneCl(){
        return phoneCli;

    }

    /*setter*/
    public void setidCl(int newidCl){
        this.idCli = newidCl;

    }
    public void setnameCl(String newnameCl){
        this.nameCli = newnameCl;

    }
    public void setemailCl(String newemailCl){
        this.emailCli = newemailCl;

    }
    public void setaddressCl(String newaddressCl){
        this.addressCli = newaddressCl;

    }
    public void setphoneCl(String newPhoneCl){
        this.phoneCli = newPhoneCl;

    }
    
}
