package com.gof.builder.vers4;

public class BookInfo {
    private final String author;
    private final String name;
    private final int edition;
    private final int index;

    public BookInfo(String author, String name, int edition, int index) {
        this.author = author;
        this.name = name;
        this.edition = edition;
        this.index = index;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getEdition() {
        return edition;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public String toString() {
        return "BookInfo{" +
            "author='" + author + '\'' +
            ", name='" + name + '\'' +
            ", edition=" + edition +
            ", index=" + index +
            '}';
    }
}
