package santa.david.g1087.adapter;

public class ArgumentVideo {
    int id;
    float lungimeVideo;
    String urlVideo;
    String tipArgument; //pro sau contra

    public ArgumentVideo(int id, float lungimeVideo, String urlVideo, String tipArgument) {
        this.id = id;
        this.lungimeVideo = lungimeVideo;
        this.urlVideo = urlVideo;
        this.tipArgument = tipArgument;
    }

    public void post(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getLungimeVideo() {
        return lungimeVideo;
    }

    public void setLungimeVideo(float lungimeVideo) {
        this.lungimeVideo = lungimeVideo;
    }

    public String getUrlVideo() {
        return urlVideo;
    }

    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }

    public String getTipArgument() {
        return tipArgument;
    }

    public void setTipArgument(String tipArgument) {
        this.tipArgument = tipArgument;
    }
}
