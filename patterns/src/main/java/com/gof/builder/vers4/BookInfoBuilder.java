package com.gof.builder.vers4;

public interface BookInfoBuilder {
    BookInfoBuilder setAuthor(String author);

    BookInfoBuilder setName(String name);

    BookInfoBuilder setEdition(int edition);

    BookInfoBuilder setIndex(int index);

    BookInfo build();
}
