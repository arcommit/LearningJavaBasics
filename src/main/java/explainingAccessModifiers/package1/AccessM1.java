package explainingAccessModifiers.package1;

//date month and year information
public class AccessM1 {
    // default,
    int date = 4;
    int dateThisYear = 4;
    int month = 12;

//    // public
//    public int date = 4;
//    public int month = 12;
//
//    // private
//    private int date = 4;
//    private int month = 12;

    //protected
//    protected int date = 4;
//    protected int month = 12;
//
//

    public int getDate() {
        return date;
    }

    public int getMonth() {
        return month;
    }

//    public int getDatethisyear() {
//        return datethisyear;
//    }
//
//    public void setDatethisyear(int datethisyear) {
//        this.datethisyear = datethisyear;
//    }


    public int getDateThisYear() {
        return dateThisYear;
    }

    public void setDateThisYear(int dateThisYear) {
        this.dateThisYear = dateThisYear;
    }
}
