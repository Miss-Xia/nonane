package meiyin.domain;

public class Authentication {
    private Long id;

    private Integer accountId;

    private String authType;

    private String authCredential;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType == null ? null : authType.trim();
    }

    public String getAuthCredential() {
        return authCredential;
    }

    public void setAuthCredential(String authCredential) {
        this.authCredential = authCredential == null ? null : authCredential.trim();
    }
}