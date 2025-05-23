
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Menstrual {
private String startDate;
private int cycle

public void setStartDate(String startDate){
this.startDate = startDate;
}

public String getStartDate{
return startDate;
}

public void setCycle(int cycle){
this.cycle = cycle;
}

public int getDate(){
return getDate;
}
    
   DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public String nextFlowDate() {
        LocalDate periodStartTime = LocalDate.parse(getStartDate(), date);
      
        LocalDate nextFlowDate = periodStartTime.plusDays(getCycle());

        return nextFlowDate.format(date) 

    }
