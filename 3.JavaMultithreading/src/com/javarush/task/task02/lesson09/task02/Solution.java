package com.javarush.task.task02.lesson09.task02;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* Формируем Where
Сформируйте часть запроса WHERE используя StringBuilder.
Если значение null, то параметр не должен попадать в запрос.
Пример:
{"name", "Ivanov", "country", "Ukraine", "city", "Kiev", "age", null}
Результат:
"name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'"
*/
public class Solution {

    public static StringBuilder getCondition(Map<String, String> params) {
        StringBuilder query = new StringBuilder();
        if (params == null || params.size() < 0)
            return query;
        for (Map.Entry pair : params.entrySet()) {
            if (pair.getKey() != null && pair.getValue() != null)
                query.append(" and ").append(pair.getKey()).append(" = '").append(pair.getValue()).append("'");
        }
        query.delete(0, 5);
        return query;
    }

    public static void main(String[] args) {
        Map<String, String> params = new LinkedHashMap<>();

        params.put("name", "Ivanov");
        params.put("county", "Ukraine");
        params.put("city", "Kiev");
        params.put("age", null);

        System.out.println(getCondition(params));
    }
}
