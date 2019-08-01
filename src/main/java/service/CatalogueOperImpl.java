package service;

import api.CatalogueOperationable;
import model.Catalogue;

public class CatalogueOperImpl implements CatalogueOperationable {

    @Override
    public int computeCountCatalogues(Catalogue catalogue) {
        return 0;
    }

    @Override
    public void removeFileAndCatalogue(Catalogue catalogue) {

    }

    @Override
    public boolean replaceFilesAndCatalogue(Catalogue catalogue) {
        return false;
    }
}
