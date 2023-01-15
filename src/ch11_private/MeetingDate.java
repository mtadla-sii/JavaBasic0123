package ch11_private;

public class MeetingDate {
    private String title;
    private int month;
    private int year;

    public MeetingDate(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) throws Exception {
        if (month < 1 || month > 12) {
            throw new Exception("This number is not a month");
        }
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
