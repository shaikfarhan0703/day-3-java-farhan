public class Udemy{
    public String getEnrollmentInfo(String platform, String course, String student){
        return "\nPlatform : " + platform + "\nCourse : " + course + "\nStudent : " + student;
    }
    public static void main(String[] args){
        Udemy udemy = new Udemy();
        System.out.println(udemy.getEnrollmentInfo("Udemy", "Java Programming", "Alice"));
        System.out.println("---------------------------------");
        System.out.println(udemy.getEnrollmentInfo("Udemy", "Web Development", "Bob"));
        System.out.println("---------------------------------");
    }
}