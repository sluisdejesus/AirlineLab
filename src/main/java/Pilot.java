public class Pilot extends Person{

    private CrewRank crewRank;
    private String pilotLicenceNumber;

    public Pilot(String name, CrewRank crewRank, String pilotLicenceNumber) {
        super(name);
        this.crewRank = crewRank;
        this.pilotLicenceNumber = pilotLicenceNumber;
    }

    public CrewRank getCrewRank() {
        return crewRank;
    }

    public String getPilotLicenceNumber() {
        return pilotLicenceNumber;
    }
}
