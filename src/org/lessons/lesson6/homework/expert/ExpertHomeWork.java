package org.lessons.lesson6.homework.expert;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.regex.Pattern;

public class ExpertHomeWork {

    public static void main(String[] args) {
        Map<Integer, Map<String, String[]>> data = GeneratorExpertHomework.getData();
        getSpecialNumbers(data);
        getSpecialNumbersStream(data);
    }
    // { 1 : {
    //      "out" : ["К474СЕ178"],
    //      "input": ["А222РТ178"]
    //    },
    //   2 : {
    //        "out" : ["К722АВ12", "А222РТ178"],
    //        "input" : ["М001АВ01", "А023РВ73"],
    //   }
    // ..
    //  }

    //["А222РТ178"], ["К474СЕ178"]
    //["К474СЕ178", "А222РТ178"]
    public static void getSpecialNumbers(Map<Integer, Map<String, String[]>> data) {
        Pattern pattern = Pattern.compile("М\\d{3}АВ");
        HashSet<String> specialNumbers = new HashSet<>();
        for (Map<String, String[]> regionData : data.values()) {
            for (String[] carNumbers : regionData.values()) {
                for (String carNumber : carNumbers) {
                    if (pattern.matcher(carNumber).find()) {
                        specialNumbers.add(carNumber);
                    }
                }
            }
        }
        System.out.println(specialNumbers.size());
    }

    public static void getSpecialNumbersStream(Map<Integer, Map<String, String[]>> data) {
        Pattern pattern = Pattern.compile("М\\d{3}АВ");
        HashSet<String> specialNumbers = new HashSet<>();
        data.forEach((key, value) -> value.values().stream()
                        .flatMap(regionStatistics -> Arrays.stream(regionStatistics))
                        .filter(carNumber -> pattern.matcher(carNumber).find())
                        .forEach(e -> specialNumbers.add(e))
            );
        System.out.println(specialNumbers.size());
    }
}
