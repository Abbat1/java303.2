package MorningQuestion;

public class HourlyEmployee extends Worker{

    public HourlyEmployee(String name, String dob, String endDate) {
        super(name, dob, endDate);

        /* super is what's refrencing from the parent class.
        this is needed to keep the similarities with each child class from the parent.*/
    }
}
