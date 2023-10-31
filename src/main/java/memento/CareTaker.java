package memento;

import lombok.Getter;

import java.util.Deque;
import java.util.LinkedList;

public class CareTaker {
    private final Deque<Project.Snapshot> snapshotHistory;
    @Getter
    private Project project;

    public CareTaker() {
        this.snapshotHistory = new LinkedList<>();
        this.project = new Project();
    }

    public void write(String version) {
        project.setVersionAndDate(version);
        snapshotHistory.push(project.save());
    }

    public void undo() {
        project.load(snapshotHistory.pop());
    }
}
