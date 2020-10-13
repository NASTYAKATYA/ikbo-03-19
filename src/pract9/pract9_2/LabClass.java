package pract9.pract9_2;

public class LabClass {
    final private LabClassUI labClassUI;

    public LabClass() {
        this.labClassUI = new LabClassDriver();
    }

    public LabClassUI getClassUi() {
        return labClassUI;
    }

    @Override
    public String toString() {
        return labClassUI.toString();
    }
}
