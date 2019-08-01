package database.api;

import model.File;

import java.util.List;
import java.util.regex.Pattern;

public interface Database {
    boolean isEmpty();

    List<File> getFilesByNameWithRegExp(Pattern pattern);

    List<File> getTopNAtsize(int n);
}
