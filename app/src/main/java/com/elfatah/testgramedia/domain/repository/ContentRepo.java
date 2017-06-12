package com.elfatah.testgramedia.domain.repository;

import com.elfatah.testgramedia.domain.model.Content;

import java.util.ArrayList;
import java.util.List;

import rx.Observable;

/**
 * Created by elfatahwashere on 6/12/2017.
 */

public interface ContentRepo {
    Observable<List<Content>> getAllContent();
}
