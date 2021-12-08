package sample.model;

public class Contato {

    private String wats;
    private String email;
    private String twiter;

    public String getTwiter() {
        return twiter;
    }
    public void setTwiter(String twiter) {
        this.twiter = twiter;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getWats() {
        return wats;
    }
    public void setWats(String wats) {
        this.wats = wats;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "wats='" + wats + '\'' +
                ", email='" + email + '\'' +
                ", twiter='" + twiter + '\'' +
                '}';
    }
}
