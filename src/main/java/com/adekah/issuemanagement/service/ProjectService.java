package com.adekah.issuemanagement.service;

import com.adekah.issuemanagement.dto.ProjectDto;
import com.adekah.issuemanagement.entity.Project;
import com.adekah.issuemanagement.entity.User;
import com.adekah.issuemanagement.util.TPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProjectService {

    ProjectDto save(ProjectDto project);

    ProjectDto getById(Long id);

    ProjectDto getByProjectCode(String projectCode);

    List<ProjectDto> getByProjectCodeContains(String projectCode);

    TPage<ProjectDto> getAllPageable(Pageable pageable);

    Boolean delete(ProjectDto project);

    ProjectDto update(Long id, ProjectDto project);
}
