public class ReadData {
    private String line1,line2,line3,line4;

    public ReadData(String line1, String line2, String line3, String line4){

        this.line1 = line1;
        this.line2= line2;
        this.line3 = line3;
        this.line4 = line4;

    }

    public String getLine1(){
        return line1;
    }

    public String getLine2(){
        return line2;
    }

    public String getLine3(){
        return line3;
    }

    public String getLine4(){
        return line4;
    }

    public void setLine1 (String line1){
        this.line1= line1;
    }

    public void setLine2(String line2){
        this.line2 = line2;
    }

    public void setLine3(String line3){
        this.line3 = line3;
    }

    public void setLine4 (String line3){
        this.line4=line4;
    }


}
