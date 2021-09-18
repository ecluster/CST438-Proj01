package com.example.cst438proj01;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * SearchResult --- program to represent the results of a search
 * @author    Edward Cluster
 */

public class SearchResult {

    // private variables
    @SerializedName("SearchResultItems")
    private List<SearchResultItem> searchResultItems = null;

    // getters
    /**
     * get a list of items from a search result
     * @return List<SearchResultItem>
     */
    public List<SearchResultItem> getSearchResultItems() {
        return searchResultItems;
    }

    // setters
    /**
     * set a list of items for a search result
     * @param searchResultItems An array list of SearchResultItem
     */
    public void setSearchResultItems(List<SearchResultItem> searchResultItems) {
        this.searchResultItems = searchResultItems;
    }
}
