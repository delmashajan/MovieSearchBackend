package com.backend.movie_search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api/movies")

public class MovieController {

    @Value("${tmdb.api.key}")
    private String tmdbApiKey;



    private static final String TMDB_API_KEY = "cace0c353fee67b88061c2938f6fb205";
        private static final String TMDB_API_URL = "https://api.themoviedb.org/3";

        @Autowired
        private RestTemplate restTemplate;

        @GetMapping("/search")
        public ResponseEntity<List<Movie>> searchMovies(@RequestParam("query") String query) {
            String url = TMDB_API_URL + "/search/movie?api_key=" + TMDB_API_KEY + "&query=" + query;
            ResponseEntity<MovieApiResponse> response = restTemplate.getForEntity(url, MovieApiResponse.class);
            if (response.getStatusCode() == HttpStatus.OK) {
                MovieApiResponse apiResponse = response.getBody();
                if (apiResponse != null) {
                    return ResponseEntity.ok(apiResponse.getResults());
                }
            }
            return ResponseEntity.notFound().build();
        }
    }

