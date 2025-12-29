public class EmergencyProfile {
    private String condition;
    private String lastKnownLocation;
    private FamilyMember familyMember;

    public EmergencyProfile(String condition, String lastKnownLocation, FamilyMember familyMember) {
        this.condition = condition;
        this.lastKnownLocation = lastKnownLocation;
        this.familyMember = familyMember;
    }

    public String getCondition() {
        return condition;
    }

    public String getLastKnownLocation() {
        return lastKnownLocation;
    }

    public FamilyMember getFamilyMember() {
        return familyMember;
    }
}
