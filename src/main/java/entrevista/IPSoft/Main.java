package entrevista.IPSoft;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Prueba prueba = new Prueba();
        prueba.printLucasSequence(8);
        prueba.printLucasSequence(4, 2, 3);
        prueba.formatIdForRequest("1234");
        prueba.formatIdForRequest("123456789");
        prueba.formatIdForRequest("12345678911");

        var inList = Arrays.asList("ABC-1234", "D4F4", "ZXY-0000", "123-ABCD", "65ad", "testing", "RTE-9876");
        var inDebtMap = new HashMap<String, Float>();
        inDebtMap.put("ABC-1234", -45F);
        inDebtMap.put("ZXY-0000", 45.3F);
        prueba.getDebtOfIds(prueba.getValidInvalidMap(inList), inDebtMap);
    }
}