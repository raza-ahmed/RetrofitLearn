package model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ahmedraza on 24/08/16.
 */
public class MovieResponse {

    @SerializedName("page")
    private int page;

    @SerializedName("results")
    private List<Movie> results;

    @SerializedName("total_results")
    private int totalResults;

    @SerializedName("total_pages")
    private int totalPages;

    public int getPage(){
        return page;
    }
    public void setPage(int page){
        this.page = page;
    }

    public List<Movie> getResult(){
        return results;
    }
    public void setResult(List<Movie> result){
        this.results = result;
    }
    public int getTotalResults(){
        return totalResults;
    }
    public void setResults(int total_results){
        this.totalResults =total_results;
    }

    public int getTotalpages(){
        return totalPages;
    }
    public void setTotalpages(int totalPages){
        this.totalPages = totalPages;
    }

}
