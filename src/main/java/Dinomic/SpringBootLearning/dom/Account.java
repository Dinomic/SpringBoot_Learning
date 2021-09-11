package Dinomic.SpringBootLearning.dom;

import javax.persistence.*;

@Entity
@Table(name = "ACCOUNT")
public class Account {

    @SequenceGenerator(name = "SEQ_ACCOUNT", sequenceName = "SEQ_ACCOUNT", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ACCOUNT")
    @Id
    private Long id;

    @Column(name = "ACCOUNT_NAME", nullable = false)
    private String name;

    @Column(name = "ACCOUNT_PASSWORD", nullable = false)
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
