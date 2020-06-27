package com.adekah.issuemanagement.service;


import com.adekah.issuemanagement.dto.IssueHistoryDto;
import com.adekah.issuemanagement.dto.IssueUpdateDto;
import com.adekah.issuemanagement.entity.Issue;
import com.adekah.issuemanagement.entity.IssueHistory;
import com.adekah.issuemanagement.util.TPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IssueHistoryService {

    IssueHistoryDto save(IssueHistoryDto issueHistory);

    IssueHistoryDto getById(Long id);

    List<IssueHistoryDto> getByIssueId(Long id);

    TPage<IssueHistoryDto> getAllPageable(Pageable pageable);

    Boolean delete(IssueHistoryDto issueHistory);

    void addHistory(Long id, Issue issue);
}
