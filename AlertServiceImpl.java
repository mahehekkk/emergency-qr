public class AlertServiceImpl implements AlertService {

    @Override
    public void notifyFamily(Person person, FoundReport report) {
        FamilyMember fm = person.getProfile().getFamilyMember();

        System.out.println("ALERT SENT");
        System.out.println("Person Name: " + person.getName());
        System.out.println("Condition: " + person.getProfile().getCondition());
        System.out.println("Found by: " + report.getFinderName());
        System.out.println("Found at: " + report.getLocationFound());
        System.out.println("Contact " + fm.getName() +
                " (" + fm.getRelation() + ") at " + fm.getPhone());
    }
}
