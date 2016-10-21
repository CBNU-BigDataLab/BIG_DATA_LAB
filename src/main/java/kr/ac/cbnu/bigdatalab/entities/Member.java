package kr.ac.cbnu.bigdatalab.entities;

/**
 * Created by PENHCHET on 10/21/2016.
 */
public class Member {

    private String id;
    private String studentId;
    private String name;
    private String gender;
    private String dateOfBirth;
    private String telephone;
    private String major;
    private String email;
    private String degree;
    private String company;
    private String department;
    private String sciNo;
    private String photo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSciNo() {
        return sciNo;
    }

    public void setSciNo(String sciNo) {
        this.sciNo = sciNo;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Member() {

    }

    public Member(String id, String studentId, String name, String gender, String dateOfBirth, String telephone, String major, String email, String degree, String company, String department, String sciNo, String photo) {
        this.id = id;
        this.studentId = studentId;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.telephone = telephone;
        this.major = major;
        this.email = email;
        this.degree = degree;
        this.company = company;
        this.department = department;
        this.sciNo = sciNo;
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", telephone='" + telephone + '\'' +
                ", major='" + major + '\'' +
                ", email='" + email + '\'' +
                ", degree='" + degree + '\'' +
                ", company='" + company + '\'' +
                ", department='" + department + '\'' +
                ", SciNo='" + sciNo + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }
}
