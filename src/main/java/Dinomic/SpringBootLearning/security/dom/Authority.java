package Dinomic.SpringBootLearning.security.dom;


import Dinomic.SpringBootLearning.security.enums.Role;

import javax.persistence.*;

@Entity
@Table(name = "AUTHORITIES")
public class Authority {

    @SequenceGenerator(name = "SEQ_AUTHORITIES", sequenceName = "SEQ_AUTHORITIES", allocationSize = 100)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_AUTHORITIES")
    @Column(name = "AUTHORITY_ID", nullable = false)
    @Id
    private Long authorityId;

    @Enumerated(EnumType.STRING)
    @Column(name = "AUTHORITY", nullable = false)
    private Role name = Role.ROLE_USER;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="ACCOUNT_ID", nullable=false)
    private Account account;

    public Authority() {
    }

    public Long getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(Long authorityId) {
        this.authorityId = authorityId;
    }

    public Role getName() {
        return name;
    }

    public void setName(Role name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
