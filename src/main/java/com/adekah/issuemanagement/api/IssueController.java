package com.adekah.issuemanagement.api;


import com.adekah.issuemanagement.dto.IssueDto;
import com.adekah.issuemanagement.service.impl.IssueServiceImpl;
import com.adekah.issuemanagement.util.ApiPaths;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(ApiPaths.IssueController.CTRL)
@Api(value = ApiPaths.ProjectController.CTRL, description = "Issue APIs")
public class IssueController {

    private final IssueServiceImpl issueServiceImpl;

    public IssueController(IssueServiceImpl issueServiceImpl) {
        this.issueServiceImpl = issueServiceImpl;
    }


    @GetMapping("/{id}")
    @ApiOperation(value="Get By Id Operation",response = IssueDto.class)
    public ResponseEntity<IssueDto> getById(@PathVariable(value = "id", required = true) Long id) {
        IssueDto issueDto = issueServiceImpl.getById(id);
        return ResponseEntity.ok(issueDto);
    }

    @PostMapping
    @ApiOperation(value="Create Issue Operation",response = IssueDto.class)
    public ResponseEntity<IssueDto> createProject(@Valid @RequestBody IssueDto issue) {
        return ResponseEntity.ok(issueServiceImpl.save(issue));
    }

    // @RequestMapping(path = "/update",method = RequestMethod.PUT) Böyle de yazılabilir.
    @PutMapping("/{id}")
    @ApiOperation(value="Update Issue Operation",response = IssueDto.class)
    public ResponseEntity<IssueDto> updateProject(@PathVariable(value = "id", required = true) Long id, @RequestBody IssueDto issue) {
        return ResponseEntity.ok(issueServiceImpl.update(id, issue));
    }
    @DeleteMapping("/{id}")
    @ApiOperation(value="Delete Issue Operation",response = boolean.class)
    public ResponseEntity<Boolean> delete(@PathVariable(value = "id", required = true) Long id) {
        return ResponseEntity.ok(issueServiceImpl.delete(id));
    }


}
