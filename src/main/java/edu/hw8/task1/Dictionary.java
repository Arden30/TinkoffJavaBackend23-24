package edu.hw8.task1;

import java.util.Map;

public class Dictionary {
    private Dictionary() {
    }

    private static final Map<String, String> DICTIONARY = Map.of(
        "личности", "Не переходи на личности там, где их нет",
        "оскорбления", "Если твои противники перешли на личные оскорбления, будь уверена — твоя победа не за горами",
        "глупый", "А я тебе говорил, что ты глупый? Так вот, я забираю свои слова обратно... Ты просто бог идиотизма.",
        "интеллект", "Чем ниже интеллект, тем громче оскорбления"
    );

    public static Map<String, String> getDictionary() {
        return DICTIONARY;
    }
}
