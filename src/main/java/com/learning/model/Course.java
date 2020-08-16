package com.learning.model;

public class Course {

    private int chapterCount;
    private String name;

    public Course(int chapterCount, String name) {
        this.chapterCount = chapterCount;
        this.name = name;
    }

    public int getChapterCount() {
        return chapterCount;
    }

    public void setChapterCount(int chapterCount) {
        this.chapterCount = chapterCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
