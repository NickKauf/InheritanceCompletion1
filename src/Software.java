public class Software extends Product {

    private String programmer;
    private String platform; // linux, mac, or pc
    private String os;

    public void setProgrammer(String programmer){
        this.programmer = programmer;
    }
    public String getProgrammer(){
        return this.programmer;
    }
    public void setPlatform(String platform){
        this.platform = platform;
    }
    public String getPlatform(){
        return this.platform;
    }
    public void setOS(String os){
        this.os = os;
    }
    public String getOS(){
        return this.os;
    }

}