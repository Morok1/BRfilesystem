package database;

import database.api.Database;
import lombok.Data;
import model.File;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@Data
public class MySql implements Database {
    private List<File> files = new LinkedList<>();

    @Override
    public boolean isEmpty() {
        return files.isEmpty();
    }

    @Override
    public List<File> getFilesByNameWithRegExp(Pattern pattern) {
        return null;
    }

    @Override
    public List<File> getTopNAtsize(int n) {
        List<File> files = this.getFiles();
        return files.stream().sorted(Comparator.comparing(File::getSize))
                .limit(n).collect(Collectors.toList());
    }

}
