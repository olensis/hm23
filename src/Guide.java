import java.util.Objects;

public class Guide {
    private String name;
    private String soname;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guide guide = (Guide) o;
        return Objects.equals(name, guide.name) && Objects.equals(soname, guide.soname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, soname);
    }

    @Override
    public String toString() {
        return "Guide{" +
                "name='" + name + '\'' +
                ", soname='" + soname + '\'' +
                '}';
    }

    public Guide(String name, String soname) {
        this.name = name;
        this.soname = soname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSoname() {
        return soname;
    }

    public void setSoname(String soname) {
        this.soname = soname;
    }
}
