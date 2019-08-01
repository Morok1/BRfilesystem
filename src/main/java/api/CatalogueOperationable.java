package api;

import model.Catalogue;

public interface CatalogueOperationable {
    int computeCountCatalogues(Catalogue catalogue);
    void removeFileAndCatalogue(Catalogue catalogue);
    boolean replaceFilesAndCatalogue(Catalogue catalogue);
}
