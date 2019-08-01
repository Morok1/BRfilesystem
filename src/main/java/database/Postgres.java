package database;

import database.api.Database;
import model.File;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Postgres implements Database {
    private List<File> files = new ArrayList<>();

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
        return null;
    }
}
