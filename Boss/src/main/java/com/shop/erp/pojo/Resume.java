package com.shop.erp.pojo;

public class Resume {
    @Override
    public String toString() {
        return "Resume{" +
                "id=" + id +
                ", real_name='" + real_name + '\'' +
                ", intended_position='" + intended_position + '\'' +
                ", salary_expectation='" + salary_expectation + '\'' +
                ", skill='" + skill + '\'' +
                ", education='" + education + '\'' +
                ", project_experience='" + project_experience + '\'' +
                ", self_evaluation='" + self_evaluation + '\'' +
                '}';
    }

    private Integer id;

    private String real_name;

    private String intended_position;

    private String salary_expectation;

    private String skill;

    private String education;

    private String project_experience;

    private String self_evaluation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReal_name() {
        return real_name;
    }

    public void setReal_name(String real_name) {
        this.real_name = real_name == null ? null : real_name.trim();
    }

    public String getIntended_position() {
        return intended_position;
    }

    public void setIntended_position(String intended_position) {
        this.intended_position = intended_position == null ? null : intended_position.trim();
    }

    public String getSalary_expectation() {
        return salary_expectation;
    }

    public void setSalary_expectation(String salary_expectation) {
        this.salary_expectation = salary_expectation == null ? null : salary_expectation.trim();
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill == null ? null : skill.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getProject_experience() {
        return project_experience;
    }

    public void setProject_experience(String project_experience) {
        this.project_experience = project_experience == null ? null : project_experience.trim();
    }

    public String getSelf_evaluation() {
        return self_evaluation;
    }

    public void setSelf_evaluation(String self_evaluation) {
        this.self_evaluation = self_evaluation == null ? null : self_evaluation.trim();
    }
}