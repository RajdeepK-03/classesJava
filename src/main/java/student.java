public class student {
    private int s_id;
    private String s_name;
    private double marks;
    private double avg;

    public student(int s_id, String s_name, double marks,double avg)
    {
        this.s_id = s_id;
        this.s_name = s_name;
        this.marks = marks;
        this.avg = avg;

    }
    public student()
    {
        this.s_id = 1;
        this.s_name = "deep";
        this.marks = 0;
        this.avg = 0;

    }
    public int getID()
    {
        return s_id;
    }
    public String getName()
    {
        return s_name;
    }
    public double getMarks()
    {
        return marks;
    }
    public double getAvg()
    {
        return avg;
    }

    public void setID(int id)
    {
        this.s_id = s_id;
    }
    public void setName(String s_name)
    {
        this.s_name = s_name;
    }
    public void setMarks(double marks)
    {
        this.marks = marks;
    }
    public void setAvg(double avg)
    {
        this.avg = avg;
    }
    public  String toString()
    {
        return "Student id:" +s_id+"\tName:"+s_name+"\t Marks:"+marks+"\t Average:"+avg;
    }
    public String grade()
    {
//        if(avg>=90)
//        return "A";
//        else if
        int m = (int) (avg/10);
        switch (m)
        {
            case 10: return "A+";
            case 9: return "A";
            case 8: return "B";
            case 7: return "C";
            case 6: return "D";
            default: return "F";

        }
    }

}