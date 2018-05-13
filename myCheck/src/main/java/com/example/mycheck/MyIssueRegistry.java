package com.example.mycheck;
import com.android.tools.lint.client.api.IssueRegistry;
import com.android.tools.lint.detector.api.Issue;
import java.util.Collections;
import java.util.List;

//Cette classe contient les "issues" qui seront vérifiées
public class MyIssueRegistry extends IssueRegistry {
    @Override
    public List<Issue> getIssues() {
        return Collections.singletonList(MyDetector.ISSUE);
    }
}
