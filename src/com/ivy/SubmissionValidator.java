package com.ivy;

public interface SubmissionValidator {
    public void validateSubmission(Submission submission) throws ValidationErrorException;
}
