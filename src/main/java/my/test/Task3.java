package my.test;

public class Task3 {

    public static Integer equationSolution(String inputString) {
        if (!isOnlyDigits(inputString)) return null;
        String[] elements = replaseSolution(inputString);
        if (isLastElementAnCorrect(elements[elements.length - 1])) return null;
        return equation(elements);
    }

    private static boolean isOnlyDigits(String solution) {
        return solution.matches("[\\s\\d+-]+");
    }

    private static String[] replaseSolution(String solution) {
        return solution.replaceAll(" ", "")
                .replaceAll("\\+", ";+;")
                .replaceAll("-", ";-;")
                .replaceAll(";;", ";")
                .split(";");
    }

    private static boolean isLastElementAnCorrect(String element) {
        return element.equals("+") || element.equals("-");
    }

    private static Integer equation(String[] elements) {
        Integer value;
        Integer result = 0;
        boolean minusSign = false;
        for (String element : elements) {
            if (element.isEmpty()) {
                continue;
            } else if (element.equals("-")) {
                minusSign = !minusSign;
                continue;
            } else if (element.equals("+")) {
                continue;
            } else {
                try {
                    value = Integer.valueOf(element);
                } catch (NumberFormatException nfe) {
                    System.err.println("Error parsing String to Integer. " + nfe.getMessage());
                    return null;
                }
                if (minusSign) {
                    value *= (-1);
                    minusSign = false;
                }
                result += value;
            }
        }
        return result;
    }
}