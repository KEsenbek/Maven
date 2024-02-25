package models;

public class F1DataManagementSystem {
    private int totalTeams;
    private String teamType;
    private String teamName;
    private String teamRole;
    private String representativeTitle;
    private String representativeName;
    private String team1Name;
    private String team2Name;

    public F1DataManagementSystem(int totalTeams, String teamType, String teamName, String teamRole, String representativeTitle, String representativeName, String team1Name, String team2Name) {
        this.totalTeams = totalTeams;
        this.teamType = teamType;
        this.teamName = teamName;
        this.teamRole = teamRole;
        this.representativeTitle = representativeTitle;
        this.representativeName = representativeName;
        this.team1Name = team1Name;
        this.team2Name = team2Name;
    }

    public int getTotalTeams() {
        return totalTeams;
    }

    public void setTotalTeams(int totalTeams) {
        this.totalTeams = totalTeams;
    }

    public String getTeamType() {
        return teamType;
    }

    public void setTeamType(String teamType) {
        this.teamType = teamType;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamRole() {
        return teamRole;
    }

    public void setTeamRole(String teamRole) {
        this.teamRole = teamRole;
    }

    public String getRepresentativeTitle() {
        return representativeTitle;
    }

    public void setRepresentativeTitle(String representativeTitle) {
        this.representativeTitle = representativeTitle;
    }

    public String getRepresentativeName() {
        return representativeName;
    }

    public void setRepresentativeName(String representativeName) {
        this.representativeName = representativeName;
    }

    public String getTeam1Name() {
        return team1Name;
    }

    public void setTeam1Name(String team1Name) {
        this.team1Name = team1Name;
    }

    public String getTeam2Name() {
        return team2Name;
    }

    public void setTeam2Name(String team2Name) {
        this.team2Name = team2Name;
    }
}
