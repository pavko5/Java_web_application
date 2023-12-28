package io.github.mat3e.lang;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity //reprezentacja tabeli jako klasa
@Table(name = "languages") //definiujemy nazwe tabeli
public class Lang { //DTO
    //strategia generowania Id
    @Id
    @GeneratedValue(generator = "inc")
    @GenericGenerator(name = "inc", strategy = "increment")

    private Integer id;
    @Column(name="welcomemsg")
    private String welcomeMsg;
    private String code;

    /**
     * Hibernate (JPA) needs it.
     */
    @SuppressWarnings("unused")
    Lang() {
    }

    public Lang(Integer id, String welcomeMsg, String code) {
        this.id = id;
        this.welcomeMsg = welcomeMsg;
        this.code = code;
    }

    public Integer getId() {
        return id;
    }

    public String getWelcomeMsg() {
        return welcomeMsg;
    }

    public void setWelcomeMsg(String welcomeMsg) {
        this.welcomeMsg = welcomeMsg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
