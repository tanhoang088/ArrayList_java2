public class Student {
    String id;
    String name;
    int age;
    String course;
    String address;
    String school;
    float mediumScore;
    String classification;

    public Student(String id, String name, int age, String course, String address, float mediumScore) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.address = address;
        this.mediumScore = mediumScore;
    }
    public Student(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public float getMediumScore() {
        return mediumScore;
    }

    public void setMediumScore(float mediumScore) {
        this.mediumScore = mediumScore;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }
    public void Input(){

    }
    public void DisplayDetail(){

    }
}
