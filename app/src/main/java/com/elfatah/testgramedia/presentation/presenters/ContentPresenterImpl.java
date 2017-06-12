package com.elfatah.testgramedia.presentation.presenters;

import com.elfatah.testgramedia.domain.interactor.GetAllContentInteractorImpl;
import com.elfatah.testgramedia.domain.model.Content;
import com.elfatah.testgramedia.domain.repository.ContentRepo;

import java.util.List;

import rx.Observable;

/**
 * Created by elfatahwashere on 6/12/2017.
 */

public class ContentPresenterImpl implements ContentPresenter {

    private ContentRepo contentRepo;

    public ContentPresenterImpl(ContentRepo contentRepo) {
        this.contentRepo = contentRepo;

    }

    @Override
    public Observable<List<Content>> getAllContent() {
        GetAllContentInteractorImpl getAllContentInteractor = new GetAllContentInteractorImpl(contentRepo);
        return getAllContentInteractor.execute();
    }
}
