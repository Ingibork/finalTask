package school;

public class Theme {
    String nameTheme;
    String whoTeacher;

    public Theme(String nameTheme, String whoTeacher) {
        this.nameTheme = nameTheme;
        this.whoTeacher = whoTeacher;
    }

    public String getNameTheme() {
        return nameTheme;
    }

    public void setNameTheme(String nameTheme) {
        this.nameTheme = nameTheme;
    }

    public String getWhoTeacher() {
        return whoTeacher;
    }

    public void setWhoTeacher(String whoTeacher) {
        this.whoTeacher = whoTeacher;
    }
}
