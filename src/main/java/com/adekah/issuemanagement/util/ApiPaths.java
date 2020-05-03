package com.adekah.issuemanagement.util;

public final class ApiPaths {

    private static final String BASE_PATH = "/api";

    public static final class IssueController {
        public static final String CTRL = BASE_PATH + "/issue";
    }

    public static final class ProjectController {
        public static final String CTRL = BASE_PATH + "/project";
    }

    public static final class ProjectVersionedController {
        public static final String CTRL = BASE_PATH + "/project/versioning";
    }
}
