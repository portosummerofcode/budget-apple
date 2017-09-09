package com.budgetapple.pidrobe;

import com.budgetapple.pidrobe.core.clothes.Category;
import com.budgetapple.pidrobe.core.clothes.Item;
import com.budgetapple.pidrobe.core.clothes.Preset;
import com.budgetapple.pidrobe.core.newsfeed.NewsFeed;
import com.budgetapple.pidrobe.core.services.ForecastService;
import com.budgetapple.pidrobe.core.services.NewsService;
import com.budgetapple.pidrobe.core.utils.IO;
import com.budgetapple.pidrobe.core.weather.Forecast;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Miguel Cardoso on 09/09/2017.
 */
public class PiDrobe implements Serializable {

    private static PiDrobe instance;

    private ForecastService forecastService;

    private List<Item> allItems;

    private List<Category> allCategories;

    private List<Preset> allPresets;

    private PiDrobe() {
        bootUp();
    }

    public static PiDrobe getInstance() {
        if (instance == null) {
            instance = new PiDrobe();
        }

        return instance;
    }

    private void bootUp() {
        this.allItems = new LinkedList<>();
        this.allPresets = new LinkedList<>();
        this.allCategories = new LinkedList<>();
        this.forecastService = new ForecastService("f26768c8c6cae1724b64060af97ecff9","2735941");

        load();
    }

    private void load() {
        try {
            PiDrobe piDrobe = (PiDrobe) IO.readBinFile("temp");

            this.setAllCategories(piDrobe.allCategories);
            this.setAllItems(piDrobe.allItems);
            this.setAllPresets(piDrobe.allPresets);

        } catch (Exception e) {
            System.out.println("No configuration file found. New instance created.");
        }
    }

    public boolean addItem(Item item) {
        return this.allItems.add(item);
    }

    public boolean removeItem(Item item) {
        return this.allItems.remove(item);
    }

    public List<Item> getAllItems() {
        return allItems;
    }

    public void setAllItems(List<Item> allItems) {
        this.allItems = allItems;
    }

    public boolean addCategory(Category category) {
        return this.allCategories.add(category);
    }

    public boolean removeCategories(Category category) {
        return this.allCategories.remove(category);
    }

    public List<Category> getAllCategories() {
        return allCategories;
    }

    public void setAllCategories(List<Category> allCategories) {
        this.allCategories = allCategories;
    }

    public List<Preset> getAllPresets() {
        return allPresets;
    }

    public void setAllPresets(List<Preset> allPresets) {
        this.allPresets = allPresets;
    }

    public boolean addPreset(Preset preset) {
        return this.allPresets.add(preset);
    }

    public boolean removePreset(Preset preset) {
        return this.allPresets.remove(preset);
    }

    public Forecast getForecast() {
        return ForecastService.getForecast();
    }

    public NewsFeed getNewsFeed() {
        return NewsService.getNews();
    }
}
