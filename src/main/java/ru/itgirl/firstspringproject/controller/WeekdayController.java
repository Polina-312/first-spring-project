package ru.itgirl.firstspringproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeekdayController {
    @GetMapping("/weekday")
    public String getRussianWeekday(@RequestParam(value = "day") Weekday weekday){
        return weekday.getRussianName();
    }
    public enum Weekday{
        MONDAY("Понедельник"),
        TUESDAY("Вторник"),
        WEDNESDAY("Среда"),
        THURSDAY("Четверг"),
        FRIDAY("Пятница"),
        SATURDAY("Суббота"),
        SUNDAY("Воскресенье");
        private String russianName;
        Weekday(String russianName){
            this.russianName = russianName;
        }

        public String getRussianName() {
            return "Сегодня " + russianName + "!";
        }
    }
}
