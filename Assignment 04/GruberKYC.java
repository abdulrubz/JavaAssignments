import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class GruberKYC {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyy");

    public Date addDays(Date date, int days) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, days);
        date = calendar.getTime();
        return date;
    }

    public String parseDatesAndFindRange(String signUp, String current) throws ParseException {
        Date signUpDate = simpleDateFormat.parse(signUp);
        Date currentDate = simpleDateFormat.parse(current);
        if(signUpDate.after(currentDate)) {
            return "No range";
        } else {
            return findRange(signUpDate, currentDate);
        }
    }

    @SuppressWarnings("deprecation")
    public String findRange(Date signUpDate, Date currentDate) throws ParseException {
        signUpDate.setYear(currentDate.getYear());
        Date KYCStartDate = addDays(signUpDate, -30);
        Date KYCEndDate = addDays(signUpDate, 30);
        String startDateKYCString = simpleDateFormat.format(KYCStartDate);
        String endDateKYCString = simpleDateFormat.format(KYCEndDate);
        String currentDateString = simpleDateFormat.format(currentDate);

        if(currentDate.after(KYCStartDate) && currentDate.before(KYCEndDate)) {
            return startDateKYCString + " " + currentDateString;
        } else {
            return startDateKYCString + " " + endDateKYCString;
        }
    }

}
