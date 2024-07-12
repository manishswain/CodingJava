package Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

public class Solution6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Document doc[] = new Document[4];
        for (int i = 0; i < 4; i++) {
            int id = Integer.parseInt(sc.nextLine());
            String title = sc.nextLine();
            String folderName = sc.nextLine();
            int pages = Integer.parseInt(sc.nextLine());
            doc[i] = new Document(id, title, folderName, pages);
        }
        Document[] res = docsWithOddPages(doc);
        for (Document temp : res) {
            System.out
                    .println(temp.getId() + " " + temp.getTitle() + " " + temp.getFolderName() + " " + temp.getPages());
        }

    }

    private static Document[] docsWithOddPages(Document[] doc) {
        Stream<Document> stream = Arrays.stream(doc);
        Document res[] = stream.filter(x -> x.getPages() % 2 != 0).sorted(Comparator.comparing(Document::getId))
                .toArray(Document[]::new);
        if (res.length != 0)
            return res;
        else
            return null;
    }
}

class Document {
    private int id;
    private String title;
    private String folderName;
    private int pages;

    public Document(int id, String title, String folderName, int pages) {
        this.id = id;
        this.title = title;
        this.folderName = folderName;
        this.pages = pages;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

}