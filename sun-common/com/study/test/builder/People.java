package com.study.test.builder;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-24 14:03
 */
public class People {
    public People() {
    }

    public People(String head, String body, String foots, String hands) {
        this.head = head;
        this.body = body;
        this.foots = foots;
        this.hands = hands;
    }

    /**
     * head :
     * body :
     * foots :
     * hands :
     */

    private String head;
    private String body;
    private String foots;
    private String hands;

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getFoots() {
        return foots;
    }

    public void setFoots(String foots) {
        this.foots = foots;
    }

    public String getHands() {
        return hands;
    }

    public void setHands(String hands) {
        this.hands = hands;
    }

    @Override
    public String toString() {
        return "People{" +
                "head='" + head + '\'' +
                ", body='" + body + '\'' +
                ", foots='" + foots + '\'' +
                ", hands='" + hands + '\'' +
                '}';
    }
}
