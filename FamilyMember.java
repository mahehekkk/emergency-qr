public class FamilyMember {
    private String name;
    private String phone;
    private String relation;

    public FamilyMember(String name, String phone, String relation) {
        this.name = name;
        this.phone = phone;
        this.relation = relation;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getRelation() {
        return relation;
    }
}
