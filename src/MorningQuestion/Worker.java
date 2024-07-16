package MorningQuestion;
// below is defining the variables and what kind of datatype they are.
public class Worker {
   public String name;
   public String dob;
   public String endDate;
   //below is using the constructor and also binding the variables highlighted below.
    public Worker(String name, String dob, String endDate) {
        this.name=name;
        this.dob=dob;
        this.endDate=endDate;
    }
    //below is using the all three methods below that were given to us.  getage(), collectpay(), and terminate(string)
    public int getAge(){
        String year = dob.substring(6,dob.length());
        int Year = Integer.parseInt(year);
        int currentYear = 2024;
        int age = currentYear - Year;
        return age;
    }
        }
