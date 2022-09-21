import java.util.ArrayList;
import java.util.List;

public class Year {
    private Integer yearNum;
    private ArrayList<String> monthList;
    public Year(Integer yearNum) {
        this.yearNum = yearNum;

        monthList = new ArrayList<>();

        monthList.add("January");
        monthList.add("February");
        monthList.add("March");
        monthList.add("April");
        monthList.add("May");
        monthList.add("June");
        monthList.add("July");
        monthList.add("August");
        monthList.add("September");
        monthList.add("October");
        monthList.add("November");
        monthList.add("December");
    }

    public Integer getYearNum() {
        return yearNum;
    }

    public void setYearNum(Integer yearNum) {
        this.yearNum = yearNum;
    }

    public List<String> getMonthList() {
        return monthList;
    }

    public void setMonthList(ArrayList<String> monthList) {
        this.monthList = monthList;
    }

    public String printInfo() {
        String result = "\n";
        for(String month: monthList){
            result = result + month +" " + yearNum +"\n";
        }

        return result;
    }
}