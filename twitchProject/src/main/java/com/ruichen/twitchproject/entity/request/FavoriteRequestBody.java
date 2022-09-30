package com.ruichen.twitchproject.entity.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ruichen.twitchproject.entity.db.Item;

public class FavoriteRequestBody {
    @JsonProperty("favorite")
    private Item favoriteItem;

    public Item getFavoriteItem() {
        return favoriteItem;
    }
}
