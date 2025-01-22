package day3.collect.task3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Document doc1 = new Document(1, "резюме  Андрей Алексеевич", 50);
        Document doc2 = new Document(2, "резюме Петров П.И.", 1);

        List<Document> documents = Arrays.asList(doc1, doc2);
        DocumentOrganizer res = new DocumentOrganizer();
        System.out.println(res.organizeDocuments(documents));
    }
}
