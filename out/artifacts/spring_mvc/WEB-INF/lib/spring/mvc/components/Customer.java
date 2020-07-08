package spring.mvc.components;


import javax.validation.constraints.*;

public class Customer {

    private String firstName;

    //@NotNull(message = "may not be Null")
    @Size(min = 2, message = "is required")
    @NotBlank(message = "is required")
    private String lastName;

    @Min(
            value= 1,
            message = "must be greater than or equal to 1"
    )
    @Max(
            value=10,
            message = "must be less than or equal 10"
    )
    private int freePasses;

    @Pattern(
            regexp = "^[a-zA-Z0-9]{5}",
            message = "only 5 chars/digits"
    )
    private String postalCode;

    @CourseCode
    private String courseCode;

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(int freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
