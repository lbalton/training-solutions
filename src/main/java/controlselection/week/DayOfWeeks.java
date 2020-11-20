package controlselection.week;

import enumtype.week.Day;

public class DayOfWeeks {


    public String dayOfTheWeek(String nameOfDay){

        String weekPosition;

        switch (nameOfDay.toLowerCase()){
            case "hétfő":
                weekPosition = "Még csak a hét legeleje van. :( ";
        break;

            case "kedd":
            case "szerda":
            case "csütörtök":
                weekPosition = "Már a hét közepe van! :| ";
        break;

            case "péntek":
                weekPosition = "Már mindjárt hétvége! :)";
        break;

            case "szombat":
            case "vasárnap":
                weekPosition = " Juhhu hétvége! :D";
        break;

            default: throw new IllegalArgumentException("Ismeretlen nap! ");
        }
            return weekPosition;


    }

    }

