package com.adekah.issuemanagement.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "issue")
@Data
@NoArgsConstructor //constructor clası acmaya gerek kalmaması icin örn : public Issue(){}
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Issue extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "description", length = 1000)
    private String description;

    @Column(name = "details", length = 4000)
    private String details;

    @Column(name = "date")
    private Date date;

    @Column(name = "issuetatus")
    @Enumerated(EnumType.STRING)
    private IssueStatus issueStatus;

    @JoinColumn(name = "assigne_user_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private User assignee;

    @JoinColumn(name="project_id")
    @ManyToOne(optional = true,fetch = FetchType.LAZY)
    private Project project;
    // @ManyToOne --> bir cok ıssue bir tane user ile ilişkilendirilebilir.
    // FetchType.LAZY sadece assignee için getter metodu çağrıldığında datayı getirir. EAGER olsaydı sürekli getirecekti
}
