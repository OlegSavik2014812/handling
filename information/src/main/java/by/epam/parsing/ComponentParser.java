package by.epam.parsing;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ComponentParser {
    public static List<String> parse(String line, String regex) {
        if (line == null || regex == null) {
            return new ArrayList<>();
        }
        List<String> list = new ArrayList<>();
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(line);
        while (m.find()) {
            list.add(m.group().replaceAll("\\s+", " ").trim());
        }
        return list;
    }
}
