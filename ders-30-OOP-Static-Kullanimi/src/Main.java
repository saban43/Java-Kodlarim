
public class Main {
    public static void main(String[] args) {
        System.out.println("Online Örgenci: " + Student.howStudent());
        Student s1 = new Student("mustafa",220, 70);
        Student s2 = new Student("lütfullah",168,35);
        Student s3 = new Student("murat",426,60);

        System.out.println("Online Örgenci: " + Student.howStudent());
        s1.exit();
        System.out.println("Online Örgenci: " + Student.howStudent());

        int[] notlar = new int[3];
        notlar[0] = s1.point;
        notlar[1] = s2.point;
        notlar[2] = s3.point;

        System.out.println(Student.calculateOverall(notlar));
    }
}