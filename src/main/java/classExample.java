public class classExample {
    public  static  void  main(String[] args)
    {
        student s1 = new student();
        student s2 = new student(001, "Raj", 100, 90);
        s1.setID(121);
        s1.setAvg(65);
        s1.setName("Tejinder");
        s1.setMarks(85);
        System.out.println("************************************************");
        System.out.println(s1);
        System.out.println("grade of s1:"+s1.grade());
        System.out.println("************************************************");
        System.out.println(s2);
        System.out.println("grade of s2:"+s2.grade());

    }
}
