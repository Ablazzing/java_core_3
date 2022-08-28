package org.lessons.lesson2;

public class HomeworkExpert {
    private final static String OPEN_TAG = "<data>";
    private final static String CLOSE_TAG = "</data>";
    private final static String DELIMITER = ";";
    private final static String EMAIL_SYMBOL = "@";
    private final static String MASKING_SYMBOL = "*";
    private final static String DOT_SYMBOL = ".";
    private final static String NUMBERS = "0123456789";

    private final static String FULL_NAME_DELIMITER = " ";

    public static void main(String[] args) {
        //Экспертный уровень
        //Задача №1
        //Создать метод маскирования персональных данных, который:
        //Телефон (до/после маскирования): 79991113344 / 7999***3344
        //Email (до/после маскирования): test@yandex.ru / tes*@******.ru, my_mail@gmail.com / my_mai*@*****.com
        //Фио (до/после маскирования): Иванов Иван Иванович / И****в Иван И.
        //
        //Входящие параметры: String text
        //Возвращаемый результат: String
        //
        //Примеры возможного текста:
        //<client>(Какие то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client> - "<client>(Какие то данные)<data>7999***3344;tes*@******.ru;И****в Иван И.</data></client>"
        //<client>(Какие то данные)<data></data></client> - вернет тоже (никаких ошибок)
        //<client>(Какие то данные)<data>Иванов Иван Иванович;79991113344</data></client> - "<client>(Какие то данные)<data>И****в Иван И.;7999***3344</data></client>"

        //String before = "<client>(Какие то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client>";
        //<client>(Какие то данные)<data>7999***3344;tes*@******.ru;И****в Иван И.</data></client>
        String before = "<client>(Какие то данные)<data>Иванов Иван Иванович;79991113344</data></client>";
        String after = masking(before);
        System.out.println(after);
    }

    public static String masking(String text) {
        int indexStartData = text.indexOf(OPEN_TAG) + OPEN_TAG.length();
        int indexEndData = text.indexOf(CLOSE_TAG, indexStartData);

        if ((indexEndData - indexStartData) > 0) {
            String result = "";
            String clientData = text.substring(indexStartData, indexEndData);
            for (String field: clientData.split(DELIMITER)) {
                if (field.contains(EMAIL_SYMBOL)) {
                    result += maskingEmail(field);
                } else if (NUMBERS.contains(field.substring(0, 1))) {
                    result += maskingPhoneNumber(field);
                } else {
                    result += maskingFullName(field);
                }
            }
            result = result.substring(0, result.length() - 1);
            return text.replaceAll(clientData, result);
        }

        return text;
    }

    public static String maskingFullName(String field) {
        int lastNameStartIndex = field.indexOf(FULL_NAME_DELIMITER);
        int firstNameEndIndex = field.indexOf(FULL_NAME_DELIMITER,lastNameStartIndex + 1 );
        return new StringBuilder()
                .append(field.charAt(0))
                .append(MASKING_SYMBOL.repeat(lastNameStartIndex - 2))
                .append(field, lastNameStartIndex - 1, lastNameStartIndex + 1)
                .append(field, lastNameStartIndex + 1, firstNameEndIndex)
                .append(field, firstNameEndIndex, firstNameEndIndex + 2)
                .append(DOT_SYMBOL)
                .append(DELIMITER)
                .toString();
    }

    public static String maskingPhoneNumber(String field) {
        return new StringBuilder()
                .append(field, 0, 4)
                .append(MASKING_SYMBOL.repeat(3))
                .append(field.substring(7))
                .append(DELIMITER)
                .toString();
    }

    public static String maskingEmail(String field) {
        int emailSymbolIndex = field.indexOf(EMAIL_SYMBOL);
        int endDomainIndex = field.indexOf(DOT_SYMBOL, emailSymbolIndex);
        return new StringBuilder()
                .append(field, 0, emailSymbolIndex - 1)
                .append(MASKING_SYMBOL)
                .append(EMAIL_SYMBOL)
                .append(MASKING_SYMBOL.repeat(endDomainIndex - emailSymbolIndex - 1))
                .append(field.substring(endDomainIndex))
                .append(DELIMITER)
                .toString();
    }
}
