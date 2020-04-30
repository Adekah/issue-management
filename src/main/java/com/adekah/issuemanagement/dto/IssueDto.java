package com.adekah.issuemanagement.dto;

import com.adekah.issuemanagement.entity.IssueStatus;
import com.adekah.issuemanagement.entity.Project;
import com.adekah.issuemanagement.entity.User;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IssueDto {
    @ApiModelProperty(value = "Issue Id",readOnly = true)
    private Long id;

    @ApiModelProperty(value="Issue Description",required = true)
    private String description;

    @ApiModelProperty(value="Issue Details")
    private String details;

    @ApiModelProperty(value="Issue Create Date",required = true)
    private Date date;

    @ApiModelProperty(value="Issue Status",required = true)
    private IssueStatus issueStatus;

    @ApiModelProperty(value="Issue Assignee")
    private UserDto assignee;

    @ApiModelProperty(value="Issue Project",required = true)
    private ProjectDto project;
}
