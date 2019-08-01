package model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Catalogue {
    private Catalogue parent;
    private String name;
    private List<File> files;
    private List<Catalogue> catalogues;


}

