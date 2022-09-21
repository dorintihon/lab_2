//Dorin Tihon
public class Decade {
    private Year[] years;
    private int firstYear;

    public Decade(){
        years = new Year[10];
        firstYear = 0;
        tenYears();

    }

    public Decade(int year) {
        years = new Year[10];
        firstYear = year;
        tenYears();

    }

    public int getFirstYear() {
        return firstYear;
    }

    public void setFirstYear(int firstYear) {
        this.firstYear = firstYear;
    }

    public Year[] getYears() {
        return years;
    }

    public void setYears(Year[] years) {
        this.years = years;
    }

    public void printInfo(){
        String result = "";
        for(Year year: years){
            result = result + year.printInfo();
        }
        System.out.println(result);
    }
    private void tenYears(){
        for(int i=0; i<10; ++i){
            years[i] = new Year(firstYear + i);
        }
    }
}