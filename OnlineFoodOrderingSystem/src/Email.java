class Email {
    private long id;
    private String templateBody;

    public Email(long id, String templateBody) {
        this.id = id;
        this.templateBody = templateBody;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTemplateBody() {
        return templateBody;
    }

    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }

    // Constructors, getters, setters
}
