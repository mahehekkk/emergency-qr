public class FoundReport {
    private String finderName;
    private String locationFound;

    public FoundReport(String finderName, String locationFound) {
        this.finderName = finderName;
        this.locationFound = locationFound;
    }

    public String getFinderName() {
        return finderName;
    }

    public String getLocationFound() {
        return locationFound;
    }
}
