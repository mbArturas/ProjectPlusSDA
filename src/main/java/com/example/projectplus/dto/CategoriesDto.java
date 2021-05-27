package com.example.projectplus.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor
@Getter
@ToString
public class CategoriesDto {

    private List<CategoryDto> trivia_categories;

    @NoArgsConstructor
    @Getter
    @ToString
    public static class CategoryDto {
        private int id;
        private String name;

        @JsonProperty("trivia_categories")
        private List<CategoryDto> categories;

    }
}
