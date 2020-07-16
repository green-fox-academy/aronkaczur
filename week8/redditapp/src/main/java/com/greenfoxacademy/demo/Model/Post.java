package com.greenfoxacademy.demo.Model;


import com.greenfoxacademy.demo.Service.PostService;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;



@Entity
@Getter
@Setter
@NoArgsConstructor
public class Post {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String url;
    private Integer karma =0;
    private java.time.LocalDateTime timestamp;

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }


    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setKarma(Integer karma) {
        this.karma = karma;
    }

    public int getKarma() {
        return karma;
    }

    public void incraseKarma(){
        this.karma++;
    }
    public void declareKarma(){
        this.karma--;
    }



}
