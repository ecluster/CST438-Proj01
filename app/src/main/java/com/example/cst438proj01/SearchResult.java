package com.example.cst438proj01;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SearchResult {

    // private variables
    @SerializedName("SearchResultItems")
    private List<SearchResultItem> searchResultItems = null;

    // getters
    public List<SearchResultItem> getSearchResultItems() {
        return searchResultItems;
    }

    // setters
    public void setSearchResultItems(List<SearchResultItem> searchResultItems) {
        this.searchResultItems = searchResultItems;
    }
}
