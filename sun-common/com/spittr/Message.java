package com.spittr;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-09-12 15:13
 */
public class Message {
    private String title;
    private String content;

    public Message(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
