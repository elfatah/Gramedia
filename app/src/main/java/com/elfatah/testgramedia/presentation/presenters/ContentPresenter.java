package com.elfatah.testgramedia.presentation.presenters;

import com.elfatah.testgramedia.domain.model.Content;

import java.util.List;

import rx.Observable;

/**
 * Created by elfatahwashere on 6/12/2017.
 */

public interface ContentPresenter {

    Observable<List<Content>> getAllContent();

}
