package com.adekah.issuemanagement.dto;

import com.adekah.issuemanagement.entity.IssueStatus;
import lombok.Data;

import java.util.Date;
@Data
public class IssueDto {
    private Long id;
    private String description;
    private Date date;
    private IssueStatus issueStatus;
    private UserDto assigne;
    private ProjectDto project;
}
