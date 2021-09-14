package com.example.cst438proj01;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class JobTest {

    @Test
    public void getPositionTitle() {

        MatchedObjectDescriptor matchedObjectDescriptor = new MatchedObjectDescriptor();
        matchedObjectDescriptor.setPositionTitle("Engineer");

        SearchResultItem searchResultItem = new SearchResultItem();
        searchResultItem.setMatchedObjectDescriptor(matchedObjectDescriptor);

        SearchResult searchResult = new SearchResult();
        List<SearchResultItem> searchResultItemList = new ArrayList<>();
        searchResultItemList.add(searchResultItem);
        searchResult.setSearchResultItems(searchResultItemList);

        int i = 0;

        Job job = new Job();
        job.setSearchResult(searchResult);

        assertEquals("Engineer", job.getPositionTitle(i));
    }

    @Test
    public void getPositionId() {

        MatchedObjectDescriptor matchedObjectDescriptor = new MatchedObjectDescriptor();
        matchedObjectDescriptor.setPositionID("000123");

        SearchResultItem searchResultItem = new SearchResultItem();
        searchResultItem.setMatchedObjectDescriptor(matchedObjectDescriptor);

        SearchResult searchResult = new SearchResult();
        List<SearchResultItem> searchResultItemList = new ArrayList<>();
        searchResultItemList.add(searchResultItem);
        searchResult.setSearchResultItems(searchResultItemList);

        int i = 0;

        Job job = new Job();
        job.setSearchResult(searchResult);

        assertEquals("000123", job.getPositionId(i));
    }

    @Test
    public void getLocationName() {

        PositionLocation positionLocation = new PositionLocation();
        List<PositionLocation> positionLocationList = new ArrayList<>();
        positionLocation.setLocationName("Salinas");
        positionLocationList.add(positionLocation);

        MatchedObjectDescriptor matchedObjectDescriptor = new MatchedObjectDescriptor();
        matchedObjectDescriptor.setPositionLocation(positionLocationList);

        SearchResultItem searchResultItem = new SearchResultItem();
        searchResultItem.setMatchedObjectDescriptor(matchedObjectDescriptor);

        SearchResult searchResult = new SearchResult();
        List<SearchResultItem> searchResultItemList = new ArrayList<>();
        searchResultItemList.add(searchResultItem);
        searchResult.setSearchResultItems(searchResultItemList);

        int i = 0;

        Job job = new Job();
        job.setSearchResult(searchResult);

        assertEquals("Salinas", job.getLocationName(i));
    }

}
