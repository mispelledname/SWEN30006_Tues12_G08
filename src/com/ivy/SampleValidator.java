package com.ivy;
import java.io.FileNotFoundException;

public class SampleValidator implements SubmissionValidator{
    private String INCORRECT_FILES_MESSAGE = "Submission Invalid: Please attach at least one file.";

    @Override
    public void validateSubmission(Submission submission) throws ValidationErrorException{

        // submission must include a file
        if (submission.getNumFiles() == 0) {
            throw new ValidationErrorException(INCORRECT_FILES_MESSAGE);
        }

    }
}
