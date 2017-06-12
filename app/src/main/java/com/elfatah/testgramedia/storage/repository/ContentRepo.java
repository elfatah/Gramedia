package com.elfatah.testgramedia.storage.repository;

import com.elfatah.testgramedia.domain.model.Content;

import java.util.ArrayList;
import java.util.List;

import rx.Observable;

/**
 * Created by elfatahwashere on 6/12/2017.
 */

public interface ContentRepo {
    Observable<List<Content>> getAllContent();


    class ContentRepoImpl implements ContentRepo {

        @Override
        public Observable<List<Content>> getAllContent() {
            List<Content> strings = new ArrayList<>();
            strings.add(new Content("Lorem ipsum 1"));
            strings.add(new Content("Lorem ipsum 2"));
            strings.add(new Content("Lorem ipsum 3"));
            strings.add(new Content("Lorem ipsum 4"));
            strings.add(new Content("Lorem ipsum 5"));
            strings.add(new Content("Lorem ipsum 6"));
            return Observable.just(strings);
        }
    }
}
