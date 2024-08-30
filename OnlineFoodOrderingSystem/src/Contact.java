class Contact {
    private long id;
    private Address address;
    private String emailId;
    private String mobileNo;

    public Contact(long id, Address address, String emailId, String mobileNo) {
        this.id = id;
        this.address = address;
        this.emailId = emailId;
        this.mobileNo = mobileNo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }



    // Constructors, getters, setters

}
