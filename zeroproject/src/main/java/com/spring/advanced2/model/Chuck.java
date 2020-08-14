package com.spring.advanced2.model;

public class Chuck {

    /**
     * icon_url : https://assets.chucknorris.host/img/avatar/chuck-norris.png
     * id : E1LWhaBuRCWjNr-O-KMbTw
     * url :
     * value : After meeting with Chuck Norris, iron man was referred to as the tin man!
     */

    private String icon_url;
    private String id;
    private String url;
    private String value;

    public String getIcon_url() {
        return icon_url;
    }

    public void setIcon_url(String icon_url) {
        this.icon_url = icon_url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
