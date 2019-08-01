package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class File {
    private Catalogue parent;
    private String name;
    private int size;
    private byte[] data;
}
