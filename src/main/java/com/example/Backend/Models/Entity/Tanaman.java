package com.example.Backend.Models.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tanaman")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tanaman {
    @Id
    private String id;
    private String Title;
    private  String Harga;
    private  String URL;
    private String[] Category;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getHarga() {
        return Harga;
    }

    public void setHarga(String harga) {
        Harga = harga;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String[] getCategory() {
        return Category;
    }

    public void setCategory(String[] category) {
        Category = category;
    }
}
