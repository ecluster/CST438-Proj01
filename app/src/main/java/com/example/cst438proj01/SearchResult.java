package com.example.cst438proj01;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SearchResult {

    @SerializedName("SearchResultItems")
    private List<SearchResultItem> searchResultItems = null;

    public List<SearchResultItem> getSearchResultItems() {
        return searchResultItems;
    }
}
