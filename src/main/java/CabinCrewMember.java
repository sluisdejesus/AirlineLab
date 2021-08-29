public class CabinCrewMember extends Person{

    private CrewRank crewRank;

    public CabinCrewMember(String name, CrewRank crewRank) {
        super(name);
        this.crewRank = crewRank;
    }
}
