package entrevista.IPSoft;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prueba {
    public void printLucasSequence(int intSeqLen) {
        printLucasSequence(intSeqLen, 0, 1);
    }

    public void printLucasSequence(int inSeqLen, int inFirstParam, int inSecondParam) {
        StringBuilder sb = new StringBuilder();
        sb.append(inFirstParam);
        sb.append(" ");
        sb.append(inSecondParam);
        sb.append(" ");
        for (int i = 0; i < inSeqLen - 2; i++) {
            int sum = inFirstParam + inSecondParam;
            inFirstParam = inSecondParam;
            inSecondParam = sum;
            sb.append(sum);
            sb.append(" ");
        }
        System.out.println(sb);
    }

    public void formatIdForRequest(String inID) {
        String parsed = inID;
        if (inID.length() > 10) {
            parsed = inID.substring(inID.length() - 10);
        }
        String sb = "0".repeat(10 - parsed.length()) + parsed;
        System.out.println(sb);
    }

    public Map<String, List<String>> getValidInvalidMap(List<String> inList) {
        var res = new HashMap<String, List<String>>();
        res.put("valid", new ArrayList<>());
        res.put("invalid", new ArrayList<>());
        for (String str: inList) {
            var div = str.split("-");
            if (div.length != 2) {
                res.get("invalid").add(str);
            } else {
                if (!Objects.equals(div[0], div[0].toUpperCase())) {
                    res.get("invalid").add(str);
                } else {
                    Pattern p = Pattern.compile("[0-9]+");
                    Matcher m = p.matcher(div[1]);
                    if (!m.matches()) {
                        res.get("invalid").add(str);
                    } else {
                        res.get("valid").add(str);
                    }
                }
            }
        }
        return res;
    }

    public void getDebtOfIds(Map<String, List<String>> inIdMap, Map<String, Float> inDebtMap) {
        for (String id: inIdMap.get("valid")) {
            if (!inDebtMap.containsKey(id)) {
                System.out.printf("%s might be a ghost customer!\n", id);
            } else {
                float debt = inDebtMap.get(id);
                if (debt <= 0) {
                    System.out.printf("%s looks like it's our lender :/ .\n", id);
                } else {
                    System.out.printf("%s owns us 45.3 millions of dollars.\n", id);
                }
            }
        }
    }
}

