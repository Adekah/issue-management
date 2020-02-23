package com.adekah.issuemanagement.service;

import com.adekah.issuemanagement.dto.IssueDto;
import com.adekah.issuemanagement.entity.Issue;
import com.adekah.issuemanagement.util.TPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IssueService {
    IssueDto save(IssueDto issue);

    IssueDto getById(Long id);

    TPage<IssueDto> getAllPageable(Pageable pageable);

    Boolean delete(IssueDto issue);
}
