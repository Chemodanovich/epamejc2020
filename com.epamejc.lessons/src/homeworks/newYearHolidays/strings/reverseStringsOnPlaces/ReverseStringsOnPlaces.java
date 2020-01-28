package homeworks.newYearHolidays.strings.reverseStringsOnPlaces;

import homeworks.utility.helper.Helper;

class ReverseStringsOnPlaces {

    void run() {
        String input = Helper.getUserInput("Введите строку: ").trim();

        String[] strings = input.split(" ");
        String [] reversedStrings = getReversedStrings(strings);

        printStrings(reversedStrings);
        Helper.closeReader();
    }

    private String[] getReversedStrings(String[] strings) {
        String [] reversedStrings = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();

            stringBuilder.append(strings[i]);
            String s = stringBuilder.reverse().toString();

            reversedStrings[i] = s;
        }

        return reversedStrings;
    }

    private void printStrings(String[] reversedStrings) {
        for (String s : reversedStrings) {
            System.out.print(s);
            System.out.print(" ");
        }
    }
}
