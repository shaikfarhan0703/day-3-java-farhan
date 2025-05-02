public class Patient{
    public void printDetails(String hospitalName, String patientName, int age){
        System.out.println("hospitalName"+ hospitalName);
        System.out.println("patientname" + patientName);
        System.out.println("age " + age);
        
    }
    public static void main (String[] args){
        Patient Patient = new Patient();
        Patient.printDetails("City Care Hospital", "John Doe", 45);
        Patient.printDetails("City Care Hospital", "Emma Watson", 30);
    }
}
