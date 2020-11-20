package controlselection.month;

public class DayInMonth {




    public String dayInTheMonth(String nameOfMonth) {

        nameOfMonth.toLowerCase();
        String numberOfDayInMonth;

        switch (nameOfMonth){
            case "január":
            case "március":
            case "május":
            case "július":
            case "augusztus":
            case "október":
            case "december":
                numberOfDayInMonth = "Ez a hónap 31 napos!";
                break;

            case "április":
            case "június":
            case "szeptember":
            case "november":
                numberOfDayInMonth = "Ez a hónap 30 napos!";
                break;

            case "február":
                numberOfDayInMonth = " Szökőévtől föggően 28 vagy 29 napos ";
                break;
            default:
                throw new IllegalArgumentException("Invalid month: " + nameOfMonth);
        }

            return  numberOfDayInMonth;

    }


    }


