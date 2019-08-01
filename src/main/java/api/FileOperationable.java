package api;

import model.File;

public interface FileOperationable {
    String getFullPath();
    int computeCountFile();
    double computeSize(File file);
}
