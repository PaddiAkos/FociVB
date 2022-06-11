package hu.progmatic;

public class Matches {

    private int year;
    private String stage;
    private String date;
    private String team_b;
    private String team_a;
    private int goals_a;
    private int goals_b;
    private int penA;
    private int penB;

    public Matches(){
    }

    public Matches(String csvSor){
        String[] adatok = csvSor.split(";");
       if (adatok.length > 7){
           this.year = Integer.parseInt(adatok[0]);
           this.stage = adatok[1];
           this.date = adatok[2];
           this.team_a = adatok[3];
           this.team_b = adatok[4];
           this.goals_a = Integer.parseInt(adatok[5]);
           this.goals_b = Integer.parseInt(adatok[6]);
           this.penA = Integer.parseInt(adatok[7]);
           this.penB = Integer.parseInt(adatok[8]);
       }
       else this.year = Integer.parseInt(adatok[0]);
        this.stage = adatok[1];
        this.date = adatok[2];
        this.team_a = adatok[3];
        this.team_b = adatok[4];
        this.goals_a = Integer.parseInt(adatok[5]);
        this.goals_b = Integer.parseInt(adatok[6]);
        this.penA = 0;
        this.penB = 0;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTeam_b() {
        return team_b;
    }
    public void setTeam_b(String team_b) {
        this.team_b = team_b;
    }

    public String getTeam_a() {
        return team_a;
    }

    public void setTeam_a(String team_a) {
        this.team_a = team_a;
    }

    public int getGoals_a() {
        return goals_a;
    }

    public void setGoals_a(int goals_a) {
        this.goals_a = goals_a;
    }

    public int getGoals_b() {
        return goals_b;
    }

    public void setGoals_b(int goals_b) {
        this.goals_b = goals_b;
    }

    public int getPenA() {
        return penA;
    }

    public void setPenA(int penA) {
        this.penA = penA;
    }

    public int getPenB() {
        return penB;
    }

    public void setPenB(int penB) {
        this.penB = penB;
    }
}
