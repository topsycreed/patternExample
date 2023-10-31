package memento;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
public class Project {
    private String version;
    private Date date;

    public void setVersionAndDate(String version) {
        this.version = version;
        this.date = new Date();
        System.out.println("Setting new version: " + version);
    }

    public Snapshot save() {
        System.out.println("Saving current version to GitHub");
        return new Snapshot(version, date);
    }

    public void load(Snapshot snapshot) {
        System.out.println("Loading saved version from GitHub");
        this.version = snapshot.getVersion();
        this.date = snapshot.getDate();
    }

    @Override
    public String toString() {
        return "Project{" +
                "version='" + version + '\'' +
                ", date=" + date +
                '}';
    }

    @Getter
    public static class Snapshot {
        private final String version;
        private final Date date;

        private Snapshot(String version, Date date) {
            this.version = version;
            this.date = date;
        }
    }
}
