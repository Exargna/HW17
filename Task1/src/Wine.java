import java.time.LocalDate;
import java.time.Period;

public class Wine {
    private String name;
    private String mark;
    private String country;
    private String description;
    private LocalDate period;

    public Wine() {
    }

    public Wine(String name, String mark, String country, String description, LocalDate period) {
        this.name = name;
        this.mark = mark;
        this.country = country;
        this.description = description;
        this.period = period;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getPeriod() {
        return period;
    }

    public void setPeriod(LocalDate period) {
        this.period = period;
    }
    public void winePeriod(LocalDate now) {
        int years = Period.between(period, now).getYears();

        System.out.println("Выдержка вина составляет " + years + " лет");

    }
}
