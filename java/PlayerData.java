public class PlayerData {

    private String no, name, id, fed, rtg, club;

    public PlayerData(String no, String name, String id, String fed, String rtg, String club){

        this.no = no;
        this.name = name;
        this.id = id;
        this.fed= fed;
        this.rtg= rtg;
        this.club= club;
    }

    public String getNo (){
        return no;
    }

    public String getName(){
        return name;
    }

    public String getId(){
        return  id;
    }

    public String getFed(){
        return fed;
    }

    public String getRtg(){

        return rtg;
    }

    public String getClub(){
        return club;
    }

    public void setNo(String no){
        this.no=no;
    }

    public void setName(String name){
        this.name=name;

    }

    public void setId(String id){
        this.id=id;

    }

    public void setFed(String fed){
        this.fed= fed;
    }

    public void setRtg(String rtg){
        this.rtg=rtg;
    }

    public void setClub(String club){
        this.club = club;
    }
}
