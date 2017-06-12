package com.elfatah.testgramedia.domain.interactor;

import com.elfatah.testgramedia.storage.repository.ContentRepo;

import rx.Observable;

/**
 * Created by elfatahwashere on 6/12/2017.
 */

public class GetAllContentInteractorImpl implements ObservableInteractor {
    private ContentRepo contentRepo;

    public GetAllContentInteractorImpl(ContentRepo contentRepo) {
        this.contentRepo = contentRepo;
    }

    @Override
    public Observable execute() {
        return contentRepo.getAllContent();
    }
}
