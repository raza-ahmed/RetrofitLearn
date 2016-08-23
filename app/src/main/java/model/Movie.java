package model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ahmedraza on 23/08/16.
 */
public class Movie {
    @SerializedName("poster_path")
    private String posterPath;

    @SerializedName("adult")
    private boolean adult;

    @SerializedName("overview")
    private String overview;

    @SerializedName("release_date")
    private String releaseDate;

    @SerializedName("genre_ids")
    private List<Integer> genreIds = new ArrayList<Integer>();

    @SerializedName("id")
    private Integer id;

    @SerializedName("original_title")
    private String originalTitle;

    @SerializedName("original_language")
    private String originalLanguage;

    @SerializedName("Title")
    private String title;

    @SerializedName("backdrop_path")
    private String backdropPath;

    @SerializedName("popularity")
    private Double popularity;

    @SerializedName("vote_count")
    private Integer voteCount;

    @SerializedName("video")
    private Boolean video;

    @SerializedName("vote_average")
    private Double voteAverage;


    public Movie(String posterPath, boolean adult, String overview, String releaseDate, List<Integer> genreIds,
                 Integer id, String originalTitle, String originalLanguage, String title, String backdropPath,
                 Double popularity, Integer voteCount, Boolean video, Double voteAverage){

        this.posterPath =posterPath;
        this.adult = adult;
        this.overview = overview;
        this.releaseDate = releaseDate;
        this.genreIds = genreIds;
        this.id = id;
        this.originalTitle = originalTitle;
        this.originalLanguage= originalLanguage;
        this.title= title;
        this.backdropPath =backdropPath;
        this.popularity = popularity;
        this.voteAverage = voteAverage;
        this.voteCount =voteCount;
        this.video = video;

    }
    public String getPosterPath(){
        return posterPath;
    }

    public void setPosterPath(String posterPath){
        this.posterPath =posterPath;
    }
    public boolean isAdult(){
        return adult;
    }

    public void setAdult(boolean adult){
        this.adult=adult;
    }

    public String getOverview(){
        return overview;
    }

    public void setOverview(String overview){
        this.overview = overview;
    }
    public String getReleaseDate(){
        return releaseDate;
    }
    public void setReleaseDate(String releaseDate){
        this.releaseDate=releaseDate;
    }

}
