package com.elfatah.testgramedia.presentation.ui.activities;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;

import com.elfatah.testgramedia.R;
import com.elfatah.testgramedia.domain.model.Content;
import com.elfatah.testgramedia.presentation.presenters.ContentPresenter;
import com.elfatah.testgramedia.presentation.presenters.ContentPresenterImpl;
import com.elfatah.testgramedia.presentation.ui.fragments.ContentFragment;
import com.elfatah.testgramedia.presentation.ui.view.FlipPageViewTransformer;
import com.elfatah.testgramedia.storage.repository.ContentRepo;
import com.trello.rxlifecycle.components.support.RxAppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import app.num.numandroidpagecurleffect.PageCurlView;
import butterknife.BindView;
import butterknife.ButterKnife;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends RxAppCompatActivity {
    @BindView(R.id.viewPager)
    ViewPager viewPager;

    private SectionsPagerAdapter sectionsPagerAdapter;
    private ContentPresenter contentPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setUpAdapter();
        setUpPresenter();
        setUpViewPager();
        loadData();
    }

    private void setUpAdapter() {
        sectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
    }

    private void loadData() {

        contentPresenter.getAllContent()
                .compose(bindToLifecycle())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<List<Content>>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(List<Content> contents) {
                        sectionsPagerAdapter.setContentList(contents);
                    }
                });
    }

    private void setUpPresenter() {
        contentPresenter = new ContentPresenterImpl(new ContentRepo.ContentRepoImpl());
    }

    private void setUpViewPager() {
        viewPager.setPageTransformer(false, new FlipPageViewTransformer());
        viewPager.setAdapter(sectionsPagerAdapter);
    }

    public class SectionsPagerAdapter extends FragmentStatePagerAdapter {
        List<Content> contentList = new ArrayList<>();

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }


        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            super.destroyItem(container, position, object);
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            return super.instantiateItem(container, position);
        }


        @Override
        public Fragment getItem(int position) {
            return ContentFragment.newInstance(contentList.get(position), "");
        }

        @Override
        public int getCount() {
            return contentList.size();
        }


        public void setContentList(List<Content> contentList) {
            this.contentList = contentList;
            this.notifyDataSetChanged();

        }
    }
}
