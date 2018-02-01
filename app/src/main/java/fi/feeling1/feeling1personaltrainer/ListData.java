package fi.feeling1.feeling1personaltrainer;

/**
 * Created by it15 on 31.1.2018.
 */

public class ListData {

    private String title,description;

    public ListData(){

    }

    public ListData(String title, String description)
    {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
