package day3.collect.task3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DocumentOrganizer {
    public Map<Integer, Document> organizeDocuments(List<Document> documents) {
        Map<Integer, Document> result = new HashMap<>();
        for (Document document : documents) {
        result.put(document.id, document);
        }
        return result;
    }
}
