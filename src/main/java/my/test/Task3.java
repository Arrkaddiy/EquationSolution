package my.test;

public class Task3 {
    private static boolean minusSign;

    public static Integer equationSolution(String inputString) {
        Integer result = 0;
        String[] elements = inputString.replaceAll(" ", "")
                .replaceAll("\\+", ";+;")
                .replaceAll("-", ";-;")
                .replaceAll(";;", ";")
                .split(";");

        for (String element : elements) {
            if (element.isEmpty()) {
                continue;
            } else if (element.equals("-")) {
                minusSign = !minusSign;
                continue;
            } else if (element.equals("+")) {
                continue;
            } else {
                Integer value;
                try {
                    value = Integer.valueOf(element);
                } catch (NumberFormatException nfe) {
                    System.err.println(nfe.getMessage());
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
